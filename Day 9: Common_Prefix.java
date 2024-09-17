import java.util.Arrays;

class yay {
    static String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0)
            return "-1";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int minLength= Math.min(first.length(), last.length());
        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        if (i == 0)
            return "-1";
        return first.substring(0, i);
    }

    public static void main(String[] args){
        String[] strs = { "Helium","Hello","Heart","Helio" };
        System.out.println("The longest common prefix is: "+ longestCommonPrefix(strs));
    }
}
