package exceptionPKG.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import exceptionPKG.exception.ExpiryException;
import exceptionPKG.exception.SpeedOutOfRangeException;

public class Validation {
	private static int MIN_SPEED;
	private static int MAX_SPEED;
	static {
		MIN_SPEED = 80;
		MAX_SPEED = 150;
	}
	private static SimpleDateFormat sdf;
	static {
		System.out.println("in static init block");
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public static void speedChecker(int speed) throws SpeedOutOfRangeException {
		if (speed < MIN_SPEED) {
			throw new SpeedOutOfRangeException("Low Speed");
		}
		if (speed > MAX_SPEED) {
			throw new SpeedOutOfRangeException("High Speed");
		}
		System.out.println("OK Speed");
	}

	public static void licenceValidation(String date) throws ExpiryException, ParseException {
		Date expDate = sdf.parse(date);
		if (expDate.before(new Date())) {
			throw new ExpiryException();
		}
		System.out.println("License Valid.");
	}

}
