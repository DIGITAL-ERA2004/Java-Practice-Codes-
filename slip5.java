import java.util.Scanner;

public class slip5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print multiplication table up to 12
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        // Check if the number is even or odd
        if (number % 2 == 0) 
        {
            System.out.println("The number is even." + number);
        } else 
        {
            System.out.println("The number " + number + " is odd.");
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
