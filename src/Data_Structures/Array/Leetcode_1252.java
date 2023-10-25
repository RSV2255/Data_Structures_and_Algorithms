package Data_Structures.Array;

public class Leetcode_1252 {
    public static int oddCells(int m, int n, int[][] indices) {
        int oddCells = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int x = 0; x < indices.length; x++) {
                    if (i == indices[x][0])
                        count++;
                    if (j == indices[x][1])
                        count++;
                }
                if (count%2 == 1)
                    oddCells++;
            }

        }
        return oddCells;
    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1}, {1, 1}};
        System.out.println(oddCells(m,n,indices));
    }
}
