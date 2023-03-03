package Assignment2;

/**
 * Assignment 2 CP2280 A class to generate prime numbers and break ints into products of primes.
 *
 * @author MBLagdon
 */
public class PrimeNumberCalculator {
    /**
     * Determine if a number is a prime
     * @param n natural number( > 0)
     * @return true if prime
     */
    public boolean isPrime(int n){
        //TODO write method
        if(n == 2)
            return true;
        for(int i =2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Get unique prime factorization of an int spaced by '*'.
     * Note a prime will return it's own value
     * @param n natural number ( > 0)
     * @return string of form "p1*p2*....*pN"
     */
    public String getUniquePrimeFactorization(int n){
        //TODO write method
        return String.valueOf(n);
    }



}
