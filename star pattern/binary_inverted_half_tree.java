public class binary_inverted_half_tree {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(number);
                } else {
                    System.out.print(number - 1);
                }

            }
            System.out.println();
        }
    }
}
