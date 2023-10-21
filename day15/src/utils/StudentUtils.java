package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.LocalDate.parse;

import com.acts.core.Course;
import com.acts.core.Student;

import custom_exceptions.StudentHandlingException;

public class StudentUtils {
//add a method for parsing string --> Course (enum)
	public static Course parseAndValidateCourse(String course) {
		return Course.valueOf(course.toUpperCase());
	}

	// add a method for parsing string --> LocalDate (dob)
	public static LocalDate parseDob(String dob) {
		return LocalDate.parse(dob);
	}

	// add a method for checking for dup student(PRN)
	public static void checkForDup(String prn1, HashMap<String, Student> students1) throws StudentHandlingException {
		if (students1.containsKey(prn1))
			throw new StudentHandlingException("Dup PRN !!!!!");
		System.out.println("no dup....");
	}

	public static List<Student> populateList() {
		List<Student> studentsList = new ArrayList<Student>();
		Student s1 = new Student("abc-100", "Gaurav", "Surya", 99, Course.DAC, parse("2001-09-01"));
		Student s2 = new Student("abc-103", "saurabh", "wadekar", 90, Course.DAI, parse("2000-05-10"));
		Student s3 = new Student("abc-110", "Shubham", "erande", 88, Course.DBDA, parse("1999-01-03"));
		Student s4 = new Student("abc-102", "Yug", "misra", 85, Course.DITISS, parse("1999-02-05"));
		Student s5 = new Student("1bc-99", "rohil", "Gupta", 70, Course.DMC, parse("2001-08-23"));
		Student s6 = new Student("1bc-98", "rithik", "Gupta", 71, Course.DMC, parse("2001-08-23"));
		return studentsList;
	}

	public static Map<String, Student> populateMap(List<Student> studentsList) {
		Map<String, Student> studentsMap = new HashMap<String, Student>();
		for (Student s : studentsList)
			studentsMap.put(s.getPrn(), s);
		return studentsMap;
	}

}
