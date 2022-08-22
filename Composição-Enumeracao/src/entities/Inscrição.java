package entities;

import java.util.Date;

public class Inscrição {
	
/////////////// dados do Aluguel(data,hora,valor/hora)////////////////
	///////////////////////////////////////////////////////////////
	
	//////////////// ATRIBUTOS///////////////

	private Date date;
	private Integer Hora;
	private static final double taxaImposto = 5;
     private static final double valorHora= 100;
     
	/////////////// CONTRUTORES///////////////
	
	public Inscrição() {

	}

	

	public Inscrição(Date date, Integer Hora) {
		super();
		this.date = date;
		this.Hora = Hora;
	}



	///////////// GET SETTERS//////////////////
	
	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Integer getHora() {
		return Hora;
	}



	public void setHora(Integer hora) {
		Hora = hora;
	}



	public static double getTaxaimposto() {
		return taxaImposto;
	}



	public static double getValorhora() {
		return valorHora;
	
	
	}
	
	///////////////////// Métodos////////////////

	public double ValorAlguel() {
		return Hora;
	}



	
	}


