package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService { // a classe rentalservice não sabe a implementação que será usada,
	//pois ela depende de taxservice que é algo genérico,
	//se futuramente o tipo de serviço mudar a classe RentalService não será mudada.
	
private Double pricePerDay;
private Double pricePerHour;

private TaxService taxservice;
//private TaxService taxservice;

public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
	super();
	this.pricePerDay = pricePerDay;
	this.pricePerHour = pricePerHour;
	this.taxservice = taxService;
}

public void processInvoice(CarRental carRental) { // passou como parâmetro um objeto do tipo CarRental
	long t1 = carRental.getStart().getTime(); // pegar a data e horário de chegada em milisegundos
	long t2= carRental.getFinish().getTime();
	
	double basicPayment;
	double hours = (double)(t2-t1)/1000/60/60; // segundos, minutos, horas.
	if(hours<=12.0) {
		 basicPayment=pricePerHour*Math.ceil(hours); // arredondada pra cima
	}
	else {
		basicPayment= pricePerDay*Math.ceil(hours/24);
	}
	double tax = taxservice.tax(basicPayment);
	
	carRental.setInvoice(new Invoice(basicPayment,tax)); // um novo objeto de nota de pagamento, associando com o aluguel.
}
}
