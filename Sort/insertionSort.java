package Sort;

import java.util.Scanner;

public class insertionSort {

    public void printArray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();   

    }

    public void sort(int arr[]){

        int n = arr.length;
        for(int i = 1 ; i< n ; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j + 1] = temp;
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

        insertionSort i = new insertionSort();
        i.sort(arr);
        System.out.println("After  sort : ");
        i.printArray(arr);
        sc.close();
        
    }
    
}
