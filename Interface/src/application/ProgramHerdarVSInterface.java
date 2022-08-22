package application;
import model.entities.AbstratcShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.Color;
public class ProgramHerdarVSInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstratcShape s1 = new Circle(Color.BLACK, 2.0);
		AbstratcShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
