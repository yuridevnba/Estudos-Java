package application;

import java.util.Scanner;

import entities.ObjectService2;
import entities.PrintService;

public class main2 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		ObjectService2 ps = new ObjectService2();

		System.out.print("How many values? ");
		int n = sc.nextInt();
           
		
		
		ps.addValue("Maria"); // tipe safety, segurança de tipos.
		
		for (int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x =(Integer) ps.first();
		System.out.println("First: " + ps.first());
         
		sc.close();
	}
}
