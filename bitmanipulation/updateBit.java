package bitmanipulation;

import java.util.*;

public class updateBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int update = sc.nextInt();
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        if (update == 1) { // update bit to 1;
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else if (update == 0) { // update bit to 0;
            int notBitMask = ~(bitMask);
            int newNumber = notBitMask & n;
            System.out.println(newNumber);
        }
    }
}
