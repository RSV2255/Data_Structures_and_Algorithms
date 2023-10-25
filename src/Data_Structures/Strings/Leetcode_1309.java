package Data_Structures.Strings;

public class Leetcode_1309 {
    public static void main(String[] args) {
        String s = "1326#";
        String op = "";
        int len = s.length()-1;
        while (len >= 0) {
            int n = 0;
            if (s.charAt(len) != '#') {
                n = Integer.parseInt(s.charAt(len)+"");
                len--;
            }
            else {
                n = Integer.parseInt(s.substring(len-2,len));
                len-=3;
            }
            n = n+96;
//            System.out.println(n);
            char ch = (char)n;
            op = ch+op;
        }
        System.out.println(op);
    }
}
