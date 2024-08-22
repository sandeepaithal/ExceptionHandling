package exceptionhandling;

/**
 * Example2 class demonstrates handling multiple exceptions in Java. 
 * 
 * @author C Sandeep Aithal
 */
public class Example2 {
	public static void main(String[] args) {
		try {
			int[] arr = { 1, 3, 4 }; // Array with 3 elements
			System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error: Array index is out of bounds. " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("Error: Arithmetic exception occurred. " + e.getMessage());
		}
		System.out.println("Program continues."); // This will always execute
	}
}
