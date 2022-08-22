package application;

import java.util.Scanner;

public class excecao1contato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1();
		System.out.println("End of program");
		
		
	}
	public static void method1() {
		System.out.println("**** METHOD1 START ***********");
		method2();
		System.out.println("**** METHOD1 END ***********");
	}
	
public static void method2() {
	System.out.println("**** METHOD2 START ***********");
	Scanner sc= new Scanner(System.in);
	
	try {
		
		
		String [] vect = sc.nextLine().split(" ");
		
		int position= sc.nextInt();
		
		System.out.println(vect[position]);
	}
	
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid position! ");
		e.printStackTrace(); // imprimir na tela o rastreamento do stack, ou seja, a sequência de chamada de gerou a exceção.
		//sc.next();
		
		
		}
	catch(java.util.InputMismatchException e) {
		System.out.println("Input error");
		
		
	}
	sc.close();
	System.out.println("********* METHOD2 END ***********");
}
}
