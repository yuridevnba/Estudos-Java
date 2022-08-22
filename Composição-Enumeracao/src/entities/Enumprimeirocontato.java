package entities;

import java.time.LocalDateTime;

import Enums.Enum1;

public class Enumprimeirocontato {
	private Integer id;
	private LocalDateTime moment;
	private Enum1 status;

	public Enumprimeirocontato(Integer id, LocalDateTime moment, Enum1 status) {
		


	//public Order(Integer id, Date moment, OrderStatus status) {
		//super();
		this.id = id;
		this.moment = moment;
		this.status = status;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public Enum1 getStatus() {
		return status;
	}

	public void setStatus(Enum1 status) {
		this.status = status;
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "ORDER: id=" + id + ", moment=" + moment + ", status=" + status + "";
	}

	}


