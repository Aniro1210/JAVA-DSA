package important_coding_questions;

import java.util.*;

public class fibbonacci_series {
    public static void main(String args[]) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print("The first 10 terms of the fibonacci series are :");

        for (int i = 0; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(a + " ");
        }
    }

}
