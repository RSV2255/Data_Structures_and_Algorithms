package Data_Structures.Strings;

public class Leetcode_1859 {
    public static String sortSentence(String s) {
        String[] sen = s.split(" ");
        String[] senArray = new String[sen.length];
        for (String i : sen) {
            char ch = i.charAt(i.length()-1);
            int index = Integer.parseInt(ch+"");
            senArray[index-1] = i.substring(0 , i.length()-1);
        }
        return String.join(" ",senArray);
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
