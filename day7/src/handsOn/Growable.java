package handsOn;

import java.util.Scanner;

public class Growable implements Stack {
	private int tempsize = 2;
	private int top = -1;
	public Customer c;
	Customer[] gStack;

	public Growable() {
		gStack = new Customer[1];

	}

	@Override
	public void push() {
		if (top == gStack.length - 1) {
			growStack();
			gStack[++top] = customerEntry();
			System.out.println("Current Position:" + (top + 1));

		} else {
			gStack[++top] = customerEntry();
			System.out.println("Current Position:" + (top + 1));
		}

	}

	@Override
	public void pop() {
		if (top == -1)
			System.out.println("Stack UnderFlow!");
		else {
			System.out.println("Current Position: " + (top + 1));
			System.out.println(gStack[top--]);
		}

	}

	public void growStack() {
		Customer[] stack2 = new Customer[tempsize * 2];
		for (int i = 0; i < gStack.length; i++) {
			stack2[i] = gStack[i];
		}
		tempsize=tempsize*2;
		System.out.println(tempsize);
		gStack = stack2;
	}
	public Customer customerEntry() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Details (id,anem,address):");
		Customer c = new Customer(sc.nextInt(), sc.next(), sc.next());
		return c;
	}
}
