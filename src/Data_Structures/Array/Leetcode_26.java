package Data_Structures.Array;

public class Leetcode_26 {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++)
        {
            boolean check = true;
            for (int j = i - 1; j >= 0; j--)
            {
                if (nums[i] == nums[j])
                {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;

                if (index != i)
                {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    index++;
                }
                else
                    index++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
