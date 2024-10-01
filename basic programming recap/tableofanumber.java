import java.util.*;

public class tableofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        for (int i = 1; i <= 10; i++) {
            m = n * i;
            System.out.println(+n + "*" + i + "=" + m);
        }
    }

}
