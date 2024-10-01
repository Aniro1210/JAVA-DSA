package arrays;

import java.util.*;

public class array_0f_names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        System.out.println("Enter the names:");
        String names[] = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + ", ");
        }

    }

}
