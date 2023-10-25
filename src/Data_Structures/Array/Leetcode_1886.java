package Data_Structures.Array;

import java.util.Arrays;

public class Leetcode_1886 {
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i <= 3; i++) {
            int[][] arr = Check(mat,target);
            if(Arrays.deepEquals(arr, target))
                return true;
            else
                mat = arr;
        }
        return false;
    }

    public static int[][] Check(int[][] mat, int[][] target) {
        int[][] left = new int[mat.length][mat.length];
        int row = 0;
        for (int i = mat.length-1; i >= 0; i--) {
            int col = 0;
            for (int j = 0;j < mat.length; j++) {
                left[row][col] = mat[j][i];
                col++;
            }
            row++;
        }
        return left;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0}, {0,1}};
        System.out.println(findRotation(mat,target));
    }
}
