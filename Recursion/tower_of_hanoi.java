package Recursion;

public class tower_of_hanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println(" disc " + n + " is moved from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("disk " + n + " is moved from " + src + " To " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String args[]) {
        towerOfHanoi(3, "S", "H", "D");

    }

}
