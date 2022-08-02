

import java.util.Scanner;

public class selectionSort {
     
    public void printArray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();   

    }

    public void sort(int arr[]){
        int n= arr.length;
        for(int i = 0 ; i< n ; i++){
            int min = i ;
            for(int j = i+1 ; j< n ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

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

        selectionSort b = new selectionSort();
        b.sort(arr);
        System.out.println("After selection sort : ");
        b.printArray(arr);
        sc.close();
    }
    
}
