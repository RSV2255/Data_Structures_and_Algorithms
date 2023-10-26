package Leetcode_Practice;

public class Leetcode_2769
{
    public static int theMaximumAchievableX(int num, int t) {
        return num+(2*t);
    }

    public static void main(String[] args) {
        int num = 4; int t = 1;
        System.out.println(theMaximumAchievableX(num,t));
    }
}
