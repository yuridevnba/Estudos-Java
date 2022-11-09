package InterfaceComparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import InterfaceComparableEntities.Employee;

public class InterfaceComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
				//linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
				//ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
		
		
		List<Employee>list=new ArrayList<>();
		 String path="C:\\temp\\in.txt";
		
		
		 try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			 
		String employeecsv=br.readLine();
		
		while(employeecsv!=null) {
			
			String[] corte= employeecsv.split(",");
			list.add(new Employee(corte[0],Double.parseDouble(corte[1])));
			employeecsv=br.readLine();
		}
		Collections.sort(list);
		
		for(Employee emp:list) {
			System.out.println(emp.getName()+","+emp.getSalary());
		}
		
		
		
		
		
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			 System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
