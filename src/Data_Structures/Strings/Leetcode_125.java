package Data_Structures.Strings;

public class Leetcode_125 {
    public static boolean isPalindrome(String s) {
        boolean result = true;
        String word = combineString(s);
        int start = 0;
        int end = word.length()-1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                result = false;
                break;
            }
            start++;
            end--;
        }

        return result;
    }

    public static String combineString(String s) {
        String word = "";
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                word+=ch;
            }
        }
        return word.toLowerCase();
    }


    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}

