package problems.solutions;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int a = sc.nextInt();
        if ((a % 3 == 0) && (a % 5 == 0))
            System.out.println("FizzBuzz");
        else if ( a % 5 == 0)
            System.out.println("Fizz");
        else if (a % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(a);

    }
}
