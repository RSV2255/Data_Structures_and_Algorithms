package Data_Structures.Array;

public class Leetcode_283 {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
                count++;
            }
        }
        for(int i : nums)
            System.out.print(i+" ");
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
