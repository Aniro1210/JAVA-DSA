package Strings;

import java.util.*;

public class replacingCharacters {
    public static void printstr(String str) {
        System.out.println("Thank you for entering your name.");
        System.out.println("Your name is:" + str);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String str = sc.nextLine();
        str = str.toLowerCase();
        if (str == "Harsh" || str == "harsh raj" || str == "harsh" || str == "Harsh Raj") {
            String str1 = str.replaceAll(str, "Bhosdi wala");
            System.out.println(str1);
        }

        printstr(str);
    }
}
