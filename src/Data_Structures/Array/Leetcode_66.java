package Data_Structures.Array;

import java.util.Arrays;

public class Leetcode_66 {
    public static int[] plusOne(int[] digits) {
        int index = digits.length-1;
            boolean add = true;
            while(add) {
                digits[index] = digits[index] + 1;
                if (digits[index] > 9) {
                    digits[index] = digits[index] % 10;
                    if (index == 0) {
                        int[] temp = new int[digits.length+1];
                        temp[0] = 1;
                        for (int i = 0; i < digits.length; i++) {
                            temp[i+1] = digits[i];
                        }
                        digits = temp;
                        add = false;
                    }
                }
                else {
                    add = false;
                }
                index--;
            }
        return digits;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
}
