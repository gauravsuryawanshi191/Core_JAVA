package core;

import java.time.LocalDate;
import java.util.Objects;

public class Customer {
	/*
	 * Customer class (core class) state : customer id(int) ,first name, last name
	 * (string),email(string),password(string),registrationAmount(double),dob(
	 * LocalDate),plan(ServicePlan : enum) idGenerator : static Must generate
	 * customer ids automatically : auto increment) PK(UID) : email
	 * 
	 * ctors 1. all args ctor 2. PK based ctor
	 */

	private int customer_id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private int registrationAmount;
	private LocalDate dateOfBirth;
	private ServicePlan servicePlan;
	private static int idGenerator;


	public Customer(String firstName, String lastName, String emailId, String password, int registrationAmount,
			LocalDate dateOfBirth, ServicePlan servicePlan) {
		super();
		this.customer_id = ++idGenerator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dateOfBirth = dateOfBirth;
		this.servicePlan = servicePlan;
	}

	@Override
	public String toString() {
		return "customer_id=" + customer_id + ", Name=" + firstName + " " + lastName + ",\nemailId=" + emailId
				+ ",\nregistrationAmount=" + registrationAmount + ",\ndateOfBirth=" + dateOfBirth + ",\nservicePlan="
				+ servicePlan + "\n";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(emailId);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Customer other = (Customer) obj;
//		return Objects.equals(emailId, other.emailId);
//	}
	

	public String getPassword() {
		return password;
	}

	public ServicePlan getServicePlan() {
		return servicePlan;
	}

	public void setServicePlan(ServicePlan servicePlan) {
		this.servicePlan = servicePlan;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
