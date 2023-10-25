package Data_Structures.Array;

import java.util.LinkedList;
import java.util.List;

public class Leetcode_989 {
    public static List<Integer> addToArrayForm(int[] num, int K) {
        List<Integer> res = new LinkedList<>();
        for (int i = num.length - 1; i >= 0; i--) {
            res.add(0, (num[i] + K) % 10);
            K = (num[i] + K) / 10;
        }
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k = 34;

        System.out.println(addToArrayForm(arr,k));
    }
}
