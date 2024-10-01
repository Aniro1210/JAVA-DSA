package Strings;

import javax.sound.sampled.SourceDataLine;

public class substring {
    public static String findLastWord(String sentence) {
        sentence = sentence.trim();
        int lastSpaceIndex = sentence.lastIndexOf(" ");
        if (lastSpaceIndex == -1) {
            return sentence;
        }
        return sentence.substring(lastSpaceIndex + 1);
    }

    public static void main(String[] args) {
        String sentence = "This is a sentence";
        String lastword = findLastWord(sentence);
        System.out.println(lastword);
        System.out.println(lastword.length());

    }
}
