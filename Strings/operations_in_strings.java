package Strings;

import java.util.*;

public class operations_in_strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // charAt
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        // substring
        String name = str2.substring(0, str2.length() / 2);
        System.out.println(name);
        // compareTo
        if (str1.compareTo(str2) != 0) {
            System.out.println("They are not equal");
        } else {
            System.out.println("They are equal");
        }
        // parseInt--- String to integer
        String str3 = "123";
        int number = Integer.parseInt(str3);
        System.out.println(number);
        // toString----INTEGER TO STRING
        int num = 1234;
        String str4 = Integer.toString(num);
        System.out.println(str4.length());

    }

}
