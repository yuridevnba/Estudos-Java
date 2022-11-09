package LojasInstrumentosmodel.service;

import LojasInstrumentosEntities.Alocação;
import LojasInstrumentosEntities.Fatura;

public class GeradoraFatura {
	
private Double p_hora;

private TaxServiceInstrumentos taxserviceinstrumentos;
//private ZumbiInstrumentos zumbi;
static final Double p_dia= 200.0;

//static final Double R$_diaFsemana=300.0;


public GeradoraFatura(Double p_hora,TaxServiceInstrumentos taxserviceinstrumentos) {
		//ZumbiInstrumentos zumbi) {
	super();
	this.p_hora = p_hora;
	this.taxserviceinstrumentos= taxserviceinstrumentos;
	
	//this.taxserviceinstrumentos= new ZumbiInstrumentos(); Inversão de Controle na mão
}

public TaxServiceInstrumentos gettaxserviceinstrumentos () {
	return taxserviceinstrumentos;
}

public Double getP_hora() {
	return p_hora;
}


public void setP_hora(Double p_hora) {
	this.p_hora = p_hora;
}


public static Double getP_dia() {
	return p_dia;
}


//public static Double getR$Diafsemana() {
	//return R$_diaFsemana;
//}
public void fatura(Alocação alocação){
	
	long diff1 = alocação.getData_inicial().getTime();
	long diff2= alocação.getData_final().getTime();
	
	double p_basico;
	
	double hours =(double)(diff2-diff1)/1000/60/60;
	
	
	
	if(hours<=20) {
		p_basico=Math.ceil(hours)*p_hora;
	}
   else {
	   p_basico=Math.ceil(hours/24)*p_dia;
		
	}
	double tax= taxserviceinstrumentos.tax(p_basico);
	
	alocação.setFat(new Fatura(p_basico,tax));
	
}

}
