import java.util.*;

public class slip6. {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();

        System.out.print("Enter height: ");
        double h = scanner.nextDouble();

        System.out.println("Volume: " + (Math.PI * r * r * h));

        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scanner.close();
    }
}
