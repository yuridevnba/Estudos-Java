package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PessoasAltura;

public class Ex1Alturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fazer um programa para ler nome, idade e altura de N pessoas, conforme
				// exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
				// com menos de 16 anos,bem como os nomes dessas pessoas caso houver.

				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);

				// PessoasAltura pessoas=new PessoasAltura();
				System.out.println("Quantas pessoas vão fazer parte da pesquisa?");
				int n = sc.nextInt();
				
				PessoasAltura vet[] = new PessoasAltura[n];
				
				int cont = 0;
				//double aux = 0.0;
				double soma = 0.0;
				
				
				//String nome[] = new String[n];
				double resul;
				double resultado;

				for (int i = 0; i < vet.length; i++) {
					System.out.println("Nome: ");
					String nomee = sc.next();

					System.out.println("altura pessoa: ");
					double altura = sc.nextDouble();

					System.out.println("idade");
					int idade = sc.nextInt();

					vet[i] = new PessoasAltura(nomee, altura, idade);

					soma += vet[i].getAltura();

					if (vet[i].getIdade() < 16) {
						cont++;

					}
				}
				resultado = soma / n;
				System.out.printf("a média da alturas das pessoas: %.2f%n", resultado);

				resul = (cont / (double) n) * 100;

				System.out.println("a porcentagem das pessoas menores de 16 é " + resul + "%");
				for (int i = 0; i < vet.length; i++) {
					if (vet[i].getIdade() < 16) {
						System.out.println("pessoas com idade menor de 16: " + vet[i].getNome());
					}

				}

	}
}
