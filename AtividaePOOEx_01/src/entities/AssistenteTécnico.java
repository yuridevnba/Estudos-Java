package entities;

public class AssistenteTécnico  extends Assistente{
	
	private Double bonusSalarial;
	
	public AssistenteTécnico( String name, Double salario, Double matricula,Double bonusSalarial) {
		super(name, salario, matricula);
		this.bonusSalarial=bonusSalarial;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Double ganhoAnual() {
		// TODO Auto-generated method stub
		return super.ganhoAnual()+bonusSalarial;
	}

	
	
}
//b.) sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes
	//Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes
	//Tecnico e Administrativo e sobrescreva o método ganhoAnual() de ambas as classes
	//(Administrativo e Tecnico).