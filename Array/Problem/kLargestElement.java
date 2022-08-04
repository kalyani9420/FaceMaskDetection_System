package Array.Problem;

import java.util.Arrays;

// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// You must solve it in O(n) time complexity.

public class kLargestElement {
    public static void main(String[] args) {

        int arr[] = {12, 3, 5, 7, 19};
        int k = 4;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        
    }
}
