package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String colour, double weight, String name, boolean fresh) {
		super(colour, weight, name, fresh);
	}

	@Override
	public String taste() {
		return "Sweet";
	}

	// public void pulp() {Display name n color of the fruit + a mesg creating
	// pulp!}
	public void pulp() {
		System.out.println("Name:" + this.getName() + "\nColour:" + this.getColour() + "\nCreating Pulp!");
	}
}
