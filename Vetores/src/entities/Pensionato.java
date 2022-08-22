package entities;

public class Pensionato {

	public String nome;
	public String email;
	
	
	public Pensionato() {
		
	}
	
	
	public Pensionato(String nome, String email) {
		//super();
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String toString() {
	return  nome+" "
			+email;
	
	
	}
}


