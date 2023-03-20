package Assignment2;

import java.util.Scanner;
/**
 * Assignment 2 CP2280 Checking to see if numbers are primes and the ints of there primes.
 *
 * @author MBLagdon
 */
public class PrimeNumberTester {

    public static void main(String[] args) {
        System.out.println("Fun with a prime number tester!");

        Scanner input = new Scanner(System.in);

        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();

        char c;

        do {
            printMenu();
            c = Character.toUpperCase(input.next().charAt(0));

            if (c == 'A') {
                System.out.print("Enter a range to go up too: ");
                int n = input.nextInt();
                System.out.println("Prime numbers up to " + n + " are: ");
                for(int i=2; i<=n; i++){
                    if (primeNumberCalculator.isPrime(i)){
                        System.out.println(i);
                    }
                }
            } else if (c == 'B') {
                System.out.print("Enter 2 numbers for a range of prime numbers: ");
                int x = input.nextInt();
                int y = input.nextInt();
                System.out.println("Prime numbers in range " + x + " up to " + y + " are:");
                for(int i=x; i<=y; i++){
                    if (primeNumberCalculator.isPrime(i)){
                        System.out.println(i);
                    }
                }
            } else if (c == 'C') {
                System.out.println("Enter a number for unique prime factorization: ");
                int n = input.nextInt();
                System.out.println("The unique prime factorization of " + n + " is:");
                System.out.println(primeNumberCalculator.getUniquePrimeFactorization(n));
            } else if (c == 'D') {
                System.out.println("Enter a range for unique prime factorization: ");
                int n = input.nextInt();
                System.out.println("The unique prime factorization: ");
                for(int i=2; i<=n; i++){
                    System.out.println(i + " is " + primeNumberCalculator.getUniquePrimeFactorization(i));
                }
            }else if (c != 'Q') {
                System.out.printf("\nOption not recognized. Try Again!");
            }

        }while (c != 'Q');

        System.out.println("\nGOODBYE!");
    }

    //System.out.println("\nDetermining a prime number");
        //for (int i = 2; i < 25; i++) {
            //System.out.printf("\n%d Prime? %b \tFactors: %5s", i,
                    //primeNumberCalculator.isPrime(i),
                    //primeNumberCalculator.getUniquePrimeFactorization(i));




    public static void printMenu(){
        System.out.println("\nSelect from the following options:");
        System.out.println("(A) Determine and display all prime numbers upto value inputted by user");
        System.out.println("(B) Print all primes between two numbers");
        System.out.println("(C) Print unique prime factorization of a number input by user");
        System.out.println("(D) Print unique prime factorization of all numbers up to a limit input by user");
        System.out.println("(Q) Quit");

    }
}
