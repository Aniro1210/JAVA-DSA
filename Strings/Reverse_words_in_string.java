package Strings;

import java.util.*;

class Reverse_words_in_string {
    public String reverseString(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        String reverse = reversed.toString();
        return reverse;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        Reverse_words_in_string rs = new Reverse_words_in_string();
        String reverse = rs.reverseString(s);
        System.out.println(reverse);

    }
}