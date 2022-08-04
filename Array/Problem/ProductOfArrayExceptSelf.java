package Array.Problem;
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

public class ProductOfArrayExceptSelf {

    public void productOfElemet(int arr[]){
        int result[] = new int[arr.length];
        for(int i = 0 ; i< arr.length ; i++){
            int m = i-1 , n = i+1;
            result[i] = 1;
            while(m>= 0){
                result[i] *= arr[m];
                m--;
            }
            while(n<arr.length){
                result[i]*= arr[n];
                n++;
            }

        }
        
        for(int i = 0; i <result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10, 3, 5, 6, 2};
        ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
        p.productOfElemet(arr);
        
    }
}
