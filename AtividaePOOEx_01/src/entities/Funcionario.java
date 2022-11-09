package entities;

public abstract class Funcionario {
	// Implemente a classe Funcionario com nome, salario e os métodos
	// addAumento(double valor), ganhoAnual() e exibeDados() - imprime os valores do
	// funcionário.

	private String name;
	private Double salario;
	private static Double meses_ano = 12.0;

	public Funcionario(String name, Double salario) {
		// super();
		this.name = name;
		this.salario = salario;
	}

	public Double addAumento(double valor) {
		return salario + (salario * valor / 100);
	}

	public Double ganhoAnual() {
		return salario * meses_ano;

	}

	public String exibirDados() {
		return "-------------------Exibir Dados------------------------- \n" + " \n Funcionário: " + name
				+ "  \n   Salário: " + salario
				// +"Salário com Aumento: "+addAumento()
				+ " \n   Ganho Anual: " + ganhoAnual();
				
	}

}
