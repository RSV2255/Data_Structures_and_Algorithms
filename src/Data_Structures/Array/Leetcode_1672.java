package Data_Structures.Array;

public class Leetcode_1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};

        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
//            max = (max < sum)?sum:max;
            max = Math.max(max, sum);

        }
        System.out.println(max);
    }
}
