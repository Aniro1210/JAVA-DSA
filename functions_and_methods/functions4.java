package functions_and_methods;

import java.util.Scanner;

public class functions4 {
    public static void calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }

}
