package functions_and_methods;

import java.util.*;

public class sum_of_all_odd_numbers {
    public static int calculateSum0fOddnumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;

            } else {
                sum = sum + 0;
            }
        }
        return (sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        int sum = calculateSum0fOddnumbers(n);
        System.out.println(sum);
    }

}
