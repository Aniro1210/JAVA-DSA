package Recursion;

/*Given a floor of size (nxm) . Find the number of ways tiles of size (1xm) can be
 fit in the floor.
 */
import java.util.*;

public class count_tiles {
    public static int countTiles(int n, int m) {
        if (n < m) {
            return 1;
        }
        if (n == m) {
            return 2;

        }
        int horizontal = countTiles(n - 1, m);
        int vertical = countTiles(n - m, m);
        return horizontal + vertical;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the floor(n):");
        int n = sc.nextInt();
        System.out.println("enter the breadth of the floor(m):");
        int m = sc.nextInt();
        System.out.println(countTiles(n, m));
    }

}
