import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner class to read the input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numberOne = scanner.nextInt();

        System.out.println("Enter number two: ");
        int numberTwo = scanner.nextInt();

        System.out.println("Numbers ares: " + numberOne + " " + numberTwo);

        scanner.close();
    }
}