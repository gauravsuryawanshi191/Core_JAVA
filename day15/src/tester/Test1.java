package tester;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static utils.StudentUtils.*;

import com.acts.core.Student;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> studentList = populateList();
//			Arrays.toString(studentList);
			for (Student s : studentList)
				System.out.println(s);
			studentList.stream().forEach(s -> System.out.println(s));
		}

	}

}
