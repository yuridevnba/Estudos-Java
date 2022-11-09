package LojasInstrumentosEntities;

public class Fatura {
	
//////////// a entidade de negócio que vai apresentar a fatura///////////////
	///////////////////////////////////////////////////////////////////////
	
	private Double pag_basico;
	private Double tax;
	
	
	
	public Fatura(Double pagamento_basico, Double tax) {
		super();
		this.pag_basico = pagamento_basico;
		this.tax = tax;
		
	}
	 public Double getTotalPagamento() { // colocou como get pq depois ele quer chamar por alocação.
		 return pag_basico+tax;
	 }
	public Double getPag_basico() {
		return pag_basico;
	}
	//public void setPag_basico(Double pag_basico) {
		//this.pag_basico = pag_basico;
	//}
	public Double getTax() {
		return tax;
	}
	//public void setTax(Double tax) {
		//this.tax = tax;
	//}
	 
	
}
