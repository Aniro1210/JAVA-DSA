package Strings;

import java.util.*;

import java.util.Scanner;

public class remove_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String plainString = s.replaceAll("[^a-zA-Z]", "");
        StringBuilder sb = new StringBuilder(plainString);

        for (int i = 0; i < plainString.length() / 2; i++) {
            int front = i;
            int back = plainString.length() - i - 1;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println();
        String reversed = sb.toString();
        System.out.println(reversed);
    }
}
