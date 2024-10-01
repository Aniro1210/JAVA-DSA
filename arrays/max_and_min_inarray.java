package arrays;

import java.util.*;

public class max_and_min_inarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();

        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {

            if (array[i] < min) {

                min = array[i];

            }
            if (array[i] > max) {
                max = array[i];

            }

        }
        System.out.println("largest number is:" + max);
        System.out.println("smallest number is :" + min);
    }

}
