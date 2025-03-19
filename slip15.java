import java.util.Scanner;

class WithdrawalLimitExceededException extends Exception {
    public WithdrawalLimitExceededException(String message) {
        super(message);
    }
}

public class Slip15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000;

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        try {
            if (amount > 1000) {
                throw new WithdrawalLimitExceededException("Withdrawal limit exceeded! Maximum allowed is $1000.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: $" + balance);
            }
        } catch (WithdrawalLimitExceededException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
