package exceptionhandling;

/**
 * Example3 class demonstrates the use of try-catch-finally blocks in Java.
 * 
 * 
 * @author C Sandeep Aithal
 */
public class Example3 {

    public static void main(String[] args) {
        try {
            int result = 10 / 2; // This will not throw an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block, always executed.");
        }
        System.out.println("Program continues...");
    }
}
