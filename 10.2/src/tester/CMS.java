package tester;

import static utils.CustomerValidations.superValidater;
import static utils.CustomerSupport.*;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import core.Customer;
import exceptions.DateOfBirthException;
import exceptions.DublicateEntryException;
import exceptions.LoginException;
import exceptions.PlanMismatchException;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("!Welcome to Customer Management System!");
			ArrayList<Customer> customerlist = data();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Options\r\n" + "1. Sign up (customer registration)\n" + "2. Sign in (login)\n"
							+ "3. Change password\n" + "4. Un subscribe customer\n" + "5. Display all customers.\n"
							+ "0. Exit \n" + "");
					System.out.print("Enter Choice: ");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Customer Registration");
						System.out.println("Enter Details(FirstName, LastName, emailId, Password,"
								+ " RegistrationAmount, DateOfBirth(yyyy-mm-dd), ServicePlan):");
						Customer c = superValidater(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(),
								sc.next(), customerlist);
						customerlist.add(c);
						System.out.println("Customer Added!");
						break;
					case 2:
						System.out.println("Customer Login");
						System.out.println("Enter EmailId & Pasword:");
						CustomerLogin(sc.next(), sc.next(), customerlist);
						break;
					case 3:

						break;
					case 4:

						break;
					case 5:
						for (Customer tempCustomer : customerlist)
							System.out.println(tempCustomer);
						break;
					case 0:
						System.out.println("Terminating Application.");
						System.out.println("Byee.....");
						exit = true;
						break;
					default:
						System.out.println("Enter Valid Option.");
						break;
					}
				} catch (DateTimeParseException e) {
					System.out.println("Can't Parse Date:");
				} catch (DateOfBirthException e) {
					System.out.println(e.getMessage());
				} catch (DublicateEntryException e) {
					System.out.println(e.getMessage());
				} catch (PlanMismatchException e) {
					System.out.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.out.println("Enter Valid Amount:" + sc.next());
				} catch (IllegalArgumentException e) {
					System.out.println("Enter Valid Plan!");
				} catch (LoginException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					// System.out.println(e.getMessage());
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
