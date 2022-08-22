package application;

import java.util.Scanner;

public class MatrizNumNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		System.out.println("digite um número para as linhas e colunas da matriz N:");
		 int n=sc.nextInt();
		
		 int mat[][]= new int[n][n];
		int  cont =0;
		 
		 for(int i=0;i<mat.length;i++) {  // linha
			 for (int j =0; j < mat[i].length; j++) { // coluna
			 
			 mat[i][j]= sc.nextInt();
			 }
			 }
			 
		 
			 for(int y=0;y<mat.length;y++) { // linha
				 for (int j =0; j < mat[y].length; j++) {
			 
			 if(mat[y][j]<0) {
				 cont++;
				 //System.out.println("Números Negativos: "+mat[y][j]);
			 }
			 }
		 }
		 System.out.println();
		 System.out.println("Diagonal: ");
			 for(int l=0;l<mat.length;l++) {
				 System.out.print(mat[l][l]+" ");
			 }
				 System.out.println();
			System.out.println("Quantidade de número negativos: "+cont);
		 }	 
				 
				 
				 
		 }
			
	
	
