package Array.Problem;
// Write a program to reverse an array or string

public class ReverseString {

    public static void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public void reverseArray(int arr[]){

        int i = 0;
        int j = arr.length - 1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3 ,4, 5, 6 , 7 , 8 , 9 ,10 , 11};
        // int arr[] = {1000, 11, 445, 1, 330, 3000};
        ReverseString r = new ReverseString();
        System.out.println("Reverse String : ");
        r.reverseArray(arr);
        // r.printArray(arr);
    }
    
}
