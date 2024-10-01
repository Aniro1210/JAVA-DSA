package Recursion;

import java.util.Scanner;

public class x_tothepower__n {
    public static int calcPow(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = calcPow(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x-");
        int x = sc.nextInt();
        System.out.println("enter power-");
        int n = sc.nextInt();
        int ans = calcPow(x, n);
        System.out.println(x + "^" + n + "=" + ans);
    }

}
