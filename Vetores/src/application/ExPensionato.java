package application;

import java.util.Scanner;

import entities.Pensionato;


public class ExPensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A dona de um pensionato possui dez quartos para alugar para estudantes,
		/// sendo esses quartos identificados pelos números 0 a 9.
		// Fazer um programa que inicie com todos os dez quartos vazios, e depois
		// leia uma quantidade N representando o número de estudantes que vão
		// alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		// N estudantes. Para cada registro de aluguel, informar o nome e email do
		// estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		// que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		// um relatório de todas ocupações do pensionato, por ordem de quarto,
		// conforme exemplo

		Scanner sc = new Scanner(System.in);
		System.out.println(" quantas pessoas vão alugar os quartos?[0:10]");
		int m = sc.nextInt();

		Pensionato[] quartos = new Pensionato[10];

		for (int i = 1; i <= m; i++) {
			System.out.println("Rent# " + i + ":");

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Email: ");
			// sc.nextLine();
			String email = sc.nextLine();

			System.out.println("Número do Quarto: ");
			int numeroquarto = sc.nextInt();

			quartos[numeroquarto] = new Pensionato(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {

				System.out.println(i + ": " + quartos[i]);
			}
		}

	}

}
