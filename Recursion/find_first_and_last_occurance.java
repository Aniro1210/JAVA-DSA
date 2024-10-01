package Recursion;

//finds the first and last occurance of an element in a string
public class find_first_and_last_occurance {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String s, char element, int index) {

        if (index == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currElement = s.charAt(index);
        if (currElement == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findOccurance(s, element, index + 1);

    }

    public static void main(String args[]) {
        String s = "aababcaeaaaah";
        findOccurance(s, 'a', 0);

    }

}
