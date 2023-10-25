package Data_Structures.Array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1380 {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isMinInRowAndCol(matrix,i,j)) {
                    lucky.add(matrix[i][j]);
                }
            }
        }
        return lucky;
    }
    private static boolean isMinInRowAndCol(int[][] arr, int row, int col) {
        int minRow = arr[row][col];
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] < minRow)
                minRow = arr[row][i];
        }
        int minCol = arr[row][col];
        for (int j = 0; j < arr.length; j++) {
            if (minCol < arr[j][col]) {
                minCol = arr[j][col];
            }
        }
        return (minRow == minCol)?true:false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
}
