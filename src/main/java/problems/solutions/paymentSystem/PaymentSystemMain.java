package problems.solutions.paymentSystem;
import java.util.Random;

public class PaymentSystemMain {

    // Method to process payments
    public static void paymentProcessor(Payable[] payables) {
        Random rand = new Random();

        for (Payable payable : payables) {
            // Generate a random amount between 1 and 100
            double randomAmount = rand.nextDouble() * 100 + 1;

            // Pass the raw double to the pay method (formatting happens inside the pay method)
            payable.pay(randomAmount);
            payable.refund(randomAmount);
        }
    }

    public static void main(String[] args) {
        // Create an array of Payable objects
        Payable[] payables = {
                new CreditCardPayment(),  // First payment type
                new CreditCardPayment(),  // Second payment type
                new CashPayment()         // Third payment type
        };

        // Process the payments for all Payable objects
        paymentProcessor(payables);
    }
}
