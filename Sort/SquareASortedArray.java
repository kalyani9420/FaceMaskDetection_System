
public class SquareASortedArray {

    public void printArray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();   

    }
    public int[] sortSquare(int arr[]){
        int n = arr.length;
        int result[] = new int[n];
        int i = 0;
        int j = n - 1 ;
        for(int k = n - 1 ; k>=0 ; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j]) ){
                result[k] = arr[i]*arr[i];
                i++;

            }
            else{
                result[k] = arr[j]*arr[j];
                j--;
            }
        }
        return result;

    }


    public static void main(String[] args) {
        int arr[] ={ -6 , -3, -2 , 0  , 7 , 12};
        SquareASortedArray s = new SquareASortedArray();
        int result[]= s.sortSquare(arr);
        s.printArray(result);

    }
    
}
