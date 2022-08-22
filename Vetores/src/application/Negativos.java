package application;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
		//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
		int positivo;
		int b;
		Scanner sc=new Scanner(System.in);
	 do{
	    	System.out.println("Quantos números vc quer digitar? Máximo=10 ");
			 positivo=sc.nextInt();
	 } while(positivo>10);
	    
           // int vett[]=new int[b];
			int vet[]=new int[positivo];
					
			for(int i=0;i<vet.length;i++) {
				System.out.println("Digite o "+i+"º número:");
				vet[i]=sc.nextInt();
			}
			System.out.println();
			System.out.println("número negativos: ");	
			for(int i=0;i<vet.length;i++) {
				if(vet[i]<0) {
					//for(int vet1:vet) {
					System.out.println(vet[i]);	
					}
				}

	}

}
