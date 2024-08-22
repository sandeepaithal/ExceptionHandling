package exceptionhandling;

/**
 * Example4 class demonstrates how to throw and catch custom exceptions in Java.
 * 
 
 * @author C Sandeep Aithal
 * @version 1.0
 */
public class Example4 {

    /**
     * Validates the age provided. If the age is less than 18, an exception is thrown.
     *
     * @param age The age to validate.
     * @throws Exception if the age is less than 18.
     */
    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception because age is less than 18
        } catch (Exception e) {
            System.err.println("Caught an exception: " + e.getMessage());
        }
        System.out.println("Program continues.");
    }
}
