package utils;

import java.util.ArrayList;

import core.Customer;
import core.ServicePlan;
import exceptions.LoginException;
import static java.time.LocalDate.parse;;

public class CustomerSupport {
	public static void CustomerLogin(String emailId, String password, ArrayList<Customer> custList)
			throws LoginException {
		Customer tempCustomer = new Customer(emailId);
		int index = custList.indexOf(tempCustomer);
		if (index == -1)
			throw new LoginException("Invalid Email!");
		else {
			if (custList.get(index).getPassword().toString().equals(password))
				System.out.println("Welcome\nUser Loged In");
			else
				throw new LoginException("Invalid Password");

		}
	}

	public static void passwordModification(String emailId, String OldPassword, String newPassword,
			ArrayList<Customer> custList) throws LoginException {
		CustomerLogin(emailId, OldPassword, custList);
		Customer tempCustomer = new Customer(emailId);
		custList.get(custList.indexOf(tempCustomer)).setPassword(newPassword);
	}
	public static void unSubcribe(String emailId, String OldPassword, String confirmation,
			ArrayList<Customer> custList) throws LoginException {
		CustomerLogin(emailId, OldPassword, custList);
		Customer tempCustomer = new Customer(emailId);
		if(confirmation.toUpperCase().equals("YES"))
			custList.remove(custList.indexOf(tempCustomer));
		System.out.println("Abort!");
	}

	public static ArrayList<Customer> data() {
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Gaurav", "Suryawanshi", "gs@gmail.com", "qwertyuiop", 10000, parse("2001-09-01"),
				ServicePlan.PLATINUM));
		customers.add(new Customer("Vinayak", "Sarkar", "vs@gmail.com", "poiuytrewq", 5000, parse("1992-02-29"),
				ServicePlan.DIAMOND));
		customers.add(
				new Customer("Raj", "Kumar", "rj@gmail.com", "12345678", 2000, parse("2000-04-10"), ServicePlan.GOLD));

		return customers;
	}
}
