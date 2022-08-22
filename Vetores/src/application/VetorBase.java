package application;

import java.util.Locale;
import java.util.Scanner;

public class VetorBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas vão participar do teste?");
       int  n=sc.nextInt();
		double vet[]=new double[n];// a variavel vai receber a instanciação do vetor.
		
		for(int i=0;i<n;i++) {
			vet[i]=sc.nextDouble();
			System.out.println(vet[i]);
		}
		
		double soma=0.0;
		for(int i=0;i<n;i++) {
		
		soma+=vet[i];
			
	}
 double media =soma/n;
 System.out.printf("media da alturas %.2f%n ",media);
 sc.close();
}
}


