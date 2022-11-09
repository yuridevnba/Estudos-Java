package services;

import java.security.InvalidParameterException;

public interface InterestService {
	

double getInterestRate();

default double payment(double amount, int months) {// em vez do public coloquei o default
	if (months < 1) { // programação defensiva.
		throw new InvalidParameterException("Months must be greater than zero");
	}
	return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);// Math.pow potenciação.
}
}