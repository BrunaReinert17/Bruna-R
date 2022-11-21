package Modelo;

public class Pessoa {

	private String nome;
	private String sexo;
	private String email;
	private String numeTelefone;

	public Pessoa(String nome,String sexo, String email,String numeTelefone) {
		this.nome = nome;
		this.sexo = sexo;
		this.email = email;
		this.numeTelefone = numeTelefone;
	}
	
	public Pessoa() {
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeTelefone() {
		return numeTelefone;
	}

	public void setNumeTelefone(String numeTelefone) {
		this.numeTelefone = numeTelefone;
	}
}

