package one.digitalinnovation.gerenciamentodepessoas.util;

import one.digitalinnovation.gerenciamentodepessoas.model.Funcionario;

public class FuncionarioCreator {

    public static Funcionario createFuncionarioToBeSaved(){
        Funcionario f = new Funcionario();
        f.setNome("Luccas");
        return f;
    }
}
