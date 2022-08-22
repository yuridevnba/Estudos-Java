package entities;
////////// ESPECIALIZAÇÃO////////
/////// SUB CLASSE, OU DERIVADA/////
////// POSSO INSTANCIAR 1 OBJETO SÓ E ELE TERÁ TDS OS DADOS DA ACCOUNT.

public class BusinessAccount extends Account{ // ter todos os dados e comportamento da account.
	
	private static final double taxaImposto = 10.0;
	 private Double loanLimit;
	 
	 public BusinessAccount() {
		 super(); // caso tenha alguma lógica no construtor padrão.
			
	 }
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // super chama o construtor da super classe, account, n precisa repetir as atribuições da account.
		this.loanLimit = loanLimit;
	}
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	 
	 public void Emprestimo (double amount) {
		 if(amount<=loanLimit) {
		 //deposit(amount);
			 balance+=amount -taxaImposto;
	 }
	 }
		 
		 @Override
		 public void Saque(double amount) {
		 	super.Saque(amount); // efeitou o saque normal da classe Account, chamando- o pela palavra super.
		 	balance-=2.0;
	 }
}
