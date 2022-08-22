package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>(); // um trabalhador tem vários contratos, instanciou por padrão com o arraysList. 
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {

		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		// sem a lista.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	//public void setContracts(List<HourContract> contracts) {
		//this.contracts = contracts;
	//}
	public void addContract(HourContract contract) {
		contracts.add(contract); // adicionar na lista o contrato que veio como argumento.
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);// dois métodos responsáveis por fazer e desfazer a associação de um contrato com um funcionário.
	
		
	}
	public double income(int year,int month) {
		double sum=baseSalary; // soma a basesalary, mais os contratos que pertence a o mês e ano.
		Calendar cal=Calendar.getInstance();
		for (HourContract c:contracts) {
			cal.setTime(c.getDate()); // a data do contrato vai ser igual a data do calendário.
			//sum+= c.totalValue(); // o valor de todos os contratos.
			int c_year= cal.get(Calendar.YEAR) ;           // como pegar o ano e o mês do contrato vigente.// pegou o ano daquela data.
			int c_month= 1+cal.get(Calendar.MONTH); // acrescentou mais um, pq o mês no calendar, começa com zero
			if(year==c_year && month == c_month) {
				sum+= c.totalValue();
				
			}
			
		}
		return sum;
	}
}

	
	
	
	
	
	
	
	
	
	

