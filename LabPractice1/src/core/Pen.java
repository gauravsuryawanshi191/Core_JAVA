package core;

import java.time.LocalDate;

/*
A company StyleWithPen sells stylish Pens online. 
Company needs an interface for site admin to manage stocks.

Write a console-based menu driven java program for site ADMIN to perform following operations: 

1. Add new Pen
2. Update stock of aPen
3.Set discount of 20% for all the pens which are not at all sold in last 3 months
4. Remove Pens which arenever sold once listed in 9 months

You can define a class Pen with the following fields – 
a.	ID (unique identifier for each Pen, should be generated automatically)
b.	Brand (Example:  Cello, Parker, Reynolds etc.)
c.	Color
d.	InkColor
e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
f.	Stock (Available quantity)
g.	Stock Update Date (it changed every time when admin update stock or user order executed)
h.	Stock Listing Date (date on which product is added to site for sale)
i.	Price (in INR) 
j.	Discounts (in percentage)

Note: You can use java collection to store items in memory. 


 */
public class Pen {
	private int penId;
	private Brand brandName;
	private Colour colour;
	private Colour inkColour;
	private Material penMaterial;
	private int stock;
	private LocalDate updateDate;
	private LocalDate listingDate;
	private double penPrice;
	private double discountPercentage;
	private static int idGenerator = 0;

	public Pen(Brand brandName, Colour colour, Colour inkColour, Material penMaterial, LocalDate listingDate, int stock,
			double penPrice) {
		super();
		this.brandName = brandName;
		this.colour = colour;
		this.inkColour = inkColour;
		this.penMaterial = penMaterial;
		this.stock = stock;
		this.penPrice = penPrice;
		this.penId = ++idGenerator;
		this.listingDate = listingDate;
		this.updateDate = listingDate;
		this.discountPercentage = 0;
	}

	public int getPenId() {
		return penId;
	}

	public void setPenId(int penId) {
		this.penId = penId;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public double getPenPrice() {
		return penPrice - (penPrice * (discountPercentage/100));
	}

	public void setPenPrice(double penPrice) {
		this.penPrice = penPrice;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public LocalDate getListingDate() {
		return listingDate;
	}

	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}

	@Override
	public String toString() {
		return "Pen [penId=" + penId + ", brandName=" + brandName + ", colour=" + colour + ", inkColour=" + inkColour
				+ ", penMaterial=" + penMaterial + ", stock=" + stock + ", updateDate=" + updateDate + ", listingDate="
				+ listingDate + ", penPrice=" + getPenPrice() + ", discountPercentage=" + discountPercentage + "]";
	}

}
