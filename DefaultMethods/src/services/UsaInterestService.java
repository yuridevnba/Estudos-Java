package services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {
	

	private double interestRate; // taxa de juros

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	 @Override
	public double getInterestRate() {
		return interestRate;
	}
	/* @Override
	public double payment(double amount, int months) {
		if (months < 1) { // programação defensiva.
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + interestRate / 100.0, months);// Math.pow potenciação.
}*/
	// não precisa subescrever os métodos, uma vez que eles estão na interface como default.
	}
