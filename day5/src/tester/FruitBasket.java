package tester;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Fruit Basket");
		System.out.print("Enter Size Of Basket(no of fruits to store): ");
		Fruit[] basket = new Fruit[sc.nextInt()];
		boolean exit = true;
		int count = 0;
		System.out.println("1.Add Mango\n2.Add Orange\n3.Add Apple"
				+ "\n4.Display name of all in Basket\n5.Display name,colour,weight,taste of all fruits in Basket"
				+ "\n6.marks a fruit as Stale\n7.Mark all sour fruits Stale"
				+ "\n8.Invoke fruit specific Functinality\n9.Exit");
		while (exit) {
			System.out.print("Enter Choice: ");
			switch (sc.nextInt()) {
			case 1:
				// 1.Add Mango
				if (count < basket.length) {
					System.out.println("Enter Mango Details(colour,weight,name,isfresh:true/false)");
					String colour = sc.next();
					Double weight = sc.nextDouble();
					String name = sc.next();
					Boolean fresh = sc.nextBoolean();
					if (fresh == true)
						basket[count++] = new Mango(colour, weight, name, fresh);
				}
				break;
			case 2:
				// 2.Add Orange
				if (count < basket.length) {
					System.out.println("Enter Orange Details(colour,weight,name,isfresh:true/false)");
					String colour = sc.next();
					Double weight = sc.nextDouble();
					String name = sc.next();
					Boolean fresh = sc.nextBoolean();
					if (fresh == true)
						basket[count++] = new Orange(colour, weight, name, fresh);
				}
				break;
			case 3:
				// 3.Add Apple
				if (count < basket.length) {
					System.out.println("Enter Apple Details(colour,weight,name,isfresh:true/false)");
					String colour = sc.next();
					Double weight = sc.nextDouble();
					String name = sc.next();
					Boolean fresh = sc.nextBoolean();
					if (fresh == true)
						basket[count++] = new Apple(colour, weight, name, fresh);
				}
				break;
			case 4:
				// 4.Display name of all in Basket
				for (Fruit f : basket)
					if (f != null)
						System.out.println(f);
				break;
			case 5:
				// 5.Display name,colour,weight,taste of all fruits in Basket
				for (Fruit f : basket)
					if (f != null) {
						System.out.println(f.getName());
					}
				break;
			case 6:
				// 6.marks a fruit as Stale

				break;
			case 7:
				// 7.Mark all sour fruits Stale
				break;
			case 8:
				// 8.Invoke fruit specific Functinality
				for (Fruit f : basket)
					if (f instanceof Mango)
						((Mango) f).pulp();
					else if (f instanceof Orange) {
						((Orange) f).juice();
					} else {
						((Apple) f).jam();
					}
				break;
			case 9:
				// 9.Exit
				System.out.println("Terminating Application!");
				exit = false;
				break;

			default:
				System.out.println("Enter Valid Choice.");
				break;
			}
		}
		sc.close();
	}

}
