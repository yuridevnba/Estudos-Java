package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
	//	formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
	//	o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".	
	
	
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
		String employeeCsv = br.readLine(); // agora vai ler o nome e o salário.
		while (employeeCsv != null) {
		String[] fields = employeeCsv.split(",");// solução de baixo. posição 0 nome, posição 1 salary
		list.add(new Employee(fields[0], Double.parseDouble(fields[1])));// a dificuldade toda é adicionar na lista o nome, salary, mas td faz parte de um string,dessa forma é necessário recortar o string em dois.
		employeeCsv = br.readLine();
		} 
		Collections.sort(list);// colecctions não aceita ordenar a lista de funcionários, o método sorte não é aplicado a uma lista do tipo employes.
		for (Employee emp : list) {
		System.out.println(emp.getName() + ", " + emp.getSalary());
			//System.out.println(emp.getName().compareTo("zz")); teste
	      }
	        	}
		
		
		catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		}
	}	
		
}
