package LojasInstrumentosEntities;

import LojasInstrumentosmodel.enums.Estado;

public class Instrumentos {
private String nome;

private Estado estado;

public Instrumentos() {
	
}

public Instrumentos(String nome, Estado estado) {
	//super();
	this.nome = nome;
	this.estado = estado;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Estado getEstado() {
	return estado;
}

public void setEstado(Estado estado) {
	this.estado = estado;
}

}
