package LojasInstrumentosEntities;

import java.util.Date;



public class Alocação {
	
///////// DADOS DA ALOCAÇÃO/////////////
////////////////////////////////////////
	
	private Date data_inicial;
	private Date data_final;
	
	private Instrumentos inst;
	private Fatura fat;
	
	
	
	public Alocação(Date data_inicial, Date data_final, Instrumentos inst) {
		//super();
		this.data_inicial = data_inicial;
		this.data_final = data_final;
		this.inst = inst;
		//this.fat = fat;
	}


	public Date getData_inicial() {
		return data_inicial;
	}


	public void setData_inicial(Date data_inicial) {
		this.data_inicial = data_inicial;
	}


	public Date getData_final() {
		return data_final;
	}


	public void setData_final(Date data_final) {
		this.data_final = data_final;
	}


	public Instrumentos getInst() {
		return inst;
	}


	public void setInst(Instrumentos inst) {
		this.inst = inst;
	}


	public Fatura getFat() {
		return fat;
	}


	public void setFat(Fatura fat) {
		this.fat = fat;
	}
	
	
	
}
