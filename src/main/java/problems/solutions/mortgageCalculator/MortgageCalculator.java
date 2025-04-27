package problems.solutions.mortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        int principal =0;
        double annualInterest = 0;
        double monthlyInterest = 0;
        int numberOfPayments = 0;
        byte years = 0;
        Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("Principal: ");
        principal = sc.nextInt();
        if (principal >= 1000 && principal <= 1_000_000)
            break;
        System.out.println("Enter a value between 1000 and 1000000");
    }

    while (true) {
        System.out.println("Annual Interest Rate: ");
        annualInterest = sc.nextDouble();
        if (annualInterest >= 1 && annualInterest <= 30) {
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Enter a value between 1 and 30");
    }

    while (true) {
        System.out.println("Period (Years): ");
        years = sc.nextByte();
        if (years >=1 && years <= 30) {
            numberOfPayments = years * MONTHS_IN_YEAR;
            break;
        }
        System.out.println("Enter a value between 1 and 30");
        }

        double mortgage = principal
                        * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                        / (Math.pow(1 + monthlyInterest, numberOfPayments) -1));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
