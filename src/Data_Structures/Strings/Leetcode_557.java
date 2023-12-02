package Data_Structures.Strings;

public class Leetcode_557 {

    public static String reverseWords(String s) {
        String ans = "";
        String[] sArray = s.split(" ");
        for (int j = 0; j < sArray.length; j++) {
            String word = sArray[j];
            for (int i = word.length() - 1; i >= 0; i--) {
                ans += word.charAt(i);
            }
            if (j != sArray.length-1) {
                ans+=" ";
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
