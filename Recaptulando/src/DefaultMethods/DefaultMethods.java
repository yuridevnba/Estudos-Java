package DefaultMethods;

import java.util.Locale;
import java.util.Scanner;

import DefatultMethodsEntities.InterestService;
import DefatultMethodsEntities.UsaInterestService;

public class DefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fazer um programa para ler uma quantia e a duração em meses de um
		//empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
		//empréstimo, conforme regras de juros do Brasil. A regra de cálculo de
		//juros do Brasil é juro composto padrão de 2% ao mês.
		
		
		Scanner sc=new Scanner(System.in);
	    Locale.setDefault(Locale.US);		
		
		System.out.println("digite o valor do empréstimo: ");
		double amount=sc.nextDouble();
		
		System.out.println("digite o prazo de parcelamento do empréstimo: ");
		int month=sc.nextInt();
		
		
		
		//System.out.println("Qual o valor da taxa de juros: ");
		//double interestRate=sc.nextDouble();
		
		
	 //InterestService tax =new BrazilInterestService( );
	 InterestService tax  =new UsaInterestService( );
		
	double pg=	tax.payment(amount, month);
		
		sc.close();
		
		System.out.println("Empréstimo: R$ "+amount);
		System.out.println("Meses de parcelamento "+month);
		System.out.println("Pagamento Total R$"+String.format("%.2f", pg));
	}

}
