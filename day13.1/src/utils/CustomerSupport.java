package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import core.Customer;
import core.ServicePlan;
import exceptions.LoginException;
import static java.time.LocalDate.parse;;

public class CustomerSupport {

	public static Customer CustomerLogin(String emailId, String password, Map<String, Customer> custMap)
			throws LoginException {
		if (password.equals(custMap.get(emailId).getPassword())) {
			System.out.println("Welcome\nCustomer LogedIn!");
			return custMap.get(emailId);
		}
		throw new LoginException("Invalid Password.");
	}

	public static String checkValidCustomer(String emailId, Map<String, Customer> custMap) throws LoginException {
		if (custMap.containsKey(emailId)) {
			System.out.println("Valid Customer!");
			return emailId;
		}
		throw new LoginException("Customer Not Found.");
	}

	public static String modifyPassword(String email, String newPassword, Map<String, Customer> custMap) {
		String oldPass = custMap.get(email).getPassword();
		custMap.get(email).setPassword(newPassword);
		return "Old Password:" + oldPass + "\nNew Password:" + newPassword;
	}

	public static void unSubcribe(String choice, String email, Map<String, Customer> custMap) {
		if (choice.toUpperCase().equals("YES")) {
			custMap.get(email).setServicePlan(null);
			System.out.println("Unsubcribed!");
		}
		else
			System.out.println("Abort.");
	}

//	public static void unSubcribe(String emailId, String OldPassword, String confirmation,
//			ArrayList<Customer> custList) throws LoginException {
//		CustomerLogin(emailId, OldPassword, custList);
//		Customer tempCustomer = new Customer(emailId);
//		if(confirmation.toUpperCase().equals("YES"))
//			custList.remove(custList.indexOf(tempCustomer));
//		System.out.println("Abort!");
//	}
	public static Map<String, Customer> populatingMap() {
		Map<String, Customer> tempMap = new HashMap<>();
		Customer c1 = new Customer("gaurav", "surya", "gaurav@g.com", "12345678", 5000, parse("2001-09-01"),
				ServicePlan.DIAMOND);
		Customer c2 = new Customer("atharva", "pawar", "atharva@g.com", "87654321", 2000, parse("2000-10-16"),
				ServicePlan.GOLD);
		Customer c3 = new Customer("vinayak", "sarkar", "vsarkar@g.com", "qwerty", 10000, parse("1992-02-29"),
				ServicePlan.PLATINUM);
		tempMap.put("gaurav@g.com", c1);
		tempMap.put("atharva@g.com", c2);
		tempMap.put("vsarkar@g.com", c3);

		return tempMap;
	}
}
