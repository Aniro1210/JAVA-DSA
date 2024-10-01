import java.util.*;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("""
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Modulo/remainder""");
        int op = sc.nextInt();
        int ans = 0; // Declare ans here

        switch (op) {
            case 1:
                ans = num1 + num2;
                System.out.println("The sum of the two numbers is " + ans);
                break;
            case 2:
                ans = num1 - num2;
                System.out.println("The difference of the two numbers is " + ans);
                break;
            case 3:
                ans = num1 * num2;
                System.out.println("The product of the two numbers is " + ans);
                break;
            case 4:
                // Check for division by zero
                if (num2 != 0) {
                    ans = num1 / num2;
                    System.out.println("The quotient of the two numbers is " + ans);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case 5:
                ans = num1 % num2;
                System.out.println("The remainder of the two numbers is " + ans);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        sc.close(); // Close the scanner
    }
}
