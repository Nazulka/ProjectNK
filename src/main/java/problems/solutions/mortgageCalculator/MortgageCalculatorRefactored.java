package problems.solutions.mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorRefactored {
    public static void main(String[] args) {

        int principal = (int) readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) readNumber ("Annual Interest: ", 1, 4);
        byte years = (byte) readNumber("Years: ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double value;
        while (true) {
            System.out.println(prompt);
            value = sc.nextFloat();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
}

    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years) {

        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        short numberOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal
                * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1));
        return mortgage;
    }
}
