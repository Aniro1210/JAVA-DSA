import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(+num + " is a even number");

        } else {
            System.out.println(+num + " is an odd number");
        }
    }

}
