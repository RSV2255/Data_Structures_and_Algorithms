package Data_Structures.Strings;

public class Leetcode_1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = String.join("",word1);
        String w2 = String.join("",word2);
        return (w1.equals(w2));
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
}
