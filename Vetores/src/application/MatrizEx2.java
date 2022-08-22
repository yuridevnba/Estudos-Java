package application;

import java.util.Scanner;

public class MatrizEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fazer um programa para ler dois números inteiros M e N, e depois ler
				//uma matriz de M linhas por N colunas contendo números inteiros,
				//podendo haver repetições. Em seguida, ler um número inteiro X que
				//pertence à matriz. Para cada ocorrência de X, mostrar os valores à
				//esquerda, acima, à direita e abaixo de X, quando houver, conforme
				//exemplo.
				
		Scanner sc=new Scanner (System.in);
				
				System.out.println("digite um número para as linhas da matriz N:");
				 int n=sc.nextInt();
				 System.out.println("digite um número para as colunas da matriz N:");
				int m=sc.nextInt();
				
				 int mat[][]= new int[n][m];
				int  cont =0;
				 
				 for(int i=0;i<mat.length;i++) {  // linha
					 for (int j =0; j < mat[i].length; j++) { // coluna
					 
					 mat[i][j]= sc.nextInt();
					 }
					 }
					 
				System.out.println("digite o número procurado: ");
				int num=sc.nextInt();
				 for(int i=0;i<mat.length;i++) {  // linha
					 for (int j =0; j < mat[i].length; j++) { // coluna
					 
			
				
				
				if(mat[i][j]==num) {
					System.out.println("position: "+i+","+j+":");
					
					if(j<mat[i].length-1) {
					System.out.println("Right: "+mat[i][j+1]);
				}
					if(j>0) {
					System.out.println("Left: "+mat[i][j-1]);
					}
					if(i>0) {
				System.out.println("Up: "+mat[i-1][j]);
					}
					if(i<mat.length-1) {
				
				System.out.println("Down: "+mat[i+1][j]);
					
					
					
				}
				
				
				}
					 }
				 }
	}

}
