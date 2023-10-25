package utils;

import java.time.LocalDate;
import java.util.Map;

import core.Brand;
import core.Colour;
import core.Material;
import core.Pen;
import exceptions.PenNotFoundException;

public class Penvalidation {
	public static Integer penIdvalidator(int penId, Map<Integer, Pen> pens) throws PenNotFoundException {
		if (pens.containsKey(penId))
			return penId;
		throw new PenNotFoundException("Pen Not Found!");
	}

	public static Brand brandValidator(String brandName) {
		return Brand.valueOf(brandName);
	}

	public static Colour colourValidator(String colour) {
		return Colour.valueOf(colour);
	}

	public static Material penMaterialValidator(String penMaterial) {
		return Material.valueOf(penMaterial);
	}

	public static LocalDate parseAndValidateListingDate(String listingDate) {
		LocalDate tempDate = LocalDate.parse(listingDate);
		LocalDate today = LocalDate.now();
		if (tempDate.isBefore(today))
			return tempDate;
		return null;
	}

	public static Pen penValidator(String brandName, String colour, String inkColour, String penMaterial,
			String listingDate, int stock, double penPrice) {
		Brand tempBrand = brandValidator(brandName);
		Colour tempColour = colourValidator(colour);
		Colour tempInkColour = colourValidator(inkColour);
		Material tempMaterial = penMaterialValidator(penMaterial);
		LocalDate tempDate = parseAndValidateListingDate(listingDate);
		Pen tempPen = new Pen(tempBrand, tempColour, tempInkColour, tempMaterial, tempDate, stock, penPrice);
		return tempPen;
	}
}
