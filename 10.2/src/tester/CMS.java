package tester;

import java.util.ArrayList;
import java.util.Scanner;

import core.Customer;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("!Welcome to Customer Management System!");
			ArrayList<Customer> customerlist = new ArrayList<>();
			boolean exit = false;
			System.out.println("Options\r\n" + "1. Sign up (customer registration)\n" + "2. Sign in (login)\n"
					+ "3. Change password\n" + "4. Un subscribe customer\n" + "5. Display all customers.\n"
					+ "0. Exit \n" + "");
			while (!exit) {
				System.out.print("Enter Choice: ");
				switch (sc.nextInt()) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					break;
				case 0:
					System.out.println("Terminating Application...");
					exit = true;
					break;
				default:
					System.out.println("Enter Valid Option.");
					break;
				}
			}
		}

	}

}
