package Sort;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BubbleSort {
    
    public void printArray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();   

    }
    public void sort(int arr[]){
        int n =arr.length;
        boolean isSwapDone;
        for(int i = 0 ; i< n-1; i++){
            isSwapDone = true;
            for(int j= 0 ; j < n-1-1 ; j++ ){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapDone = true;
                }
            }

            if(isSwapDone == false){
                break;
            }
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

        BubbleSort b = new BubbleSort();
        b.sort(arr);
        System.out.println("After bubble sort : ");
        b.printArray(arr);
        sc.close();
    }
}
