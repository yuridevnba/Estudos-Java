package entities;
////// GENERALIZAÇÃO//////
///// CLASSE BASE, SUPERCLASSE////////
public class Account {
private Integer number;
private String holder;
protected Double balance;  // podendo ser acessado pela subclasse BusinessAccount
private static final double taxaImposto = 5.0;

public Account() {
	
}

public Account(Integer number, String holder, Double balance) {
	super();
	this.number = number;
	this.holder = holder;
	this.balance = balance;
}

public Integer getNumber() {
	return number;
}

public void setNumber(Integer number) {
	this.number = number;
}

public String getHolder() {
	return holder;
}

public void setHolder(String holder) {
	this.holder = holder;
}

public Double getBalance() {
	return balance;
}

//public void setBalance(Double balance) {
	//this.balance = balance;
//}
public void Saque(double amount) {
	balance-=amount+taxaImposto;
}
public void deposit(double amount) {
	balance+=amount;
}
}
