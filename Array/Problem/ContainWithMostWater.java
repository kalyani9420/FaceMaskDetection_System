package Array.Problem;
// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.
// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1
public class ContainWithMostWater {

    public int findMaxArea(int arr[]){
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int length = j-i;
                int height = Math.min(arr[i], arr[j]);
                maxArea = Math.max(length*height, maxArea);              
            }
            
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        ContainWithMostWater c = new ContainWithMostWater();
        int result = c.findMaxArea(arr);
        System.out.println(result);
    }
    
}
