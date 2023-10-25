package Data_Structures.Array;

import java.util.Arrays;

public class Leetcode_1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;

        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ans[index++] = nums[i];
            ans[index++] = nums[i+n];
        }
        System.out.println(Arrays.toString(ans));
    }
}
