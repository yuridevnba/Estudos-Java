package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		//myCircles.add(new Circle(2.0));
		//myCircles.add(new Circle(3.0));

		
		
		System.out.println("Total area: " + totalArea(myCircles));  // vai dar erro pq o listShape n é um super tipo de listaCircle.
		//System.out.println("Total area: " + totalArea(myShapes));
	}

	public static double totalArea(List<? extends Shape> list) { // a lista pode ser de um tipo shape, ou qualquer tipo que seja um subtipo de shape.
		// dessa forma o metódo tb vai aceitar uma lista de círculos.
	//public static double totalArea(List<Shape> list) {
		//list.add(new Rectangle(3.0,4.0));  // isso vai reclamar , pq eu passei como argumento myCircles é um subtipo de shape,mas tb é incompatível com rectangulo.
		// o preço de colocar uma lista do tipo curinga delimitado é não pode adicionar a lista.
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();// sum=sum+s.area();
		}
		return sum;

		
	}

}
