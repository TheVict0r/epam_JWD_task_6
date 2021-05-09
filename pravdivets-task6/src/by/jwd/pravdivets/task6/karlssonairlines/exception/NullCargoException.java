package by.jwd.pravdivets.task6.karlssonairlines.exception;

public class NullCargoException extends Exception {

public NullCargoException() {
		
	}
	
	public NullCargoException(String message) {
		super(message);
	}
	
	public NullCargoException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public NullCargoException(Throwable cause) {
		super(cause);
	}
	
	
}
