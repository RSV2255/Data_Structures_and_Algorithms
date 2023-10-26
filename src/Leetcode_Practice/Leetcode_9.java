package Leetcode_Practice;

public class Leetcode_9 {
    public static boolean isPalindrome(int x)
    {
        int temp = x;

        int rev = 0;

        temp = x;
        while(temp!=0)
        {
            int ld = temp%10;
            rev = rev * 10 + ld;
            temp = temp/10;
        }
        if(rev < 0)
            return false;
        else if(rev == x)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
