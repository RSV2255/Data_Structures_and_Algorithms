package Data_Structures.Strings;

public class Leetcode_1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean ans = checkIfPangram(sentence);

        System.out.println(ans);
    }

    private static boolean checkIfPangram(String sentence) {
        for (char a = 'a'; a <= 'z'; a++) {
            boolean check = false;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == a) {
                    check = true;
                    break;
                }
            }
            if (check == false) {
                return false;
            }
        }
        return true;
    }
}
