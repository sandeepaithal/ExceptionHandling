package exceptionhandling;

/**
 * Demonstrates the creation and usage of a custom exception in Java.
 * @author C Sandeep Aithal
 */
public class Example5 {

	// Define a custom exception by extending the Exception class
	static class InvalidAgeException extends Exception {
		public InvalidAgeException(String message) {
			super(message);
		}
	}

	// Method to check age and throw custom exception if age is invalid
	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age is less than 18, access denied.");
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(15); // This will throw an InvalidAgeException
		} catch (InvalidAgeException e) {
			System.err.println("Caught an exception: " + e.getMessage());
		}
		System.out.println("Program continues...");
	}
}
