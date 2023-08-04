package Algorithms.Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2,3,5,7,9,11,13,14,16};

        int index = binarySearch(arr, 11);
        System.out.println(index);

        int index2 = binarySearchByRecursion(arr, 14);
        System.out.println(index2);

        int[][] arr2 = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int[] ints = binarySearch(arr2, 33);
        System.out.println(Arrays.toString(ints));


    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid])
                end = mid-1;
            else
                return mid;
        }
        return -1;
    }

    static int binarySearchByRecursion(int[] arr, int target) {
        return binarySearch(0,arr.length-1,arr,target);
    }
    private static int binarySearch(int start, int end, int[] arr2, int key) {
        if (arr2.length == 0) {
            return -1;
        }
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (key > arr2[mid])
            return binarySearch(mid+1,end,arr2,key);
        else if (key < arr2[mid])
            return binarySearch(start, mid-1,arr2,key);
        else
            return mid;
    }

    public static int[] binarySearch(int[][] arr, int target) {
        int r = 0;
        int c = arr.length-1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] {r,c};
            }
            if (target < arr[r][c])
                c--;
            else {
                r++;
            }
        }
        return new int[] {-1,-1};
    }

}
