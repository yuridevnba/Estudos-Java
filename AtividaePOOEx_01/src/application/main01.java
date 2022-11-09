package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AssistenteAdm;
import entities.AssistenteTécnico;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Implemente a classe Funcionario com nome, salario e os métodos
		//addAumento(double valor), ganhoAnual() e exibeDados() - imprime os valores do funcionário.
		
		//a.) crie a classe Assistente, que também é um funcionário, e que possui um número de
		//matrícula (faça os métodos GET e SET). Sobrescreva o método exibeDados().
		
		//b.) sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes
		//Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes
		//Tecnico e Administrativo e sobrescreva o método ganhoAnual() de ambas as classes
		//(Administrativo e Tecnico).
		
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		System.out.println("---------------------------------------------");
		System.out.println("ASSISTENTE TÉCNICO:");
		
		/////////DADOS  A.TÉCNICO ////////////////
		/////////////////////////////
		
		
		String nome="ana";
		Double salario=1000.00;
		Double matricula=14.0;
		Double taxa=10.0;
		 Double bonusSalarial=200.0;
		 
		 ///// INSTANCIAÇÃO////////
		 /////////////////////////
		 
		var ass= new AssistenteTécnico(nome, salario, matricula,bonusSalarial);

		System.out.println(ass.exibirDados()+" Salário Com Aumento:"+ass.addAumento(taxa));
		
		////// DADOS A.ADM//////////
		///////////////////////////
		System.out.println("---------------------------------------------");
		System.out.println("ASSISTENTE ADM: ");
		String nomee="yuri";
		Double salarioo=1000.00;
		Double matriculaa=12.0;
		Double taxaa=10.0;
		String turno="noite";
		var adm= new AssistenteAdm(nomee, salarioo, matriculaa,turno);
		System.out.println(adm.exibirDados()+adm.addAumento(taxa));
		
		
		
		
	}

}
