package tester;

import shapes.*;

public class ShapeTester3 {

	public static void main(String[] args) {
		BoundedShapes[] shapes = {new Circle(1, 2, 3),new Rectangle(1, 1, 2.2, 3.3),new Circle(4, 5, 6)};
		for (BoundedShapes s : shapes) {
			System.out.println(s);
			s.area();
		}
	}

}
