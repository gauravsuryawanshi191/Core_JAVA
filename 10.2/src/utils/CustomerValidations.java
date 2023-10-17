package utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static java.time.LocalDate.*;
import java.util.ArrayList;

import core.Customer;
import core.ServicePlan;
import exceptions.DateOfBirthException;
import exceptions.DublicateEntryException;
import exceptions.PlanMismatchException;

public class CustomerValidations {
	public static void checkDublicate(String email, ArrayList<Customer> customerList) throws DublicateEntryException {
		Customer tempCustomer = new Customer(email);
		if (customerList.equals(tempCustomer))
			throw new DublicateEntryException("Email already exists!\n" + "Try another Email");
	}

	public static LocalDate validateAndParseDOB(String dateOfBirth) throws DateOfBirthException,DateTimeParseException {
		LocalDate tempDate = parse(dateOfBirth);
		LocalDate limit = of(2005, 1, 1);
		if (tempDate.isAfter(limit))
			throw new DateOfBirthException("Minor Customer!\n Get Lost");
		return tempDate;
	}

	public static ServicePlan validateAndParsePlan(String servicePlan) throws IllegalArgumentException {
		return ServicePlan.valueOf(servicePlan.toUpperCase());
	}

	public static void planAmountValidation(String servicePlan, int amount) throws PlanMismatchException {
		ServicePlan tempPlan = validateAndParsePlan(servicePlan);
		if (amount != tempPlan.getCharges())
			throw new PlanMismatchException("Amount And Selected Plan Mismatch!");
	}

	public static Customer superValidater(String firstName, String lastName, String emailId, String password,
			int registrationAmount, String dateOfBirth, String servicePlan, ArrayList<Customer> customers)
			throws DublicateEntryException, DateOfBirthException, PlanMismatchException {
		checkDublicate(emailId, customers);
		LocalDate tempDOB = validateAndParseDOB(dateOfBirth);
		ServicePlan tempPlan = validateAndParsePlan(servicePlan);
		planAmountValidation(servicePlan, registrationAmount);
		return new Customer(firstName, lastName, emailId, password, registrationAmount, tempDOB, tempPlan);
	}
}
