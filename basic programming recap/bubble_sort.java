import java.util.Scanner;

public class bubble_sort {
    public static int swap_count(int arr[]) {

        // ascending order
        int swapcount1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapcount1++;
                }
            }
        }
        System.out.println("swapcount1-" + swapcount1);
        // descending order
        int swapcount2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapcount2++;
                }
            }

        }
        System.out.println("swapcount2-" + swapcount2);
        if (swapcount1 < swapcount2) {
            return swapcount1;

        } else {
            return swapcount2;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int swapcount = swap_count(arr);
        System.out.println("swapcount-" + swapcount);

    }

}
