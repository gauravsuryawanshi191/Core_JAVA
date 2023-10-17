package core;

public enum Colour {
	BLACK(12000), WHITE(10000), SILVER(8000), GREY(5000), RED(9000);

	int extraCharge;

	private Colour(int extraCharge) {
		this.extraCharge = extraCharge;
	}

	public int getCharges(Colour colour) {
		return this.extraCharge;
	}

}
