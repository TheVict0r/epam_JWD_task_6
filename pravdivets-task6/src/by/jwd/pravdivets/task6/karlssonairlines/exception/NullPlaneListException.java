package by.jwd.pravdivets.task6.karlssonairlines.exception;

@SuppressWarnings("serial")
public class NullPlaneListException extends Exception {
	
	public NullPlaneListException() {
		
	}
	
	public NullPlaneListException(String message) {
		super(message);
	}
	
	public NullPlaneListException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public NullPlaneListException(Throwable cause) {
		super(cause);
	}
	
	
	
}
