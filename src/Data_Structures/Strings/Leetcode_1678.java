package Data_Structures.Strings;

public class Leetcode_1678 {
    public static String interpret(String command) {
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G')
                ans+='G';
            else if(command.charAt(i) == '(') {
                if (command.charAt(i+1) == ')') {
                    ans+='o';
                    i++;
                }
                else {
                    ans+="al";
                    i+=3;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
}
