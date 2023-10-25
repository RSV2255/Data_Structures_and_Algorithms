package Data_Structures.Array;

import java.util.Arrays;

public class Leetcode_1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] ans = new int[0];
        for (int i = 0 ;i < nums.length; i++) {
            ans = addElement(ans,nums[i],index[i]);
        }

        System.out.println(Arrays.toString(ans));
    }
    private static int[] addElement(int[] arr, int nums, int index) {
        int[] ans = new int[arr.length+1];
        int idx = 0;
        for (int i = 0; i < ans.length; i++) {
            if (i == index)
                ans[i] = nums;
            else
                ans[i] = arr[idx++];

        }
        return ans;
    }
}
