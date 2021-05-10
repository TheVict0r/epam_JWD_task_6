package by.jwd.pravdivets.task6.karlssonairlines.exception;

@SuppressWarnings("serial")
public class InvalidPlaneDataException extends Exception {
	public InvalidPlaneDataException() {
		
	}
	
	public InvalidPlaneDataException(String message) {
		super(message);
	}
	
	public InvalidPlaneDataException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public InvalidPlaneDataException(Throwable cause) {
		super(cause);
	}
	

}
