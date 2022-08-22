package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ExeCopiadoLista;

public class ExCopiadoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				/// Fazer um programa para ler um número inteiro N e depois os dados (id,
				/// nome_do_material e preço) de N pedidos.
				// Não deve haver repetição de id.
				// Em seguida, efetuar o desconto de X por cento no preço de um determinado
				// material.
				// Para isso, o programa deve ler um id e a porcentagem do desconto . Se o id
				/// informado não
				// existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a
				/// listagem atualizada dos
				// produtos, conforme exemplos.
				// Lembre-se de aplicar a técnica de encapsulamento para não permitir que o
				// preço possa ser mudado livremente. Um preço só pode ser aumentado com base em
				/// uma
				// operação de aumento por porcentagem dada.

				List<ExeCopiadoLista> list = new ArrayList<>();

				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);

				//////////////////// ENTRADAS/////////////////////////////

				System.out.println("quantos pedidos vc irá fazer? ");
				int num = sc.nextInt();

				for (int i = 0; i < num; i++) {
					
					System.out.println("qual o id do produto" + (i + 1) + ":");
					Integer id = sc.nextInt();
					
					//boolean procura=procuraID( list,id);
					
					while(procuraID(list,id)) { // seja verdadeiro, n entendi, preciso refletir nesse ponto.
						System.out.println("esse ID já pertence a um produto:");
		          	  
		  				id = sc.nextInt(); 
					}
					
			             /* while(procura==null&&id==id) {
			            	  System.out.println("esse ID já pertence a um produto:");
			            	  
			  				id = sc.nextInt();           / pensar uma forma de solucionar desse jeito...
			  			
			              }
			  			*/
					
					System.out.println("qual o nome do produto" + (i + 1) + ":");
					sc.nextLine();
					String name = sc.nextLine();

					System.out.println("qual o preço do produto" + (i + 1) + ":");
					Double preco = sc.nextDouble();

					ExeCopiadoLista armazem = new ExeCopiadoLista(id, name, preco);
					list.add(armazem);
				}
						
						
				//////////////////////// DESCONTO/////////////////////////////

				//for (Armazemcpo copia : list) {
					// System.out.println("vc ganhou um cupom de desconto gostaria de usar? S/N");
					// sc.nextLine();
					// String decisao=sc.nextLine();
					// if(decisao.charAt(0)=='s') {

					System.out.println("qual o id do produto que vc gostaria de utilizar o desconto? ");
					// System.out.println(copia);

					int idd = sc.nextInt();
					// int procura=procuraID( list,idd); não preciso utilizar uma função, pois
					// preciso chamar o método desconto sem utilizar o for earch, pois só preciso
					// declarar 1 desconto.
					ExeCopiadoLista emp = list.stream().filter(x -> x.getId() == idd).findFirst().orElse(null);
					if (emp != null) {
						System.out.println("qual a percentagem do desconto? ");
						double percent = sc.nextDouble();

						emp.desconto(percent);
					}

					else {
						System.out.println("NÚMERO NÃO EXISTE:  ");
					}
				//}

				///////////////////////////// SAÍDA//////////////////////////////////

				System.out.println("---------------------------------------------------------");
				System.out.println("LISTAGEM DOS PRODUTOS: ");
				System.out.println();
				for (ExeCopiadoLista copia : list) {
					System.out.println(copia);

				}

			}
			///////////////////////////// FUNCOES///////////////////////////////////

			public static boolean procuraID(List<ExeCopiadoLista> list, int id) {
				ExeCopiadoLista emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				return emp!=null; // verdade, retornar um número...
			}


	

}
