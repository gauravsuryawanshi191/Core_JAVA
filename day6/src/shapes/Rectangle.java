package shapes;

import static java.lang.Math.PI;;

public class Rectangle extends BoundedShapes {

	private double length;
	private double height;

	public Rectangle(int x, int y, double length,double height) {
		super(x, y);
		this.length=length;
		this.height=height;
	}

	@Override
	public String toString() {
		return "Rectangle: "+super.toString()+ "\nLength:"+length+"\tHeight:"+height;
	}

	@Override
	public void area() {
		System.out.println("Area: " +length*height);

	}
}
