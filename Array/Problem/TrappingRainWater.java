package Array.Problem;
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// Example 1:
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

public class TrappingRainWater {

    public int trap(int arr[]){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];

        for(int i = 1 ; i<n ; i++){
            left[i] = Math.max(arr[i], left[i-1]);
        }
        right[n - 1]= arr[n - 1];
        for(int i= n-2 ; i>=0 ; i--){
            right[i] = Math.max(arr[i], right[i+1]);
        }
        int ans = 0;
        for(int i =0 ; i< n ; i++){
            ans += (Math.min(left[i], right[i]) - arr[i]);
        }



        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater t = new TrappingRainWater();
        int result = t.trap(arr);
        System.out.println(result);
    }
    
}
