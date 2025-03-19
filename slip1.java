/*import java.util.*;


public class slip1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Taking input from the user
            System.out.print("Enter the first number (dividend): ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number (divisor): ");
            int num2 = scanner.nextInt();
            
            // Performing division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers only.");
        } finally {
            scanner.close(); // Closing the scanner to avoid resource leak
        }
    }
}
*/
import java.util.*;

public class slip1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first the number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second kk number: ");
            int num2 = scanner.nextInt();
            
            int result = num1 / num2;
            int sum=num1+num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input.");
        } 
    }
}