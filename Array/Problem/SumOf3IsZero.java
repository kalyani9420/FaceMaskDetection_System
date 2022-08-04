package Array.Problem;
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
public class SumOf3IsZero {

    public void sumOfNumber(int arr[]){
        boolean flag = false;
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                if(j+1<arr.length){
                    if(arr[i] + arr[j] + arr[j+1] == 0){
                        System.out.println("["+ arr[i] +","+ arr[j] + ","+ arr[j+1]+ "]");
                        flag = true;
                    }

                }
            }
        }
        if(!flag){
            System.out.println("[]");
        }

    }



    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        SumOf3IsZero s = new SumOf3IsZero();
        s.sumOfNumber(arr);
    }
    
}

// public List<List<Integer>> threeSum(int[] nums) {
//     Arrays.sort(nums);
 
//     ArrayList<List<Integer>> result = new ArrayList<>();
 
//     for (int i = 0; i < nums.length; i++) {
//         int j = i + 1;
//         int k = nums.length - 1;
 
//         if (i > 0 && nums[i] == nums[i - 1]) {
//             continue;
//         }
 
//         while (j < k) {
//             if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
//                 k--;
//                 continue;
//             }
 
//             if (nums[i] + nums[j] + nums[k] > 0) {
//                 k--;
//             } else if (nums[i] + nums[j] + nums[k] < 0) {
//                 j++;
//             } else {
//                 ArrayList<Integer> l = new ArrayList<>();
//                 l.add(nums[i]);
//                 l.add(nums[j]);
//                 l.add(nums[k]);
//                 result.add(l);
//                 j++;
//                 k--;
//             }
//         }
//     }
 
//     return result;
// }