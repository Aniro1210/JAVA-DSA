package arrays;

import java.util.Scanner;

public class ascending_order_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        boolean isAscending = true;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.print("The array is in ascending order");
        } else {
            System.out.println("The array is in descending order");
        }
    }

}
