package Data_Structures.Strings;

public class Leetcode_1967 {

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String p : patterns) {
            if (word.contains(p))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns,word));

    }
}
