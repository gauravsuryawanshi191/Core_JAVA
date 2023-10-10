package com.app.fruits;

public class Fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean fresh;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public Fruit(String colour, double weight, String name, boolean fresh) {
		this.colour = colour;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}

	public String toString() {
		return name + colour + weight;
	}

	public String taste() {
		return "No Specific Taste";
	}
}
