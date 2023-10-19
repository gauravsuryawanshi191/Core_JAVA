package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import static utils.CarValidations.*;
import static utils.ShoowroomUtils.*;

import core.Brand;
import core.Car;
import core.Colour;
import exceptions.CarHandlingException;

public class Showroom {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("!Welcome to Car Showroom!");
			ArrayList<Car> cars = populateShowroom();
			boolean end = true;
			while (end) {
				try {
					System.out.println(
							"Options:\n1.Add Car\n2.Display all Cars\n3.Get specific Car Details\n4.Get Discount on Car\n5.Discount on all Old Cars\n0.Exit");
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
						for (Car c : cars)
							System.out.println(c);
						break;
					case 3:
						System.out.print("Enter Chasis No:");
						System.out.println(findByChasis(sc.next(), cars));
						break;
					case 4:
						System.out.print("Enter Car ChasisNo:");
						String tempChasis = sc.next();
						Car tempC = findByChasis(tempChasis, cars);
						System.out.print("Enter Discount Amount:");
						System.out.println(discountOnCAr(tempC, sc.nextInt(), cars));
						break;
					case 5:
						System.out.print("Enter Date Limit(yyyy-MM-dd):");
						System.out.println(discountAllOldCars(sc.next(), cars));
						break;
					case 0:
						System.out.println("Terminating Application");
						end = false;
						break;
					default:
						System.out.println("Enter Valid Choice...");
						break;
					}
				} catch (CarHandlingException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
				}
			}
		}
	}
}

/*
 * 1. Add Vehicle to the showroom. Accept data --validate all i/ps --in case of
 * success -- add vehicle , to the showroom. o.w : throw custom exception
 * 
 * 2. Display all vehicle details Can you use : for loop | for-each | Iterator |
 * ListIterator | toString ?
 * 
 * 
 * 3. Option : get specific vehicle details i/p : chasis no o/p : either vehicle
 * details (in case of vehicle found) or err mesg via custom exc! eg :
 * sop("Enter ch no"); String chNo=sc.next(); Vehicle newVehicle=new
 * Vehicle(chNo); int index=list.indexOf(newVehicle); if(...) throw ...
 * sop(list.get(index));
 * 
 * 
 * 
 * 4. Apply discount on a particular vehicle i/p : ch no , discount o/p : mesg
 * 
 * 
 * 4.5 Apply discount on all vehicles produced before a specific date i/p : date
 * , discount
 * 
 * 
 * 5. Objective : Avoid creating vehicles n populating all the time , instead
 * start with sample data) Add a method in ShowroomUtils Add a static method to
 * return populated list(sample hardcoded data) of vehicles
 * 
 * 
 * 6. Objective : Remove specific vehicle details i/p : chasis no o/p : valid ch
 * no : del details o.w throw custom exc
 * 
 * 
 * 7. Objective : Remove all vehicle details by a specific color i/p : color
 * 
 * 
 * 
 * 8. Objective : Sort the vehicles as per asc ch no(using natural ordering)
 * 
 * 9. Objective : Sort the vehicles as per price no(using custom ordering)
 */
