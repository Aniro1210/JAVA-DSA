package important_coding_questions;

import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class timeDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first time
        System.out.print("Enter the first time (HH:mm:ss): ");
        String time1Str = scanner.nextLine();
        LocalTime time1 = LocalTime.parse(time1Str);

        // Input the second time
        System.out.print("Enter the second time (HH:mm:ss): ");
        String time2Str = scanner.nextLine();
        LocalTime time2 = LocalTime.parse(time2Str);

        // Calculate the difference between the two times
        Duration duration = Duration.between(time1, time2);

        // Get the absolute value of the duration
        duration = duration.abs();

        // Extract hours, minutes, and seconds from the duration

        long seconds = duration.getSeconds();

        // Display the result
        System.out.printf("The difference between %s and %s is %d seconds.%n",
                time1, time2, seconds);

        scanner.close();
    }
}
