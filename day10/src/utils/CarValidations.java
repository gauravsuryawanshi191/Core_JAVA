package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.LocalDate.*;

import core.*;
import exceptions.*;

public class CarValidations {
	public static void checkDublicate(String chasisNo, ArrayList<Car> cars) throws DuplicateException {
		Car newCar = new Car(chasisNo);
		if (cars.equals(newCar))
			throw new DuplicateException("Car Present!");
	}

	public static LocalDate validateAndParseDate(String date) throws DateException {
		LocalDate tempDate = parse(date);
		LocalDate limit = of(2020, 1, 1);
		if (tempDate.isBefore(limit))
			throw new DateException("Old Car!");
		return tempDate;
	}

	public static Colour validateAndParseColour(String colour) throws ColourException {
		return Colour.valueOf(colour.toUpperCase());
//			throw new ColourException("No "+colour+" Car Avaialable!");
	}

	public static Brand validateAndParseBrand(String brand) throws BrandException {
		return Brand.valueOf(brand.toUpperCase());
	}
	public static Car superValidation(String chasisNo, String colour, double basePrice,String manuf_Date, String brand, ArrayList<Car> cars) throws DuplicateException {
	checkDublicate(chasisNo, cars);
	return null;
	}
}
