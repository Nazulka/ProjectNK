package problems.solutions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog hugo = new Dog("Hugo", "Pug");
        hugo.bark();
        hugo.breed();

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calc.add(a, b);
        int product = calc.multiply(a, b);
        System.out.println(result);
        System.out.println(product);
    }
}
