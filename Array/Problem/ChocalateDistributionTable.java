package Array.Problem;

import java.util.Arrays;
import java.util.Scanner;

public class ChocalateDistributionTable {

    public void distribution(int arr[] , int size ,  int m) {
        // If there are no chocolates or
        // number of students is 0
        if (m == 0 || size == 0)
            return;
            
        // To store the minimum difference 
        int answer = Integer.MAX_VALUE;
        
        // Sort the given packets   
        Arrays.sort(arr);
        
        // Find the subarray of size m
        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.
        for (int i=0; i<=size-m; i++)
        {
            int minimumWindow = arr[i];
            int maximumWindow = arr[i+m-1];
            int gap = maximumWindow- minimumWindow ;
            
            if(gap < answer)
            {
                answer = gap;
            }
        }
        System.out.println(answer);

    }


    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
            Scanner sc = new Scanner(System.in);
        // System.out.println("Number of packets you want to pick : ");
        int m = 5;
        ChocalateDistributionTable c = new ChocalateDistributionTable();
        c.distribution(arr , arr.length -1 , m);
        // System.out.println(result);


        sc.close();
        
    }

}
