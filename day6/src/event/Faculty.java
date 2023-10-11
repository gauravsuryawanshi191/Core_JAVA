package event;

public class Faculty extends Person {
	private String dep;
	private String subject;

	public Faculty(String firstName, String lastName, String dep, String subject) {
		super(firstName, lastName);
		this.dep = dep;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Faculty Name:" + super.toString() + "\nDepartment:" + dep + "\nSubject:" + subject;
	}
	public void works() {
		System.out.println("Works in "+dep);
	}
}
