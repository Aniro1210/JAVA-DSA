import java.util.*;

public class loopexercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {

            System.out.println("Enter your marks:");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is good");
            } else if (marks <= 89 && marks > 60) {
                System.out.println("This is also good");

            } else if (marks <= 59 && marks >= 0) {
                System.out.println("This is also good");
            } else {
                System.out.println("Chal nikal madarchod");
            }
            System.out.println("Do you want to continue. Type 1");
            i = sc.nextInt();
        } while (i == 1);

    }

}
