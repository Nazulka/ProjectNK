package problems.solutions.paymentSystem;

public interface Payable {
    void pay(double amount);
    void refund(double amount);
}
