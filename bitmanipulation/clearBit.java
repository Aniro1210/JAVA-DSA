package bitmanipulation;

public class clearBit {
    public static void main(String args[]) {
        int n = 5;
        int pos = 0;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);

    }
}