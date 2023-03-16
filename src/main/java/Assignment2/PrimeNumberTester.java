package Assignment2;
/**
 * Assignment 2 CP2280 Checking to see if numbers are primes and the ints of there primes.
 *
 * @author MBLagdon
 */
public class PrimeNumberTester {

    public static void main(String[] args) {

        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();

        System.out.println("\nDetermining a prime number");

        for (int i = 2; i < 25; i++) {
            System.out.printf("\n%d Prime? %b \tFactors: %5s", i,
                    primeNumberCalculator.isPrime(i),
                    primeNumberCalculator.getUniquePrimeFactorization(i));
        }
    }
}
