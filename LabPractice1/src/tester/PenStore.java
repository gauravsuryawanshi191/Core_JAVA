package tester;

import static utils.Penvalidation.penValidator;
import static utils.Penvalidation.penIdvalidator;
import static utils.StoreUtilities.populateMap;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import core.Pen;

public class PenStore {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, Pen> penStore = new HashMap<Integer, Pen>(populateMap());
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Welcome to Pen Store!");
					System.out.println("Options:\n1. Add new Pen\n2. Update stock of aPen\n"
							+ "3.Set discount of 20% for all the pens which are not at all sold in last 3 months\n"
							+ "4. Remove Pens which arenever sold once listed in 9 months\n" + "5. Display All Pens");
					switch (sc.nextInt()) {
					case 1:
						System.out
								.println("Enter Pen Details (brandName,colour,inkColour,penMaterial,stock,penPrice):");
						Pen tempPen = penValidator(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(),
								sc.nextDouble());
						penStore.put(tempPen.getPenId(), tempPen);
						break;
					case 2:
						System.out.print("Enter PenID to update stocks:");
						Integer tempId = penIdvalidator(sc.nextInt(), penStore);
						System.out.print("Enter new Stock:");
						penStore.values().stream().filter(p -> p.getPenId() == tempId).forEach(p -> {
							p.setStock(sc.nextInt());
							p.setUpdateDate(LocalDate.now());
						});
						System.out.println("Stocks updated!");
						break;
					case 3:
						penStore.values().stream()
								.filter(p -> Period.between(p.getUpdateDate(), LocalDate.now()).toTotalMonths() >= 3)
								.forEach(p -> p.setDiscountPercentage(20.0));
						System.out.println("Discount set!");
						break;
					case 4:
						// not done
						System.out.println("Pen Removed!");
						break;
					case 5:
						penStore.values().forEach(p -> System.out.println(p));
						break;
					default:
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
