package application;

import java.util.Scanner;

import entities.PrintService;

public class main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Deseja-se fazer um programa que leia uma quantidade N, e depois N números
				//inteiros. Ao final, imprima esses números de forma organizada conforme
				//exemplo. Em seguida, informar qual foi o primeiro valor informado.
				
		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		System.out.println("First: " + ps.first());

		sc.close();
	}
}