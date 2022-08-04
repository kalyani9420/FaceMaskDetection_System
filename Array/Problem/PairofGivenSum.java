package Array.Problem;

// Find if there is a pair with a given sum in the rotated sorted Array

// Difficulty Level : Medium
// Last Updated : 28 Jul, 2022
// Given an array arr[] of distinct elements size N that is sorted and then around an unknown point, the task is to check if the array has a pair with a given sum X.

// Examples : 

// Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
// Output: true
// Explanation: There is a pair (6, 10) with sum 16

// Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 35
// Output: true
// Explanation: There is a pair (26, 9) with sum 35

// Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 45
// Output: false
// Explanation: There is no pair with sum 45.

public class PairofGivenSum {
    public void findPair(int arr[] , int sum){
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++ ){
                if(arr[i] + arr[j] == sum ){
                    System.err.println(arr[i] + " " + arr[j]);
                    break;

                }

            }

        }
    }
     public static void main(String[] args) {
      int arr[]  = {11, 15, 26, 38, 9, 10};
      PairofGivenSum p = new PairofGivenSum();
      p.findPair(arr , 35 );
    }
}
