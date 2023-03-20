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
        int i = 2;
        String factors = "";
        while (i < n){
            while (n % i == 0){
                n /= i;
                factors = factors + " " + i;
            }
            i++;
        }
        if (n > 2){
            factors = factors + " " + n;
        }
        return String.valueOf(n);
    }

    /**
     * Get smallest denominator of n. If n is prime this will return itself
     * @param n n
     * @return smallest denominator
     */
    public static int getSmallestDenominator(int n){
        //TODO write this method
        if(n % 2 == 0)
            return 2;
        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0)
                return i;
        }
        return n;
    }



}
