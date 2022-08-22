package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ListaEx1;

public class Lista {

	public Lista(Integer id, String name, Double salary) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de N funcionários.
				//Não deve haver repetição de id.
				// Em seguida, efetuar o aumento de X por cento no salário de um determinado
				// funcionário.
				// Para isso, o programa deve ler um id e o valor X. Se o id informado não
				// existir, mostrar uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos
				// funcionários, conforme exemplos.
				// Lembre-se de aplicar a técnica de encapsulamento para não permitir que o
				// salário possa ser mudado livremente. Um salário só pode ser aumentado com base em uma
				// operação de aumento por porcentagem dada.

				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);

				List<ListaEx1> list = new ArrayList<>();

				System.out.println("How many employees will be registered?");
				int N = sc.nextInt();

				for (int i = 0; i < N; i++) {
					System.out.println();
					System.out.println("Emplyoee#" + (i + 1) + ":");
					System.out.println("Id: ");
					Integer id = sc.nextInt();
					
			Integer	pos=position(list,id);
					
					while(pos==id) {
						System.out.println("ID already taken! Try again: ");
						 id = sc.nextInt();
						
					}
					//while(hasId(list,id)) { // seja verdadeiro...
						//System.out.println("ID already taken! Try again: ");
						// id = sc.nextInt();
					//}
					System.out.println("Name");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Salary: ");
					Double salary = sc.nextDouble();

					ListaEx1 emp = new ListaEx1(id, name, salary); /// Employee, instanciando dentro da memória um funcionário
																	/// com esses dados criados.

					list.add(emp); // adicionando na lista.

				}
				System.out.println();
				System.out.println("Enter the employee id that will have salary increase :");
				int idsalary = sc.nextInt();
				//Boolean empp=hasId (list,idsalary);
				ListaEx1 empl = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
				//Integer pos = position(list, idsalary);
				if(empl==null) {
					
				
				//if (pos == null) {
					System.out.println("This id does not exist!");

				}
					
				
				else {
					System.out.println("Enter the percentage:");
					double percent = sc.nextDouble();
					
					empl.increaseSalary(percent);
					//list.get(pos).increaseSalary(percent);
				}
				System.out.println();
				System.out.println("List of employees: ");
				for (ListaEx1 emppp : list) {
					System.out.println(emppp);
				}
				sc.close();
			}

			public static Integer position(List<ListaEx1> list, int id) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getId() == id) { /// list.get para ver se o elemento faz parte da lista especificada, indicando o id dele.
						return id;                     ///se o elemento da lista na posição i,.getId() pegou o id desse elemento na posição i, se ele for igual ao id fornecido.
					}
					
					
				}

				//return -1;// int
				 return null; // Integer

			}
			public static boolean hasId(List<ListaEx1> list, int id) {
				ListaEx1 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				return emp != null; // número= true
			}
		}

	
