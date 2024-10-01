package Recursion;

//we have to move all the 'x' characters to the end of the array.
import java.util.*;

public class move_all_x_tothelast {
    public static void moveAllX(String s, int idx, int count, String newString, char element) {
        if (idx == s.length()) {
            for (int i = 0; i < count; i++) {
                newString += element;
            }
            System.out.println(newString);
            return;
        }
        char currChar = s.charAt(idx);
        if (currChar == element) {
            count++;
            moveAllX(s, idx + 1, count, newString, element);
        } else {
            newString += currChar;
            moveAllX(s, idx + 1, count, newString, element);
        }

    }

    public static void main(String srgs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String s = sc.nextLine();
        char element = 'x';
        moveAllX(s, 0, 0, "", element);

    }

}
