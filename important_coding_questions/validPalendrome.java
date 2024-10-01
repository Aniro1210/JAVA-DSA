package important_coding_questions;

import java.util.*;

public class validPalendrome {
    public static boolean isPalendrome(String str) {
        int i = 0;
        int x = str.length() - 1;
        char first = str.charAt(i);
        char last = str.charAt(x);
        while (i < x) {
            if (first == last) {
                i++;
                x--;
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalendrome(str)) {
            System.out.println(str + "is a Palendrome");
        } else {
            System.out.println(str + " is not a Palendrome");
        }

    }

}
