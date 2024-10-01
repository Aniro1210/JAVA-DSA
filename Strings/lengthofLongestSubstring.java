package Strings;

import java.util.Scanner;

public class lengthofLongestSubstring {
    public int lengthofLongestsubstring(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (s.charAt(j) != s.charAt(i)) {
                    count += 1;
                }

            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        lengthofLongestSubstring leng = new lengthofLongestSubstring();
        int len = leng.lengthofLongestsubstring(s);
        System.out.println(len);

    }

}
