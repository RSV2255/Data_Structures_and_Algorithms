package Algorithms.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9,2,5,0,8,4,7,3,6,1};
        int number = 7;
        if (linearSearch(arr, number) == -1) {
            System.out.println("The number is not in the array");
        }
        else {
            System.out.println("The number is in array at index of "+linearSearch(arr,number));
        }

    }
    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

}
