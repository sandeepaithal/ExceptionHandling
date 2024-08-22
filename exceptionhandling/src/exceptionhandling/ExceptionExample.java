package exceptionhandling;

/**
 * Example class to demonstrate exception handling in Java.
 * This class handles an ArithmeticException by dividing a number by zero.
 * 
 * @author C SANDEEP AITHAL
 */
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This line will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed. " + e.getMessage()); // This will print the exception message
        }
        System.out.println("Program continues"); // This will always execute
    }
}
