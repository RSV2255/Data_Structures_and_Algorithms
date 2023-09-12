package Data_Structures.Array;

import java.util.Arrays;

public class Deletion_In_Array {

    public static int[] deleteById(int[] arr, int id) {
        int[] ans = new int[arr.length-1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {

            if (i == id) {
                continue;
            }
            else
                ans[index++] = arr[i];

        }

        return ans;
    }

    public static int[] deleteByValue(int[] arr, int value) {
        int[] ans = new int[arr.length-1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == value) {
                continue;
            }
            else
                ans[index++] = arr[i];

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

//        System.out.println(Arrays.toString(deleteById(arr,2)));

        System.out.println(Arrays.toString(deleteByValue(arr,5)));

    }
}
