package Data_Structures.Array;

public class Leetcode_14 {
    public static String longestCommonPrefix(String[] strs) {
        boolean match = false;
        int min = strs[0].length();
        String ans = "";
        String minStr = strs[0];
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
                minStr = strs[i];
            }
        }
        for (int i = 0; i < minStr.length(); i++) {
            for (String s : strs) {
                if (minStr.charAt(i) == s.charAt(i)) {
                    match = true;
                }
                else {
                    match = false;
                    break;
                }
            }
            if(match) {
                ans += minStr.charAt(i);
            }
            else {
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }
}
