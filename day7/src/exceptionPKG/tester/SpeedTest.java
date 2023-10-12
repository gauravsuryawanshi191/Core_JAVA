package exceptionPKG.tester;

import static exceptionPKG.utils.Validation.speedChecker;

import java.util.Scanner;

import exceptionPKG.exception.SpeedOutOfRangeException;;

public class SpeedTest {

	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)) {
			System.out.print("Enter Speed: ");
			speedChecker(sc.nextInt());
			System.out.println("Good Going...");
		} catch (SpeedOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
