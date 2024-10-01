package Strings;

import java.util.*;

public class armstrong {
    public static boolean isFactorial(int n) {
        int originalNumber = n;
        int numDigits = Integer.toString(n).length();
        int sum = 0;
        while (n >= 1) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isFactorial(n)) {
            System.out.println(n + "is a armstrong number ");
        } else {
            System.out.println(n + "is not an armstrong number");
        }
    }
}