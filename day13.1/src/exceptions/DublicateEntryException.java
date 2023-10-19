package exceptions;

public class DublicateEntryException extends Exception {
	public DublicateEntryException(String errMessage) {
		super(errMessage);
	}
}
