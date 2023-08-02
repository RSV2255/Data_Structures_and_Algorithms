package Algorithms.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9,2,5,0,8,4,7,3,6,1};
        int number = 10;
        if (linearSearchByRecursion(arr, number) == -1) {
            System.out.println("The number is not in the array");
        }
        else {
            System.out.println("The number is in array at index of "+linearSearch(arr,number));
        }

        System.out.println(linearSearch("rushi",'s'));

    }
    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

    public static int linearSearchByRecursion(int[] arr, int n) {
        return linearSearch(0, arr,n);
    }


    private static int linearSearch(int index, int[] arr, int n) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == n) {
            return index;
        }
        else {
            return linearSearch(index+1,arr,n);
        }
    }

    public static int linearSearch(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                return i;
        }
        return -1;
    }




}
