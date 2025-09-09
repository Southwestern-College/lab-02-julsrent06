
/*@julsrent06
 * Julius Renteria and Karen Sandoval 
 */
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Keyboard Input */
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();
        int max;

        if (number1 >= number2) {
            max = number1;
        }
        else max = number2;
        
            if (number1 >= number3) {
            max = number1;
        }
        else max = number3;
        
        if (number2 >= number3) {
            max = number2;
        }
        else max = number3;    

        System.out.println("Maximum is: " + max);
    }
}