package Recursion;
/*we are given a maze of size(n,m). We have to find the no. of paths through which
we can move from (0,0) to (n,m).
The conditions being :
i.we can move only downwards.
ii.we can move only rightwards. */

import java.util.*;

public class count_paths {
    public static int countPaths(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downwards = countPaths(i + 1, j, n, m);
        int rightwards = countPaths(i, j + 1, n, m);
        return downwards + rightwards;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'n'(no.of rows):");
        int n = sc.nextInt();
        System.out.println("Enter the value of 'm'(no.of columns):");
        int m = sc.nextInt();
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }

}
