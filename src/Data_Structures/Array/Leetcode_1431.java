package Data_Structures.Array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = (max < candies[i])?candies[i]:max;
        }
        for (int i = 0 ;i < candies.length; i++) {
            boolean check = ((candies[i]+extraCandies) >= max)?true:false;
            ans.add(check);
        }
        System.out.println(ans);
    }
}
