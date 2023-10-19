package utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import core.Brand;
import core.Car;
import core.Colour;
import exceptions.CarHandlingException;
import static java.time.LocalDate.parse;

import java.time.LocalDate;;

public class ShoowroomUtils {
	public static Car findByChasis(String chasisNo, ArrayList<Car> carList) throws CarHandlingException {
		Car tempCar = new Car(chasisNo);
		int index = carList.indexOf(tempCar);
		if (index == -1)
			throw new CarHandlingException("Car Not Found!");
		return carList.get(index);
	}

	public static Car discountOnCAr(Car tempCar, int discount, ArrayList<Car> carList) throws CarHandlingException {
		tempCar.setBasePrice(tempCar.getBasePrice() - discount);
		System.out.println("Discount Applied:");
		return tempCar;
	}

	public static Car discountAllOldCars(String date, ArrayList<Car> carList) {
		LocalDate limitDate = parse(date);
		for (Car c : carList)
			if (c.getManuf_Date().isBefore(limitDate))
				return c;
		return null;
	}

	public static ArrayList<Car> populateShowroom() {
		// create empty List
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Car("abc-1000", Colour.BLACK, 200000, parse("2023-01-01"), Brand.MAHINDRA));
		carList.add(new Car("abc-1010", Colour.WHITE, 250000, parse("2022-01-01"), Brand.HONDA));

		carList.add(new Car("abc-1003", Colour.WHITE, 230000, parse("2021-11-05"), Brand.MAHINDRA));

		carList.add(new Car("abc-1002", Colour.GREY, 280000, parse("2022-06-01"), Brand.SUZUKI));

		carList.add(new Car("abc-1009", Colour.SILVER, 250000, parse("2023-08-01"), Brand.TATA));

		carList.add(new Car("abc-1005", Colour.BLACK, 240000, parse("2020-11-01"), Brand.FORD));

		carList.add(new Car("abc-1007", Colour.BLACK, 290000, parse("2022-11-23"), Brand.TATA));

		return carList;
	}
}
