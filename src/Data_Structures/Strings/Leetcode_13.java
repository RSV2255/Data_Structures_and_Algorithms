package Data_Structures.Strings;

public class Leetcode_13 {
    public static int romanToInt(String s)
    {
        int ans = 0;

        for (int i = 0; i <=0; i++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch) == 0) {
                switch (ch) {
                    case 'I' -> ans = ans + 1;
                    case 'V' -> ans = ans + 5;
                    case 'X' -> ans = ans + 10;
                    case 'L' -> ans = ans + 50;
                    case 'C' -> ans = ans + 100;
                    case 'D' -> ans = ans + 500;
                    case 'M' -> ans = ans + 1000;
                }
            }
        }
        for (int i = 1; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    ans = ans + 1;
                    break;
                case 'V':
                    if (s.charAt(i - 1) == 'I')
                        ans = ans + 3;
                    else
                        ans = ans + 5;
                    break;
                case 'X':
                    if (s.charAt(i - 1) == 'I')
                        ans = ans + 8;
                    else
                        ans = ans + 10;
                    break;
                case 'L':
                    if (s.charAt(i - 1) == 'X')
                        ans = ans + 30;
                    else
                        ans = ans + 50;
                    break;
                case 'C':
                    if (s.charAt(i - 1) == 'X')
                        ans = ans + 80;
                    else
                        ans = ans + 100;
                    break;
                case 'D':
                    if (s.charAt(i - 1) == 'C')
                        ans = ans + 300;
                    else
                        ans = ans + 500;
                    break;
                case 'M':
                    if (s.charAt(i - 1) == 'C')
                        ans = ans + 800;
                    else
                        ans = ans + 1000;
                    break;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));

    }
}
