//to check whether two numbers are palendrome or not
package String_builder;

import java.util.*;

public class palendrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter the line:");
        String str = sc.nextLine();
        sb.append(str);

        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - i - 1;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(str);
        String reversed = sb.toString();
        System.out.println(reversed);
        if (str.compareTo(reversed) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
