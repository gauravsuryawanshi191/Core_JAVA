package event;

public class Person {
	private String firstName;
	private String LastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.LastName = lastName;
	}

	@Override
	public String toString() {
		return firstName +" "+ LastName;
	}
}
