package exceptionPKG.utils;

import exceptionPKG.exception.SpeedOutOfRangeException;

public class Validation {
	private static int MIN_SPEED;
	private static int MAX_SPEED;
	static {
		MIN_SPEED = 80;
		MAX_SPEED = 150;
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

}
