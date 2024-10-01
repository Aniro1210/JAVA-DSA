//input a string then replace "e" with "i"
package Strings;

import java.util.*;

public class question2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += s.charAt(i);
            }

        }
        System.out.println(result);
    }

}
