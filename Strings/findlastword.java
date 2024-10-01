package Strings;

import java.util.*;

class findLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(" ");
        String lastword = s.substring(lastSpaceIndex + 1);
        int length = lastword.length();
        return (length);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = lengthOfLastWord(s);
        System.out.println(length);

    }
}
