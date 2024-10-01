import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(1/2/3) for the language of greeting:");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("Hello");

        } else if (a == 2) {
            System.out.println("Namaste");

        } else if (a == 3) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Bhag madarchod");
        }

    }

}
