package Data_Structures.Array;

public class Leetcode_1295 {
    public static int findNumbers(int[] nums) {
        int countElements = 0;
        for (int i = 0; i < nums.length; i++) {
            int countDigits = 0;
            int temp = nums[i];
            while (temp != 0) {
                countDigits++;
                temp/=10;
            }
            if (countDigits%2==0)
                countElements++;
        }
        return countElements;
    }

    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
}
