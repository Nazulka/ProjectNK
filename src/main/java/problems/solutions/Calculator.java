package problems.solutions;

import java.util.Scanner;

public class Calculator {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator calc = new Calculator();
        int result = calc.add(a, b);
        System.out.println(result);
    }

    public int add(int a, int b) {
        return a + b;
    }
}
