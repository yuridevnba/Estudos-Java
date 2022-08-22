package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductVetorBase2;

public class VetorBase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("número produtos: ");
		int n=sc.nextInt();
		
		 ProductVetorBase2[]vet=new ProductVetorBase2[n];
		
		
		 for(int i=0;i<vet.length;i++) {
			 sc.nextLine();
			 System.out.println("nome do produto");
			 String name= sc.nextLine();
			 System.out.println("preco do produto");
			 double price=sc.nextDouble();
			 vet[i]=new ProductVetorBase2(name,price);// estânciar o novo produto, q foi criado com o construtor e o vect[i] vai apontar para o novo objeto.
		 }
		
		double sum=0.0;
		 for(int i=0;i<n;i++) {
			 System.out.println("a média de todos os valores digitados");
		sum+=vet[i].getPrice();

		
   
	}
		 double resultado =sum/n;
		 System.out.printf(" Average price =%.2f%n",resultado);
		 sc.close();
		

		
	}

}
