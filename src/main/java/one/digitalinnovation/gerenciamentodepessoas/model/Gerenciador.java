package one.digitalinnovation.gerenciamentodepessoas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

@Entity
@Table(name = "tb_gerenciador")
public class Gerenciador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "O atributo nome é obrigatório!")
	private String nome;

	//adicionar um atributo tipo instanciado de "Tipo.class"
	@NotNull(message = "O atributo setor é obrigatório!")
	private int setor;
	
	@NotBlank(message = "O atributo Email é Obrigatório!")
	@Email()
	private String email;

	@NotBlank(message = "O atributo Senha é Obrigatória!")
	@Size(min = 8, max = 30, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;

	@OneToMany(mappedBy = "gerenciador",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("gerenciador")
	private List<Funcionario> funcionario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
}
