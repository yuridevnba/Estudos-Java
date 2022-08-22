package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class ProgramaPrincipalex1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		
		 Locale.setDefault(Locale.US);
			Scanner sc= new Scanner(System.in);
			
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); /// criar um formato de exibição de datas.
			
			System.out.println("Enter department's name:");
			String departmentName=sc.nextLine();
			
			System.out.println("Enter worker data:");
			System.out.println("Name: ");
			String workerName=sc.nextLine();
			
			
			
			System.out.println("Level: ");
			String workerLevel=sc.nextLine();
			
			
			System.out.println("Base salary: ");
			double baseSalary=sc.nextDouble();
			
			
			var worker= new Worker(workerName,WorkerLevel.valueOf(workerLevel) ,baseSalary ,new Department(departmentName)) ;
				
			// instanciou um objeto worker, que vai ter os parâmetros 
			//(String name, WorkerLevel level, Double baseSalary, Department department)
			// nome, uma instancia d WorkerLevel passando como parametro workerLevel,baseSalary,associado ao objeto worker vai ter outro objeto(composição) do tipo departamento e passando como parâmetro o nome que foi digitado.
			
			
			System.out.println("How many contracts to this worker?");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++) {
				System.out.println("Enter contract "+ "#"+i+ "data:");
				System.out.println("Date (DD/MM/YYYY):");
				java.util.Date contractDate= sdf.parse(sc.next()); // a leitura pode dar uma exceção por isso deu o erro, que foi corrigido com o throws ParseException {
				System.out.println("Value per hour:");
				double valuePerHour=sc.nextDouble();
				System.out.println("Duration (hours):");
				int hours=sc.nextInt();
				HourContract contract= new HourContract(contractDate, valuePerHour,hours );
				worker.addContract(contract); // associar o contrato digitado  a lista.
			}
			
			
			System.out.println();
			System.out.println("Enter month and year to calculate income (MM/YYYY):");
			String monthAndYear = sc.next();
			int month =Integer.parseInt( monthAndYear.substring(0,2)); // recortou o string na posição 0 a 1, mas sempre precisa colocar uma casa a mais, por isso o 2, depois converteu para Int.
			int year=Integer.parseInt(monthAndYear.substring(3));
			
			System.out.println("NAME: "+worker.getName());
			System.out.println("DEPARTMENT: "+worker.getDepartment().getName());
			System.out.println("INCOME FOR: "+ monthAndYear+": "+String.format("%.2f", worker.income(year, month)));
			
			
			
			
		
		
	}

}
