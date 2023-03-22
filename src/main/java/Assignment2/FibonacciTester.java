package Assignment2;

import java.util.Scanner;

/**
 * Assignment 2 CP2280 Checking the fibonacci calculator to see if numbers are fibonacci numbers
 *
 * @author MBlagdon
 */

/**
 * A FibonacciTester for the FibonacciCalculator
 */
public class FibonacciTester {

    public static void main(String[] args) {
        System.out.println("Fun with a Fibonacci Tester!");

        Scanner input = new Scanner(System.in);


        char c;

        do{
            printMenu();
            c = Character.toUpperCase(input.next().charAt(0));

            if(c=='A'){
                System.out.print("Enter a number: ");
                int n = input.nextInt();
                for (int i = 0; i < n; i++) {
                    if (FibonacciCalculator.isFibonacciNumber(i)){
                        System.out.println(i + " ");
                    }
                    }
            }else if(c == 'B'){
                System.out.print("Enter a number: ");
                int n = input.nextInt();
                for (int i = 0; i <= n; i++) {
                    System.out.printf("\nPos %d, Value: %d\n", i, FibonacciCalculator.getFibonacciNumber(i));
                }
            }else if(c == 'C') {
                System.out.println("Enter a number: ");
                int n = input.nextInt();
                if (FibonacciCalculator.isFibonacciNumber(n)) {
                    System.out.println(n + " is a Fibonacci Number!");
                } else {
                    System.out.println(n + " is not a Fibonacci Number!");
                }
            }else if (c != 'Q') {
                System.out.printf("\nOption not recognized. Try Again!");
            }

            }while (c != 'Q');

        System.out.println("\nGOODBYE!");
        }

    /**
     * A printmenu to display options
     */
    public static void printMenu(){
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("|               Select from the following options:                     |");
        System.out.println("+----------------------------------------------------------------------+");
        System.out.println("|(A) Display all Fibonacci Numbers upto inputted value                 |");
        System.out.println("|(B) Print n Fibonacci Numbers                                         |");
        System.out.println("|(C) Check to determine if inputted value is a Fibonacci Number        |");
        System.out.println("|(Q) Quit                                                              |");
        System.out.println("+----------------------------------------------------------------------+");

    }


}
