package com.acts.core;

import java.time.LocalDate;

/*
 * Fields  : prn (string) : unique ID ,complete name(first name n last name), 
 * marks,course(enum), dob(LocalDate)
 */
public class Student {
	private String prn;
	private String firstName;
	private String lastName;

	public String getPrn() {
		return prn;
	}

	private int marks;
	private Course enrolledCourse;
	private LocalDate dob;

	public Student(String prn, String firstName, String lastName, int marks, Course enrolledCourse, LocalDate dob) {
		super();
		this.prn = prn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.marks = marks;
		this.enrolledCourse = enrolledCourse;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", firstName=" + firstName + ", lastName=" + lastName + ", marks=" + marks
				+ ", enrolledCourse=" + enrolledCourse + ", dob=" + dob + "]";
	}

	public void setEnrolledCourse(Course enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Course getEnrolledCourse() {
		return enrolledCourse;
	}

}
