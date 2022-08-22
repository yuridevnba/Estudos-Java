package model.entities;

import model.enums.Color;

public abstract class AbstratcShape implements Shape { // realiza o contrato do shape,
	// por ela ser abstrata n precisa implementar o método área.
	private Color color;

	public AbstratcShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}

