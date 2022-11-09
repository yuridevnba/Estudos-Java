package Excecão.entities;

import java.util.Date;

public class Reservation {
private  Integer n_série;
private Date checkin;
private Date checkout;


public Reservation(Integer n_série, Date checkin, Date checkout) {
	super();
	this.n_série = n_série;
	this.checkin = checkin;
	this.checkout = checkout;
}


public Integer getN_série() {
	return n_série;
}


public void setN_série(Integer n_série) {
	this.n_série = n_série;
}


public Date getCheckin() {
	return checkin;
}


public void setCheckin(Date checkin) {
	this.checkin = checkin;
}


public Date getCheckout() {
	return checkout;
}


public void setCheckout(Date checkout) {
	this.checkout = checkout;
}
public Integer duration() {
	
	long x=checkin.getTime();
	long y=checkout.getTime();
	
	double periodo=(double)(x-y)/1000/60/60;
	return (int) (periodo/24.0);
}


}
