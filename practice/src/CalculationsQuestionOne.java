//---------------------------------------------------------------------------------
// Assignment 1
// Written by: Margi Patel (40263423), July 7th 2024
// For Comp 248 Section CC - Summer 2024
//---------------------------------------------------------------------------------

import java.util.Scanner;

/**
 * This program demonstrates simple mathematical calculations using Java.
 * It accepts two types of input (integer and double) from the user,
 *      then calculates quotient and modulus.
 * One of the example demonstrates type casting as well.
 */

public class CalculationsQuestionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // welcome message
        System.out.printf("%s%n%s%n", "Welcome to the Java programs that does Simple Calculations:", "-".repeat(70));

        // prompt for two integer values
        System.out.println("Enter two integers separated by a space: ");
        final int NUM_ONE_INT = sc.nextInt();
        final int NUM_TWO_INT = sc.nextInt();

        // prompt for two double values
        System.out.println("Enter two doubles separated by a space: ");
        final double NUM_ONE_DOUBLE = sc.nextDouble();
        final double NUM_TWO_DOUBLE = sc.nextDouble();

        // calculate quotient
        int resultInt = NUM_ONE_INT / NUM_TWO_INT;
        double resultDouble = NUM_ONE_DOUBLE / NUM_TWO_DOUBLE;

        // display result (int): int / int
        System.out.println("The result of " + NUM_ONE_INT + " / " + NUM_TWO_INT + " is " + resultInt);

        // display result (double): double / double
        System.out.println("The result of " + NUM_ONE_DOUBLE + " / " + NUM_TWO_DOUBLE + " is " + resultDouble);

        // display result (double): int / double
        resultDouble = NUM_ONE_INT / NUM_TWO_DOUBLE;
        System.out.println("The result of " + NUM_ONE_INT + " / " + NUM_TWO_DOUBLE + " is " + resultDouble);

        // display result (int): int % int
        resultInt = NUM_ONE_INT % NUM_TWO_INT;
        System.out.println("The result of " + NUM_ONE_INT + " % " + NUM_TWO_INT + " is " + resultInt);

        // display result (int): double / double
        resultInt = (int) (NUM_ONE_DOUBLE / NUM_TWO_DOUBLE);
        System.out.println("The result of " + NUM_ONE_DOUBLE + " / " + NUM_TWO_DOUBLE + " is " + resultInt);

        sc.close();
        System.out.println("\nEnding the program!");

    } // end of main()
} // end of class CalculationsQuestionOne