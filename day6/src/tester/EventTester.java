package tester;

import event.*;

public class EventTester {

	public static void main(String[] args) {
		Person[] members = { new Student("Gaurav", "Suryawanshi", "PDGAC", 206),
				new Faculty("Kartik", "Surya", "BNY", "java"), new Student("Vinayak", "Sarkar", "PGDAI", 21) };
		for (Person p : members) {
			System.out.println(p);
			if (p instanceof Student)
				((Student) p).study();
			else
				((Faculty) p).works();
		}
	}

}
