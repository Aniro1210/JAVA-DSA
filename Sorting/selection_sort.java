package Sorting;

public class selection_sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 9, 6, 8, 5, 1, 4, 2, 7 };
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            } // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

}