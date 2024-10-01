package important_coding_questions;

import java.util.Scanner;

public class reverse_a_number {
    public static int reverseNumber(int num) {
        int remainder = 0;
        int reverse = 0;
        while (num >= 1) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return reverse;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = reverseNumber(num);
        System.out.println("the reverse of" + num + " is =" + reverse);
    }

}
