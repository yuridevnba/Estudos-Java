package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*var account = new BusinessAccount();

		Account acc = new Account(1001, "Alex", 0.0);

		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		// é um, uma conta empresarial tb é uma conta.

		///// UPCASTING/////////
		///////////////////////

		Account acc1 = bacc; // subclasse, sendo atribuido a um objeto da superclasse.

		acc1.getBalance();

		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0); // variável tipo account, mas foi instanciada como
																		// um businessaccount.

		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01); // ou seja, do filho para o pai...

		/////// DOWNCASTING/////////
		///////////////////////////

		BusinessAccount acc4 = (BusinessAccount) acc2; // n pode converter um cara account para businessaccount, preciso
														// fazer um cast manual.
		acc4.Emprestimo(100.0);

		//BusinessAccount acc5 = (BusinessAccount) acc3; // businesAccount para SavingsAccount, no momento o compilador
														// não sabe, por isso passa despercebido, só dá problema no
														// momento da execução.
                 
		// método de evitar o erro do compilador//
		
		 if(acc3 instanceof BusinessAccount) {
			 BusinessAccount acc5=(BusinessAccount)acc3; 
			 acc5.Emprestimo(200.0);
		 System.out.println("Empréstimo!"); } 
		 
		 
		 if(acc3 instanceof SavingsAccount) {
		 SavingsAccount acc5=(SavingsAccount)acc3;
		 acc5.updateBalance();
		 System.out.println("Update! "); }*/
		
		
		Account acc1 = new Account(1001,"Alex",1000.0);
		acc1.Saque(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2= new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		 acc2.Saque(200.0);
		 System.out.println(acc2.getBalance()); // prevaleceu o método saque implementado nela. 
		 
		// Account acc3=new BusinessAccount(1003,"Yuri",1000.0,500.0);
		 //acc3.Saque(200.0);
		// System.out.println(acc3.getBalance());
		
		
	
		 
		 
		 
	}

}
