package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.contaBancaria;
import model.exceptions.ErroConta;

public class ProgramContaBancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fazer um programa para ler os dados de uma conta bancária e depois realizar um
		//saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
		//ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
		//saque da conta. Implemente a conta bancária conforme projeto abaixo:
		
		try {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data");
		
		System.out.println("Number: ");
		int number=sc.nextInt();
		
		System.out.println("Holder: ");
		String nome=sc.nextLine();
		
		sc.nextLine();
		System.out.println("initial balance: ");
		Double balance=sc.nextDouble();
		
		System.out.println("Withdraw limit: ");
		Double withdraw=sc.nextDouble();
		
		contaBancaria conta=new contaBancaria(number, nome, balance, withdraw);
		
		//conta.deposit(balance);
		
		System.out.println("Enter amount for withdraw:");
	
		Double amount=sc.nextDouble();
		
		conta.withdraw(amount);
		
		System.out.println(conta);
		}
		catch(ErroConta e){
			System.out.println("ERRO NA TRANSAÇÃO BANCÁRIA: "+e.getMessage());
			
		}
		catch(InputMismatchException e) {
			System.out.println("os números da conta só é composta por números, não letras.");
		}
		catch(RuntimeException e) {
			System.out.println("Erro Inesperado!");
		}
		System.out.println();
		System.out.println("Then End Program!!!");
	}
   
}
