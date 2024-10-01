package Recursion;

import java.util.*;
//print all the subsequence of the string.

public class print_all_subsequence {
    public static void printSubsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        printSubsequence(str, idx + 1, newString + currChar);
        // or not to be
        printSubsequence(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubsequence(str, 0, "");

    }

}
