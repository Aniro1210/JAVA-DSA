package Recursion;

public class sumof_n_naturalnumbers {
    public static void printSum(int n, int i, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        printSum(n, i + 1, sum);

    }

    public static void main(String[] args) {
        printSum(5, 1, 0);
    }

}
