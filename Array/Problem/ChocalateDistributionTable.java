package Array.Problem;

import java.util.Arrays;
import java.util.Scanner;

// Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

// Each student gets one packet.
// The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
// Examples:

// Input : arr[] = {7, 3, 2, 4, 9, 12, 56} , m = 3 
// Output: Minimum Difference is 2 
// Explanation:
// We have seven packets of chocolates and 
// we need to pick three packets for 3 students 
// If we pick 2, 3 and 4, we get the minimum 
// difference between maximum and minimum packet 
// sizes.
public class ChocalateDistributionTable {

    public void distribution(int arr[] , int size ,  int m) {
        if (m == 0 || size == 0)
            return;
        int answer = Integer.MAX_VALUE;
  
        Arrays.sort(arr);
        
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
