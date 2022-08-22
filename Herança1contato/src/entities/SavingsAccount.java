package entities;

public  class SavingsAccount extends Account{
private Double taxaJuros;

public SavingsAccount() {
	super();
}

public SavingsAccount(Integer number, String holder, Double balance, Double taxaCambio) {
	super(number, holder, balance);
	this.taxaJuros = taxaCambio;
}

public Double getTaxaCambio() {
	return taxaJuros;
}

public void setTaxaCambio(Double taxaCambio) {
	this.taxaJuros = taxaCambio;
}
public void updateBalance() {
	balance+=balance*taxaJuros;
}
@Override
public final void Saque(double amount) {
	balance-=amount;
}
}