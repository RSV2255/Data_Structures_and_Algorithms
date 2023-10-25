package Data_Structures.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};

        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));
    }
}
