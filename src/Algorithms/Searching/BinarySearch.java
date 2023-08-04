package Algorithms.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,11,13,14,16};

        int index = binarySearchByRecursion(arr, 14);
        System.out.println(index);


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

}
