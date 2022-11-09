package Exceção1contato;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		method1();
		System.out.println("THE END PROGRAM!");
		
	}	
	public static void method1() {
		System.out.println("***************************START METHOD1*********************");
		method2();
		System.out.println("***************************FINISH METHOD1*********************");
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("***************************START METHOD2*********************");
		try {
		
	String vet[]=sc.nextLine().split(" ");
	
		
	int position=sc.nextInt();
	
		System.out.println(vet[position]);
	}
		
	catch(ArrayIndexOutOfBoundsException e)	{
		//System.out.println(e.getMessage());
		System.out.println("position invalid");
		e.printStackTrace();
		
	}
		
		catch(InputMismatchException e)	{
			System.out.println("imput error");
			
		}
		System.out.println();
		System.out.println("***************************FINISH METHOD2*********************");
		
		}
	
	}


