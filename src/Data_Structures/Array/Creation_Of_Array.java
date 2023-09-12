package Data_Structures.Array;

import java.util.Scanner;

public class Creation_Of_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = scanner.nextInt();
        // create an array of size n
        int[] arr = new int[n];
        // give all the elements in an array by using scanner class
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // (or)

        for (int i : arr) {
            i = scanner.nextInt();
        }





    }
}
