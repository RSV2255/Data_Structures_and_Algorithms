package Data_Structures.Strings;

public class Leetcode_657 {

    public static boolean judgeCircle(String moves) {
        char[] move = moves.toCharArray();
        int x = 0;
        int y = 0;
        for (char ch : move) {
            switch(ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;

            }
        }
        return x == 0 && y == 0;
    }
    public static void main(String[] args) {
        String moves = "DLUR";

        System.out.println(judgeCircle(moves));
    }
}
