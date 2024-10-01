package Recursion;

public class inviting_N_persons {
    public static int countWays(int n) {
        if (n <= 1) {
            return 1;
        }
        // single
        int ways1 = countWays(n - 1);
        // in pair
        int ways2 = (n - 1) * countWays(n - 2);
        return ways1 + ways2;
    }

    public static void main(String args[]) {
        int n = 4;
        System.out.println(countWays(n));
    }

}
