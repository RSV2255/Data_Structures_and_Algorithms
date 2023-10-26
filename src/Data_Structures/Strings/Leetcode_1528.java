package Data_Structures.Strings;

public class Leetcode_1528 {
    public String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }
        String word = String.valueOf(ans);
        return word;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(new Leetcode_1528().restoreString(s,arr));
    }
}
