package Strings;

public class subs {
    public static void main(String args[]) {
        String str1 = "anirban";
        String str2 = "nirb";
        int index = str1.indexOf(str2);
        if (index != -1) {
            String str3 = str1.substring(index + str2.length());
            System.out.println(str3);
        } else {
            System.out.println("string not found");
        }

    }
}
