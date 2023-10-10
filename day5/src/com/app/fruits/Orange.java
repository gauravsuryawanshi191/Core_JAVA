package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String colour, double weight, String name, boolean fresh) {
		super(colour, weight, name, fresh);
	}

	@Override
	public String taste() {
		return "Sour";
	}

	// public void juice() {Display name n weight of the fruit + a mesg extracting
	// juice!}
	public void juice() {
		System.out.println("Name:" + this.getName() + "\nWeight:" + this.getWeight() + "\nExtracting Juice!");
	}
}
