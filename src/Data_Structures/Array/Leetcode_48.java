package Data_Structures.Array;

import java.util.Arrays;

public class Leetcode_48 {
    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length-1;
        while (l < r) {
            for (int i = 0; i < (r-l); i++) {
                int t = l;
                int b = r;
                int t_l = matrix[t][l+i];
                matrix[t][l+i] = matrix[b-i][l];
                matrix[b-i][l] = matrix[b][r-i];
                matrix[b][r-i] = matrix[t+i][r];
                matrix[t+i][r] = t_l;
            }

            l++;
            r--;
        }
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        new Leetcode_48().rotate(matrix);
    }
}
