package tester;

import java.util.Scanner;

import handsOn.Customer;
import handsOn.FixedStack;
import handsOn.Growable;
import handsOn.Stack;

public class StackTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			boolean exit1 = true;
			boolean stackSelected = false;
			Stack stack = null;
			while (exit1) {
				System.out.println("=======================================================================================");
				System.out.println(
						"1.Choose Fixed Stack\n2.Choose Growable Stack\n3.Push Customer\n4.Pop Customer\n5.Exit");
				System.out.print("Enter Choice: ");
				switch (sc.nextInt()) {
				case 1:
					System.out.print("Enter Size: ");
					stack = new FixedStack(sc.nextInt());
					stackSelected = true;
					break;
				case 2:
					stack = new Growable();
					System.out.println("Using Growable Size!");
					stackSelected = true;
					break;
				case 3:
					if (stackSelected) {
							stack.push();
					} else
						System.out.println("Select Stack First!");
					break;
				case 4:
					if (stackSelected) {
						stack.pop();
					} else
						System.out.println("Select Stack First!");
					break;
				case 5:
					System.out.println("Terminating Application!");
					exit1 = false;
				default:
					System.out.println("Enter Valid Choice!");
					break;
				}
			}
		}
	}

}
