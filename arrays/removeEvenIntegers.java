package arrays;

import java.util.*;

public class removeEvenIntegers {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static int[] removeEven(int arr[]) {
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddcount += 1;
            }
        }
        int idx = 0;
        int result[] = new int[oddcount];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        int[] oddArr = removeEven(arr);
        printArray(oddArr);
    }

}
