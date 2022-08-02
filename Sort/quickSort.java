

import java.util.Scanner;

//divide and conquer
//pivot could be first element , last element or any random element
public class quickSort {

    public void printArray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();   

    }

    public int partition(int arr[] , int low , int high){
        int i = low;
        int j = low;
        int pivot = arr[high];
        while(i <= high){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
            i++;
        }
        return j-1;    

    }

    public void sort(int[] arr , int low ,int high){
        if(low < high){
            int p = partition(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1 , high);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total digits in array : ");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter array : ");
        for(int i =0 ; i<len ; i++){ 
             arr[i] = sc.nextInt();
        }

        quickSort i = new quickSort();
        i.sort(arr , 0 , arr.length - 1 );
        System.out.println("After  sort : ");
        i.printArray(arr);
        sc.close();
        
    }



    
}
