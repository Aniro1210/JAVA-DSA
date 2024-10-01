package twoDarrays;

import java.util.*;

public class finding_x_in_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns");
        int b = sc.nextInt();
        int[][] numbers = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the number to be found:");
        int x = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                
                if (x == numbers[i][j]) {
                    System.out.println(x + "is found at (" + i + "," + j + ")");
                }
                System.out.println();
            }
        }

    }

}
