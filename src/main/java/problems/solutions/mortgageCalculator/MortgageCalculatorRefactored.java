package problems.solutions.mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorRefactored {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        int principal = (int) readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) readNumber ("Annual Interest: ", 1, 4);
        byte years = (byte) readNumber("Years: ", 1, 30);

        printPaymentSchedule(principal, annualInterest, years);
        printMortgage(principal, annualInterest, years);
    }

    private static void printPaymentSchedule(int principal, float annualInterest, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterest, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    private static void printMortgage(int principal, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principal, annualInterest, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("---------");
        System.out.println("Monthly payment: " + mortgageFormatted);
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

        float numberOfPayments = years * MONTHS_IN_YEAR;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double mortgage =  principal
                * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1));

        return mortgage;
    }

    public static double calculateBalance (
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade ) {

        float numberOfPayments = years * MONTHS_IN_YEAR;
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments)
                - Math.pow(1+monthlyInterest, numberOfPaymentsMade))
                /(Math.pow(1+monthlyInterest, numberOfPayments)-1);
        return balance;
    }
}
