package tester;

import shapes.*;

public class ShapeTester2 {

	public static void main(String[] args) {
		BoundedShapes[] shapes = new BoundedShapes[3];
		shapes[0] = new Circle(1, 2, 3);
		shapes[1] = new Rectangle(1, 1, 2.2, 3.3);
		shapes[2] = new Circle(4, 5, 6);
		for (BoundedShapes s : shapes) {
			System.out.println(s);
			s.area();
		}
	}

}
