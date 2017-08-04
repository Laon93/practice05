package prob05;

public class MyStackException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public MyStackException() {
		super("MyStackException : Exception Occur");
	}
	
	public MyStackException(String message) {
		super(message);
	}

}
