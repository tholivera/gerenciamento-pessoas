package one.digitalinnovation.gerenciamentodepessoas.repository;

import one.digitalinnovation.gerenciamentodepessoas.model.Funcionario;
import one.digitalinnovation.gerenciamentodepessoas.util.FuncionarioCreator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;


@DataJpaTest
@DisplayName("Test for FuncionarioRepositorys")
class FuncionarioRepositoryTest {


    @Autowired
    private FuncionarioRepository funcionarioRepository;


    @Test
    @DisplayName("Saved Persist Funcionario when Success")
    public void save_persistFuncionario_whenSuccessFull(){
        Funcionario funcionario = FuncionarioCreator.createFuncionarioToBeSaved();
        Funcionario saveFuncionario = this.funcionarioRepository.save(funcionario);
        Assertions.assertThat(saveFuncionario).isNotNull();
        Assertions.assertThat(saveFuncionario.getId()).isNotNull();
        Assertions.assertThat(saveFuncionario.getNome()).isEqualTo(saveFuncionario.getNome());
    }

    @Test
    @DisplayName("Saved updates Funcionario when Success")
    public void save_updateFuncionario_whenSuccessFull(){
        Funcionario funcionario = FuncionarioCreator.createFuncionarioToBeSaved();
        Funcionario saveFuncionario = this.funcionarioRepository.save(funcionario);
        saveFuncionario.setNome("Luiz Miguel");
        Funcionario funcionarioUpdate = this.funcionarioRepository.save(saveFuncionario);
        Assertions.assertThat(saveFuncionario).isNotNull();
        Assertions.assertThat(saveFuncionario.getId()).isNotNull();
        Assertions.assertThat(saveFuncionario.getNome()).isEqualTo(saveFuncionario.getNome());
    }

    @Test
    @DisplayName("Delete removes Funcionario when Success")
    public void delete_removesFuncionario_whenSuccessFull(){
        Funcionario funcionario = FuncionarioCreator.createFuncionarioToBeSaved();
        Funcionario saveFuncionario = this.funcionarioRepository.save(funcionario);
        this.funcionarioRepository.delete(saveFuncionario);
        Optional<Funcionario> funcionarioOptional =
                this.funcionarioRepository.findById(saveFuncionario.getId());
        Assertions.assertThat(funcionarioOptional.isEmpty());
    }

}