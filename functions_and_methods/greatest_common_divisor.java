
package functions_and_methods;

import java.util.Scanner;

public class greatest_common_divisor {
    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int hcf = greatestCommonDivisor(a, b);
        System.out.println("The greatest common divisor of " + a + " & " + b + " is " + hcf);
    }
}
