package arrays;

import java.util.Scanner;

public class second_largest_number_in_array {
    public static int secondLargestNum(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int secondMax = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > secondMax || arr[j] < max) {
                secondMax = arr[j];
            }
        }
        return secondMax;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int secondMax = secondLargestNum(arr);
        System.out.println("The secpnd largest number in the array is :" + secondMax);
    }

}
