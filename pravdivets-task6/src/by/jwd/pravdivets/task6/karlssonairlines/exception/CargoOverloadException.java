package by.jwd.pravdivets.task6.karlssonairlines.exception;

public class CargoOverloadException extends Exception {
	
	public CargoOverloadException() { 	}

	public CargoOverloadException(String message) {
		super(message);
	}

	public CargoOverloadException(String message, Throwable cause) {
		super(message, cause);
	}

	public CargoOverloadException(Throwable cause) {
		super(cause);
	}

}
