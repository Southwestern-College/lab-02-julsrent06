
/* This program takes three different numbers and prints out the maximum number from the set.
 * @julsrent06
 * Julius Renteria
 */
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // First keyboard input //
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        // Second keyboard input //
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        // Third keyboard input //
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();
        //Creates the max variable //
        int max;

        // First if statement to check the first two numbers //
        if (number1 >= number2) {
            max = number1;
        } else {
            max = number2; // Initial max //
        }
        // Second if statement to check the initial max and the third number //
            if (max >= number3) {
            System.out.println("Maximum is: " + max); // Keeps the initial max and prints it //
        } else {
            max = number3; // Changes the initial max //
            System.out.println("Maximum is: " + max); // Prints the new max //
        }

    }
}