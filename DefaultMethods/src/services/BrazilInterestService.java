package services;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService{

	private double interestRate; // taxa de juros

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
 @Override
	public double getInterestRate() { // não posso colocar esse método, pois ele depende do resultado da variável local, do atributo interestRate. a interface não pode armazenar estado e construtor.
		return interestRate;
	}
 /*@Override
	public double payment(double amount, int months) {
		if (months < 1) { // programação defensiva.
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + interestRate / 100.0, months);// Math.pow potenciação.
	}*/

}