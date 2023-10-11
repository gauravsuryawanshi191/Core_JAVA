package shapes;

import static java.lang.Math.PI;;

public class Circle extends BoundedShapes {

	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle:"+super.toString()+"\nRadius:"+radius;
	}

	@Override
	public void area() {
		System.out.println("Area: " + PI * radius * radius);

	}
}
