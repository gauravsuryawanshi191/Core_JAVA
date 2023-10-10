package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String colour, double weight, String name, boolean fresh) {
		super(colour, weight, name, fresh);
	}

	@Override
	public String taste() {
		return "Sweet and Sour";
	}

	// public void jam() {Display name of the fruit + a mesg making jam!}
	public void jam() {
		System.out.println("Name:" + getName() + "\nMaking Jam!");
	}
}
