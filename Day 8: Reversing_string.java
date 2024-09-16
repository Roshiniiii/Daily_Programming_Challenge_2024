import java.util.*;

class yay {
    static String reverseWords(String text) {
        String[] str = text.split(" ");
        Collections.reverse(Arrays.asList(str));
        return String.join(" ", str);
    }
  
    public static void main(String[] args) {
        String text = "It's a pleasure meeting you";
        System.out.println(reverseWords(text));
    }
