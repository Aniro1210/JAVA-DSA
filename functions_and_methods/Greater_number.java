package functions_and_methods;

import java.util.Scanner;

public class Greater_number {
    public static int greaterNumber(int a, int b) {
        int greater = 0;
        if (a > b) {
            greater = a;

        } else {
            greater = b;
        }
        return (greater);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The greater number is " + greaterNumber(a, b));

    }

}
