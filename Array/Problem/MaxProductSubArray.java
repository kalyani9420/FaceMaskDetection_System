package Array.Problem;

public class MaxProductSubArray {
    public int productSubArrya(int arr[]){
        int result = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++) {
               
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        MaxProductSubArray m = new MaxProductSubArray();
        int result = m.productSubArrya(arr);
        System.out.println(result);
    }
    
}
