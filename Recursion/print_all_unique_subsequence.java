package Recursion;

import java.util.HashSet;

import Strings.lengthofLongestSubstring;

public class print_all_unique_subsequence {
    public static void printUniqueSubsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        // to be
        printUniqueSubsequence(str, idx + 1, newString + currChar, set);
        // not to be
        printUniqueSubsequence(str, idx + 1, newString, set);
    }

    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubsequence(str, 0, "", set);
    }

}
