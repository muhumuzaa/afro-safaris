package afro_safaris.exception;

public class InvalidInputException extends RuntimeException{

	public enum ErrorType{
		FORMART_ERROR, RANGE_ERROR
	}
	
	private final ErrorType errorType;
	
	public InvalidInputException(String message, ErrorType errorType) {
		super(message);
		this.errorType = errorType;
	}
	
	
	public ErrorType getErrorType() {
		return errorType;
	}
}
