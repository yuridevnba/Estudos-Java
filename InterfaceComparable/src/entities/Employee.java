package entities;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private Double salary;
	
	
	public Employee(String name, Double salary) {
	this.name = name;
	this.salary = salary;
	}
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
	this.name = name;
	}
	
	public Double getSalary() {
	return salary;
	}
	
	public void setSalary(Double salary) {
	this.salary = salary;
	}
        // método compareTo da classe comparable, e precisa implementar em employee tb.
	// esse método serve pra comparar um objeto com o outro. a classe comparable diz que a classe x é comparável com a classe y, o método vai implementar essa comparação.
	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		
		return salary.compareTo(other.getSalary()); // retorna o nome compara com o outro funcionário, dessa forma vai comparar os seus nomes.
	}
	// salary se quiser comparar com salário.
}
