package entities;

public class AssistenteAdm extends Assistente{
  private String turno;
  private static Double adicionalNoturno=200.0;
  
	public AssistenteAdm(String name, Double salario, Double matricula,String turno) {
		super(name, salario, matricula);
		this.turno=turno;
	}
	@Override
		public Double ganhoAnual() {
			if(turno=="noite") {
				
			
			return super.ganhoAnual()*adicionalNoturno;
			}
			return super.ganhoAnual();
}
}
//b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes
//Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes
//Tecnico e Administrativo e sobrescreva o método ganhoAnual() de ambas as classes
//(Administrativo e Tecnico).