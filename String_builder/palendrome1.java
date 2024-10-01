package String_builder;

import java.util.*;

import java.util.Scanner;

public class palendrome1 {
    public boolean isPalindrome(String s) {
        // Create a StringBuilder with the original string
        StringBuilder sb = new StringBuilder(s);

        // Reverse the string
        String reverse = sb.reverse().toString();
        reverse = reverse.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(reverse);

        // Return true if the original string equals the reversed string, otherwise
        // false
        return s.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(s);

        // Create an instance of PalindromeCheck and call isPalindrome
        palendrome1 palindromeCheck = new palendrome1();
        boolean result = palindromeCheck.isPalindrome(s);

        // Print the result
        System.out.println("Is palindrome: " + result);
    }
}
