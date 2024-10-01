package functions_and_methods;

import java.util.*;

public class reverse_of_an_array {
    public static void reverseArray(int array[]) {
        int a = 0;
        int b = array.length - 1;
        int temp = 0;
        while (a < b) {
            temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            a++;
            b--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the siz eof the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        reverseArray(array);
        System.out.println("Reversed array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
