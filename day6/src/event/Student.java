package event;

public class Student extends Person {
	private String className;
	private int id;

	public Student(String firstName, String lastName, String className, int id) {
		super(firstName, lastName);
		this.className = className;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student Name:" + super.toString() + "\nid:" + id + "\nClass:" + className;
	}
	
	public void study() {
		System.out.println("Studies in Class:"+className);
	}

}
