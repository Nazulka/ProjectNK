package problems.solutions.paymentSystem;

public class CashPayment implements Payable {
    @Override
    public void pay(double amount) {
// Format the amount to 2 decimal places and print it
        System.out.println("Paid £" + String.format("%.2f", amount) + " in cash");    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded £" + String.format("%.2f", amount) + " in cash");
    }
}
