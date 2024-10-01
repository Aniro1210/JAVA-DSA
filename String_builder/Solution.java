package String_builder;

import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        reverse = reverse.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return s.equals(reverse); // Directly return the comparison result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Create an instance of Palindrome1 and check if the string is a palindrome
        Solution Solution = new Solution();
        boolean b = Solution.isPalindrome(s);

        // Output the result
        System.out.println(b);
    }
}
