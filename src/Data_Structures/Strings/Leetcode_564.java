package Data_Structures.Strings;

public class Leetcode_564 {
    public static long nearestPalindromic(String n) {
        long val = Long.parseLong(n);
        long next = val+1;
        long prev = val - 1;
        int start = 0;
        int end = String.valueOf(next).length()-1;
        long y = 1;
        while (start < end) {
            String temp = String.valueOf(next);
            next = Long.parseLong(temp);

            while (temp.charAt(start) != temp.charAt(end)) {
                next = next + y;
                temp = String.valueOf(next);
                if (start + end != temp.length()-1) {
                    end = temp.length()-1;
                }
            }
            start++;
            end--;
            y = y * 10;
        }
        start = 0;
        end = String.valueOf(prev).length()-1;
        y = 1;
        while (start < end) {
            String temp = String.valueOf(prev);
            prev = Long.parseLong(temp);

            while ((temp.charAt(start) != temp.charAt(end))) {
                prev = prev - y;
                temp = String.valueOf(prev);
                if (start + end != temp.length()-1) {
                    end = temp.length()-1;
                }
            }
            if (temp.length() == 1) {break;}
            start++;
            end--;
            y = y * 10;
        }
        System.out.println(prev +" "+next);
        return closest(prev,n,next);
    }

    private static long closest(long prev, String n, long next) {
        long val = Long.parseLong(n);
        return ((val - prev) <= (next - val))?prev:next;
    }

    public static void main(String[] args) {
//        String n = "889237476724887162";
        System.out.println(nearestPalindromic("11"));
    }

}
