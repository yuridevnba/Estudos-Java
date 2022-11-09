package entities;

public  abstract class Assistente extends Funcionario {
	//a.) crie a classe Assistente, que também é um funcionário, e que possui um número de
			//matrícula (faça os métodos GET e SET). Sobrescreva o método exibeDados().
	private Double matricula;
	
	public Assistente(String name, Double salario,Double matricula) {
		super(name, salario);
		this.matricula=matricula;
		// TODO Auto-generated constructor stub
	}
	public Double getMatricula() {
		return matricula;
	}
	public void setMatricula(Double matricula) {
		this.matricula = matricula;
	}
 @Override
public String exibirDados() {
	 
	// TODO Auto-generated method stub
	return super.exibirDados()
			+"\n Matrícula: " +getMatricula()+"\n ";
			
			
	
}

 
}
