package Data_Structures.Strings;

public class Leetcode_168 {

    public static String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber != 0) {
            columnNumber--;
            int number = columnNumber % 26;
            char ch = (char) (number + 'A');
            ans = ch+ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
    }
    public static void main(String[] args) {
        int columnNumber = 701;

        System.out.println(convertToTitle(columnNumber));

    }
}
