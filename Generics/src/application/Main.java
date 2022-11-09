package application;

import java.util.Scanner;

import entities.GenericsService2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Deseja-se fazer um programa que leia uma quantidade N, e depois N números
		//inteiros. Ao final, imprima esses números de forma organizada conforme
		//exemplo. Em seguida, informar qual foi o primeiro valor informado.
		
		
		Scanner sc = new Scanner(System.in);
           
		
		 GenericsService2 <String> ps= new GenericsService2<>();
		//var ps = new ObjectService2();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		//ps.addValue("Yuri"); // Type Service, agora não deixa instanciar um tipo string só tipos inteiros.
		
		
		
		for (int i = 0; i < n; i++) {
			
			//Integer value = sc.nextInt();
			String value = sc.next();
			ps.addValue(value);
		}
          
		//ps.addValue("Yuri");// é aceitado pq o addValue aceita qualquer objeto do tipo Object.
		// vai ter o problema da segurança de tipos. TYPE SAFETY
		
	
		ps.print();
		
		//Integer x = ps.first(); // n é necessário o cast(Integer)
		System.out.println("First: " + ps.first()); // dá o último valor.

		sc.close();
	}
}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
