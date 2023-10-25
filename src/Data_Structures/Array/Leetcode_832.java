package Data_Structures.Array;

import java.util.Arrays;

public class Leetcode_832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        int ans[][] = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = image[i].length-1; j >= 0; j--) {
                switch(image[i][j]) {
                    case 0:
                        ans[i][image.length-1-j] = 1;
                        break;
                    case 1:
                        ans[i][image.length-1-j] = 0;
                        break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        for (int[] i : ans) {
            System.out.println(Arrays.toString(i));
        }
    }
}
