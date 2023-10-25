package Data_Structures.Array;

import java.util.ArrayList;


public class Leetcode_1773 {
    public static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {

        int n = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> 0;
        };
        int count = 0;
        for (ArrayList<String> list : items) {
            String check = list.get(n);
            if (check.equals(ruleValue))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[][] arr = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";

        ArrayList<ArrayList<String>> items = new ArrayList<>();

        for (String[] row : arr) {
            ArrayList<String> col = new ArrayList<>();
            for (String i : row) {
                col.add(i);
            }
            items.add(col);
        }
        int count = countMatches(items,ruleKey,ruleValue);
        System.out.println(count);
    }
}
