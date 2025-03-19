import java.util.*;

// Custom Exception
class WithdrawalLimitException extends Exception {} // This is NOT the main class

public class love{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 1000;

        System.out.println("Enter the withdrawal amount:");
        int amount = sc.nextInt();

        try {
            if (amount > limit) {
                throw new WithdrawalLimitException();
            } else {
                System.out.println("Amount Withdrawal Successful");
            }
        } catch (WithdrawalLimitException e) {
            System.out.println("Amount withdrawal limit exceeded!");
        }

        sc.close(); // Closing scanner to prevent resource leak
    }
}
