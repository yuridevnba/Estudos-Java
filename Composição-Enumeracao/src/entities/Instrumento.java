package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Enums.EstadoInstrumento;

///////////////// Atributos///////////////

public class Instrumento {
	
private String name;
private EstadoInstrumento estado;
private double ValorFrete; // como se o instrumento fosse entregue em domicílio.

///////////// COMPOSIÇÃO/////////////////

private Locatário Loc; // um instrumento é alugado pra um locatário.
private List<Inscrição>list=new ArrayList<>();// um instrumento pode ter vários alugueis desse locatário, com date,valor,horas diferentes.

/////// CONSTRUTOR PADRÃO//////
private Instrumento () {
}

public Instrumento(String name, EstadoInstrumento estado,double ValorFrete ,Locatário loc) {
	super();
	this.name = name;
	this.estado = estado;
	this.ValorFrete=ValorFrete;
	Loc = loc;
}


////////////// GET SETTERS////////////////


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public EstadoInstrumento getEstado() {
	return estado;
}


public void setEstado(EstadoInstrumento estado) {
	this.estado = estado;
}


public Locatário getLoc() {
	return Loc;
}


public void setLoc(Locatário loc) {
	Loc = loc;
}


public List<Inscrição> getList() {
	return list;
}


//public void setList(List<Inscrição> list) { // encapsulamento
	//this.list = list;
//}


//public static double getValorfrete() {
	//return ValorFrete;
//}
/////////////////////// MÉTODOS/////////////////

public void Inscrição (Inscrição novoAluguel) {
	list.add(novoAluguel);
}
public String toString() {
	return "NOME DO INSTRUMENTO: "+name+"\n ESTADO INSTRUMENTO: "+estado;
}
public double ValorPago(int year ,int month) {
			double sum=ValorFrete;
			
			/////////// raciocínio data/////////
			Calendar cal= Calendar.getInstance();
			for(Inscrição novo:list) {
				cal.setTime(novo.getDate());
				int k_year=cal.get(Calendar.YEAR);
				int k_month=1+cal.get(Calendar.MONTH);
				
				////////// condição////////////////
				if(year==k_year && month==k_month ) {
					sum+=novo.ValorAlguel();
				}
			}

return sum;

}
}
