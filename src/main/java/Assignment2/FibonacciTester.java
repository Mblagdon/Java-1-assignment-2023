package Assignment2;

/**
 * Assignment 2 CP2280 Checking the fibonacci calculator to see if numbers are fibonacci numbers
 *
 * @author MBlagdon
 */
public class FibonacciTester {

    public static void main(String[] args) {

        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

        System.out.println("\nPrinting Fibonacci Numbers");

        //Print first 10
        for (int i = 0; i < 10 ; i++) {
            System.out.printf("\nPos %d, Value: %d", i, fibonacciCalculator.getFibonacciNumber(i));

        }
        System.out.print("\n\nChecking for Fibonacci Numbers");
        //Check first 25 numbers
        for (int i = 1; i <= 25 ; i++) {
            System.out.printf("\nIs %d a Fibonacci Number? %b", i, fibonacciCalculator.isFibonacciNumber(i));

        }
    }
}
