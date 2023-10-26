package Data_Structures.Array;

public class Leetcode_27 {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr,val));
    }
}
