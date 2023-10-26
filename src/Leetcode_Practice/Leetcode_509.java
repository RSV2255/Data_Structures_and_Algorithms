package Leetcode_Practice;

public class Leetcode_509 {
    public static int fib(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for (int i = 0; i < n; i++)
        {
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
        return n3;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fib(n));
    }
}
