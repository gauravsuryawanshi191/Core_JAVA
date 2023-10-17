package core;

import java.time.LocalDate;

public class Car {
//1. Vehicle details : chasisNo(string) : Unique ID, color(enum) , basePrice(double) , manufactureDate(Date),company,isAvailable

	private String chasisNo;
	private Colour colour;
	private double basePrice;
	private LocalDate manuf_Date;
	private Brand brand;
	private boolean isAvailable;

	public Car(String chasisNo, Colour colour, double basePrice, LocalDate manuf_Date, Brand brand) {
		super();
		this.chasisNo = chasisNo;
		this.colour = colour;
		this.basePrice = basePrice;
		this.manuf_Date = manuf_Date;
		this.brand = brand;
		this.isAvailable = true;
	}

	public Car(String chasisNo2) {
		this.chasisNo = chasisNo2;
	}

	@Override
	public String toString() {
		return "Car [chasisNo=" + chasisNo + ", colour=" + colour + ", basePrice=" + basePrice + ", manuf_Date="
				+ manuf_Date + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car anotherCar = (Car) obj;
			return this.chasisNo.equals(anotherCar.chasisNo);
		}
		return false;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

}
