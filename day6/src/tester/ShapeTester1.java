package tester;

import shapes.*;

public class ShapeTester1 {

	public static void main(String[] args) {
		BoundedShapes s1 = new Circle(1, 2, 3);
		BoundedShapes s2 = new Rectangle(1, 1, 1.1, 2.2);
		System.out.println(s1);
		System.out.println(s2);
		s1.area();
		s2.area();

	}

}
