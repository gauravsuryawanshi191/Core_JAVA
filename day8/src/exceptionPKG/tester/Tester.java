package exceptionPKG.tester;

import static exceptionPKG.utils.Validation.*;

import java.text.ParseException;
import java.util.Scanner;

import exceptionPKG.exception.ExpiryException;
import exceptionPKG.exception.SpeedOutOfRangeException;;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			try {
				System.out.print("Enter Speed: ");
				speedChecker(sc.nextInt());
//				System.out.println("Good Going...");
			} catch (SpeedOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.print("Enter Licence Expiry Date: ");
			licenceValidation(sc.next());
		} catch (ExpiryException e) {
			System.out.println(e.getMessage());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}
}
