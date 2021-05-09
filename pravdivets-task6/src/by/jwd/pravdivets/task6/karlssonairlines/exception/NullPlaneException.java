package by.jwd.pravdivets.task6.karlssonairlines.exception;

@SuppressWarnings("serial")
public class NullPlaneException extends Exception {
	
	public NullPlaneException() {
		
	}
	
	public NullPlaneException(String message) {
		super(message);
	}
	
	public NullPlaneException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public NullPlaneException(Throwable cause) {
		super(cause);
	}
	
	
	
}
