//---------------------------------------------------------------------------------
// Assignment 1
// Written by: Margi Patel (40263423), July 7th 2024
// For Comp 248 Section CC - Summer 2024
//---------------------------------------------------------------------------------

import java.util.Scanner;

/**
 * Invoice Generator for the Property School Taxes for the city of Montréal
 *
 */

public class InvoiceGeneratorQuestionTwo {
    public static void print(String message) {
        System.out.print(message);
    }

    public static void main(String[] args) {
        // welcome message
        System.out.printf("%s%n%s%n", "Welcome to the Montréal Property School Tax Invoice Generator:", "-".repeat(70));
        print("Please enter the client info:\n\n");

        final String MAILING_ADDRESS = "C.P. 11071, succurcale Centre-ville, Montréal (QC) H3C 5A9";
        final String PHONE_NUMBER = "(514) 384-5034";
        final String CITY = "MONTRÉAL";
        final String PROVINCE = "QC";
        final double EXEMPTION_VALUE = 25000.00;
        final double PERCENT = 0.95;
        final double SCHOOL_TAX = 0.1024;

        Scanner sc = new Scanner(System.in);
        String firstName, lastName, address, postalCode, accountNumber;
        double propertyValue, imposableValue, installmentValue, totalSchoolTax = 0.00;
        int startDayOfInvoicePeriod, startMonthOfInvoicePeriod, startYearOfInvoicePeriod, endDayOfInvoicePeriod, endMonthOfInvoicePeriod, endYearOfInvoicePeriod;

        print("First Name ? ");
        firstName = sc.nextLine();

        print("Last Name ? ");
        lastName = sc.nextLine();

        print("Address: ");
        address = sc.nextLine();

        print("Postal Code: ");
        postalCode = sc.nextLine();

        print("Please enter the Account Number:\n");
        accountNumber = sc.nextLine();

        print("Please enter the Property Value:\n");
        propertyValue = sc.nextDouble();

        print("Start Day Of invoice period (between 1 and 31) ? ");
        startDayOfInvoicePeriod = sc.nextInt();

        print("Start Month Of invoice period (between 1 and 12) ? ");
        startMonthOfInvoicePeriod = sc.nextInt();

        print("Start Year Of invoice period (between 1920 and 2024) ? ");
        startYearOfInvoicePeriod = sc.nextInt();

        print("End Day Of invoice period (between 1 and 31) ? ");
        endDayOfInvoicePeriod = sc.nextInt();

        print("End Month of invoice period (between 1 and 12) ? ");
        endMonthOfInvoicePeriod = sc.nextInt();

        print("End Year Of invoice period (between 1920 and 2024) ? ");
        endYearOfInvoicePeriod = sc.nextInt();

        sc.close();

        System.out.printf("%s%n", "-".repeat(100));
        System.out.printf("%s%s%n", "\t".repeat(7), "Montréal Property School Tax Invoice");
        System.out.printf("%s%n", "-".repeat(100));

        System.out.printf("%s%s%s%n", "Mail To", "\t".repeat(20), "Phone");
        System.out.printf("%s%s%s%n", MAILING_ADDRESS, "\t".repeat(7), PHONE_NUMBER);
        System.out.printf("%s%n", "-".repeat(100));

        // TO DO: Fix the formatting to make sure it's properly aligned from the right
        System.out.printf("%s%s%s%s%n", "\t".repeat(3), "Account Number", "\t".repeat(8), "Imposition Period");
        System.out.printf("%s%s%s%-15s%n", "\t".repeat(10), "Year\tMonth\tDay", "\t".repeat(4), "Year\tMonth\tDay");
        System.out.printf("%s%s%s%d\t%d\t\t%d%s%d\t%d\t\t%d%n", "\t".repeat(3), accountNumber, "\t".repeat(5), startYearOfInvoicePeriod, startMonthOfInvoicePeriod, startDayOfInvoicePeriod, "\t\tTo\t\t", endYearOfInvoicePeriod, endMonthOfInvoicePeriod, endDayOfInvoicePeriod);

        print("Owner:\n");
        System.out.printf("%s%s %s%n", "\t".repeat(2), firstName.toUpperCase(), lastName.toUpperCase());
        System.out.printf("%s%s%n", "\t".repeat(2), address.toUpperCase());
        System.out.printf("%s%s %s %s%n%n", "\t".repeat(2), CITY, PROVINCE, postalCode.toUpperCase());

        // calculations
        imposableValue = (propertyValue - EXEMPTION_VALUE) * PERCENT;
        totalSchoolTax = imposableValue * SCHOOL_TAX / 100;
        installmentValue = totalSchoolTax / 2;

        System.out.printf("%s\t\t%s\t\t\t%s\t\t\t%s\t\t%s%n", "Property Value", "Exemption", "Percentage", "Imposable Value", "Tax Rate/100");
        System.out.printf("%.2f%s%.2f%s%.2f%s%.2f%s%.4f", propertyValue, " $\t\t\t- ", EXEMPTION_VALUE, " $\t\tX ", PERCENT, "\t\t\t = ", imposableValue, " $\t\t\tX ", SCHOOL_TAX);

        System.out.printf("%n%nTotal School Tax For %d-%d = %.2f $%n%n", startYearOfInvoicePeriod, endYearOfInvoicePeriod, totalSchoolTax);

        System.out.printf("%s%.2f%s %d/%d/%d%n", "First  payment of ", installmentValue, " $ is due within 30 days of", startDayOfInvoicePeriod, startMonthOfInvoicePeriod, startYearOfInvoicePeriod);
        System.out.printf("%s%.2f%s %d/%d/%d%n", "Second payment of ", installmentValue, " $ is due within 90 days of", startDayOfInvoicePeriod, startMonthOfInvoicePeriod, startYearOfInvoicePeriod);

        System.out.printf("%s%n", "-".repeat(100));
        System.out.println("\nThank you for choosing Montréal Property School Tax Invoice Generator.");
        System.out.println("\nProperty School Tax Invoice generated successfully.");

    } // end of main()
} // end of class InvoiceGeneratorQuestionTwo