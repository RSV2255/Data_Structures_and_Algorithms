package Data_Structures.Array;

import java.util.Arrays;

public class Leetcode_867 {
    public static int[][] transpose(int[][] matrix) {
        int[][] ans = new int[matrix[0].length][matrix.length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] ans = transpose(mat);
        for (int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }
    }
}
