package Recursion;

import java.util.*;

//print all the keyboard combination

public class print_keypad_combinations {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void keypadCombination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            keypadCombination(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        String str = sc.nextLine();
        keypadCombination(str, 0, "");
    }
}
