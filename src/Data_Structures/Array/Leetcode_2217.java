package Data_Structures.Array;

import java.util.Arrays;

public class Leetcode_2217 {
    public static long[] kthPalindrome(int[] queries, int intLength) {
        long[] ans = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = nthPalindrome(queries[i], intLength);
        }
        return ans;
    }
    public static long nthPalindrome(int nth, int digits) {
        long temp = (digits % 2 == 0) ? (digits/2)-1 : digits/2;
        long left = (long) Math.pow(10,temp);
        left = left + nth-1;
        long res = left;
        if (digits % 2 != 0) {
            left /= 10;
        }
        while (left > 0) {
            res = res * 10 + (left % 10);
            left /= 10;
        }
        String check = res+"";
        if (check.length() == digits) {
            return res;
        }
        else
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,90};
        int intLength = 3;
        System.out.println(Arrays.toString(kthPalindrome(arr,intLength)));
//        nthPalindrome(90,3);

    }
}
