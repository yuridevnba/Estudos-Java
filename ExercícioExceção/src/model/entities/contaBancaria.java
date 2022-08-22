package model.entities;

import model.exceptions.ErroConta;

public class contaBancaria {
	 
private Integer number;
private String holder;
private Double balance ;
private  Double withdrawlimit ;




public contaBancaria(Integer number, String holder, Double balance, Double withdrawlimit) {
	super();
	this.number = number;
	this.holder = holder;
	this.balance = balance;
	this.withdrawlimit = withdrawlimit;
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
	////this.balance = balance;
//}

public Double getWithdrawlimit() {
	return withdrawlimit;
}

//public void setWithdrawlimit(Double withdrawlimit) {
	//this.withdrawlimit = withdrawlimit;
//}
   
public void deposit( Double amount) {
	balance=+amount;
}
public void withdraw(Double amount) {
	
	if(balance==0) {
		throw new ErroConta("Sua conta está zerada, por isso o saque é indisponível.");
			
		}
	if(amount>withdrawlimit) {
		throw new ErroConta("O valor do saque, ultrapassa ao limite (Withdraw) de saque!");
	}
	else {
		balance-=amount;
	}
}
	public String toString(){
		return "New Balance : "
	+ balance;
				
	
}
}
