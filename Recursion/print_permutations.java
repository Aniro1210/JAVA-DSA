package Recursion;

//print the permutaions for a string.
//ex: "abc"-permutations are {"abc","acb","bac","bca","cab","cba"}
import java.util.*;

public class print_permutations {
    public static void printPermutations(String str, String permutation) {

        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, permutation + currChar);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        printPermutations(str, "");
    }

}
