package Array.Problem;

// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// A subarray is a contiguous part of an array.
public class MaxSubArray {

    public int maxSubArray(int arr[] , int n){
        int maxSumOfSubArray = 0;
        for(int i =0 ; i<= n ; i++){
            int subArraySum = 0;
            for(int j = i ; j<= n ; j++){
                subArraySum += arr[j];

                if(subArraySum > maxSumOfSubArray){
                    maxSumOfSubArray = subArraySum;
                }
            }
        }
        return maxSumOfSubArray;

    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println();   
        MaxSubArray m = new MaxSubArray();
        int result = m.maxSubArray(arr, arr.length - 1);
        System.out.println(result);
    }
}
