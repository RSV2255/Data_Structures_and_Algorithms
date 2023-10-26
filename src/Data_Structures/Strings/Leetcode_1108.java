package Data_Structures.Strings;

public class Leetcode_1108 {
    public static String defangIPaddr(String address) {
        String ans = "";
        // for (int i = 0; i < address.length(); i++) {
        //     if (address.charAt(i) == '.') {
        //         ans = ans + "[.]";
        //     }
        //     else {
        //         ans = ans + address.charAt(i);
        //     }
        // }

        return address.replace(".","[.]");
        // return ans;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
