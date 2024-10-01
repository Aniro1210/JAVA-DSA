package functions_and_methods;

import java.util.*;

public class average {
    public static int calculateAverage(int a, int b, int c) {
        int sum = a + b + c;
        int average = sum / 3;
        return (average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        System.out.println("Emter the third number:");
        int c = sc.nextInt();
        int average = calculateAverage(a, b, c);
        System.out.println("the average of the three numbers is :" + average);
    }

}
