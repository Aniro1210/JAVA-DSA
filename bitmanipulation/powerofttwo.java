package bitmanipulation;

import java.util.*;

public class powerofttwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPowerOfTwo(n)) {
            System.out.println(n + "is a power of two");
        } else {
            System.out.println(n + "is not a power of two");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
