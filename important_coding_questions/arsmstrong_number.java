package important_coding_questions;

import java.util.Scanner;

//in an Armstrong number the sum of the digits of the number to the power of the number og 
//digits is equal to the number
public class arsmstrong_number {
    public static boolean isArmstrong(int n) {
        int originalNumber = n;
        int sum = 0;
        int numDigits = Integer.toString(n).length();
        while (n >= 1) {
            int digits = n % 10;// find out the unit digits (ex=153%10=3and so on)
            sum += Math.pow(digits, numDigits);
            n /= 10;// reduces the number by one digit(ex-153/10=15)
        }
        return sum == originalNumber;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println(n + " is an armstrong number ");
        } else {
            System.out.println(n + " is not an armstrong number");
        }
    }

}
