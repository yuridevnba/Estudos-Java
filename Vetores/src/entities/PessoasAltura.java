package entities;

public class PessoasAltura {
	private double altura;
	private String Nome;
	private int idade;
	
	
	public PessoasAltura() {
		
	}
	
	public PessoasAltura( String nome,double altura, int idade) {
		super();
		this.altura = altura;
		Nome = nome;
		this.idade = idade;
		//Nºpessoas = nºpessoas;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	//public int getNºpessoas() {
		//return Nºpessoas;
	//}



//	public void setNºpessoas(int nºpessoas) {
		//Nºpessoas = nºpessoas;
	//}
	
	public String toString() {
		//return "Nome: "+ getNome()
				//+ "Altura: "+getAltura()
		return "Idade: "+getIdade();
		
				
	//}
	
	
	
	
	//public double media() {double soma=0.0; // o vetor não existe na classe.
	//for (int i=0;i<vet.length;i++) {
		//soma+=vet[i].getAltura();
	//System.out.println(soma);
		
		//return 0;
	//}
	
	
	
	
	
	
	}
	
	
}


