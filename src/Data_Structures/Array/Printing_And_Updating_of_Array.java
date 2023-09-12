package Data_Structures.Array;

public class Printing_And_Updating_of_Array {
    public static void main(String[] args) {
        // we can create array directly by giving values

        int[] arr = {2,5,8,9,4,3,7,6,1};

        // to print an array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // (or)


        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        // to access particular element in an array

        System.out.println(arr[2]);

        // to update an array

        arr[2] = 10;
    }
}
