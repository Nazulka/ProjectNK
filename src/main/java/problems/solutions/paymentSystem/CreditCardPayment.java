package problems.solutions.paymentSystem;

public class CreditCardPayment implements Payable {
    @Override
    public void pay(double amount) {
        System.out.println("Paid £" + String.format("%.2f", amount) + " by card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded £" + String.format("%.2f", amount) + " by card");
    }
}
