package Leetcode_Practice;

public class Leetcode_1137 {
    public static int tribonacci(int n)
    { int sum = 0;
        int n1 = 1;
        int n2 = 0;
        int n3 = 0;
        sum = n1 + n2 + n3;
        for (int i = 1; i < n; i++)
        {
            n1 = n2;
            n2 = n3;
            n3 = sum;
            sum = n1 + n2 + n3;
        }
        if (n == 0)
            return 0;
        else
            return sum;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(tribonacci(n));
    }
}
