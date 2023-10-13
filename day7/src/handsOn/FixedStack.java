package handsOn;

import java.util.Scanner;

public class FixedStack implements Stack {
//	private int length;
	private int top = -1;
	public Customer c;
	Customer[] fStack;

	public FixedStack(int size) {
		fStack = new Customer[size];
	}

	@Override
	public void push() {
		if (top == fStack.length - 1)
			System.out.println("Stack OverFlow!");
		else {
			fStack[++top] = customerEntry();
			System.out.println("Current Position:" + (top + 1));
		}
	}

	@Override
	public void pop() {
		if (top == -1)
			System.out.println("Stack UnderFlow!");
		else {
			System.out.println("Current Position: " + (top + 1));
			System.out.println(fStack[top--]);
		}

	}
	public Customer customerEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Details (id,anem,address):");
		Customer c = new Customer(sc.nextInt(), sc.next(), sc.next());
		return c;
	}

}
