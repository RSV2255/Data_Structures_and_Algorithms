package Data_Structures.Strings;

public class Leetcode_925 {

    public static boolean isLongPressedName(String name, String typed) {
        int nameIndex = 0;
        int typedIndex = 0;

        while (typedIndex != typed.length()) {
            if (nameIndex < name.length() && name.charAt(nameIndex) == typed.charAt(typedIndex) ) {
                nameIndex++;
                typedIndex++;
            }
            else if(typedIndex != 0 && (name.charAt(nameIndex-1) == typed.charAt(typedIndex))) {
                typedIndex++;
            }
            else {
                return false;
            }
        }
        return nameIndex == name.length();
    }
    public static void main(String[] args) {
        String name = "a";
        String typed = "b";
        System.out.println(isLongPressedName(name,typed));
    }
}
