package tester;

import static utils.CustomerValidations.superValidater;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import static utils.CustomerValidations.*;
import static utils.CustomerSupport.*;
import core.Customer;
import exceptions.DublicateEntryException;
import exceptions.LoginException;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Customer> customers = populatingMap();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println(
							"----------------------------------------------------------------------------------------------------------");
					System.out.println("Options\r\n" + "1. Sign up (customer registration)\n" + "2. Sign in (login)\n"
							+ "3. Change password\n" + "4. Un subscribe customer\n" + "5. Display all customers.\n"
							+ "0. Exit \n" + "");
					System.out.print("Enter Choice: ");
					switch (sc.nextInt()) {
					case 1:
						System.out.print("Enter EmailId: ");
						String email = checkDublicate(sc.next(), customers);
						System.out.println("Enter Details(FirstName, LastName, Password,"
								+ " RegistrationAmount, DateOfBirth(yyyy-mm-dd), ServicePlan):");
						Customer c = superValidater(sc.next(), sc.next(), email, sc.next(), sc.nextInt(), sc.next(),
								sc.next());
						customers.put(email, c);
						System.out.println("Success\nCustomer Added!!!");
						break;
					case 2:
						System.out.println("Customer Login");
						System.out.print("Enter Email: ");
						String validEmail = checkValidCustomer(sc.next(), customers);
						System.out.print("Enter Password: ");
						CustomerLogin(validEmail, sc.next(), customers);
						break;
					case 3:
						System.out.println("Customer Login");
						System.out.print("Enter Email: ");
						validEmail = checkValidCustomer(sc.next(), customers);
						System.out.print("Enter Password: ");
						CustomerLogin(validEmail, sc.next(), customers);
						System.out.print("Enter New Password: ");
						modifyPassword(validEmail, sc.next(), customers);
						break;
					case 4:
						System.out.println("Customer Login");
						System.out.print("Enter Email: ");
						validEmail = checkValidCustomer(sc.next(), customers);
						System.out.print("Enter Password: ");
						CustomerLogin(validEmail, sc.next(), customers);
						System.out.print("Enter 'YES' to UnSubcribe: ");
						unSubcribe(sc.next(), validEmail, customers);
						break;
					case 5:
						for (Customer tempCustomer : customers.values())
							System.out.println(tempCustomer);
						break;
					case 6:
						TreeMap<String, Customer> tempMap = new TreeMap<>(customers);
						tempMap.comparator();
						for (Customer tempCustomer : tempMap.values())
							System.out.println(tempCustomer);
						break;
					case 0:
						exit = true;
						System.out.println("Terminating Application...");
						Thread.sleep(1000);
						System.out.println("Byee");
						break;
					default:
						break;
					}
				} catch (DublicateEntryException e) {
					System.out.println(e.getMessage());
				} catch (LoginException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
