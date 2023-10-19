package exceptions;

public class LoginException extends Exception {
	public LoginException(String errMessage) {
		super(errMessage);
	}
}
