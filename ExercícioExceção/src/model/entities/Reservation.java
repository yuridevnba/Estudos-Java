package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
private Integer rooNumber;
private Date checkIn;
private Date checkOut;

private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");


public Reservation(Integer rooNumber, Date checkIn, Date checkOut) {
		//throws DomainException {
	//super();
	 if (!checkOut.after(checkIn)) {
		 throw new DomainException(" Check-out date must be after check-in date");
	 }
	this.rooNumber = rooNumber;
	this.checkIn = checkIn;
	this.checkOut = checkOut;o
}



public Integer getRooNumber() {
	return rooNumber;
}



public void setRooNumber(Integer rooNumber) {
	this.rooNumber = rooNumber;
}



public Date getCheckIn() {
	return checkIn;
}



//public void setCheckIn(Date checkIn) {
	//this.checkIn = checkIn;
//}



public Date getCheckOut() {
	return checkOut;
}



//public void setCheckOut(Date checkOut) {
	//this.checkOut = checkOut;
//}

 public long duration() {
	 long diff=checkOut.getTime()-checkIn.getTime(); // gettime retorna em milisegundo.
	return  TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS); // converte o diff que esta em milliseconds para dias.
 }
public void updateDates(Date checkIn,Date checkOut) { 
		//throws DomainException { // deixou de ser String, voltou a ser void, agora o método updatedate pode lançar uma exceção, com o throws domainexception.
	
	Date now = new Date(); // cria uma data com horário de agr.
	
	if (checkIn.before(now) || checkOut.before(now)) { // se a data de checkIn for antes de agora.
		/*return*/ throw new DomainException(" Reservation dates for update must be future dates"); // lançando a exceção.
		//IllegalArgumentException(" Reservation dates for update must be future dates"); // illegal quando dá erros nos argumentos do método.
	} 
	 if (!checkOut.after(checkIn)) {
		 throw new DomainException(" Check-out date must be after check-in date");
		 //IllegalArgumentException(" Check-out date must be after check-in date");
	}
	
	this.checkIn=checkIn;
	this.checkOut=checkOut;
	//return null; // se n dá nhm erro, vai retornar nulo.
}
@Override // o toString tb é uma sobreposição.
public String toString() {
	return "Romm"
   +rooNumber
	+", check-in: "
	+ sdf.format(checkIn)
	+", check-out: "
	+sdf.format(checkOut)
	+" ,"
	+duration()
	+" nights";
}
}
