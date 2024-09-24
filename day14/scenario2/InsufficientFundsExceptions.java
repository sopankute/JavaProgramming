package myexceptions.user;

public class InsufficientFundsExceptions extends Exception {

	public InsufficientFundsExceptions(String errMessage) {
		super(errMessage);
	}
}