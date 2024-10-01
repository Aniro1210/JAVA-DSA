package Recursion;

import java.util.Scanner;

public class reverse_of_string {
    public static void printRev(String s, int idx) {
        if (idx == 0) {
            System.out.print(s.charAt(idx));
            return;
        }
        System.out.print(s.charAt(idx));
        printRev(s, idx - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = s.length() - 1;
        printRev(s, idx);
    }

}
