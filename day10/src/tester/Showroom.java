package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import static utils.CarValidations.*;

import core.Brand;
import core.Car;
import core.Colour;

public class Showroom {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("!Welcome to Car Showroom!");
			ArrayList<Car> cars = new ArrayList<>();
			boolean end = true;
			while (end) {
				try {
					System.out.println(
							"Options:\n1.Add Car\n2.Display all Cars\n3.Get specific Car Details\n4.Get Price\n5.Exit");
					System.out.print("Enter Choice: ");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Car Details:(chasisNo, Colour, BasePrice, ManufacturingDate, Brand");
//					checkDublicate(sc.next(), cars);
						Car newCar = superValidation(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), cars);
						cars.add(newCar);
						System.out.println("Car Added!");
						break;
					case 2:
						for(Car c: cars)
							System.out.println(c);
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						System.out.println("Terminating Application");
						end = false;
						break;
					default:
						System.out.println("Enter Valid Choice...");
						break;
					}
				} catch (Exception e) {
				}
			}
		}
	}
}
