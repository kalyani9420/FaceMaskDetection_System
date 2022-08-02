

public class mergeTwoSortArray {

    public void printArray(int arr[]){
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();   

    }


    public int[] mergeTwoSort(int arr1[] , int arr2[] , int n , int m){
         int result[] = new int[n+m];

         int i =0 ;
         
         int j =0 ;
         
         int k =0 ;

         while(i< n && j < m){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }
            else{
                result[k] = arr2[j];
                j++;

            }
            k++;
         }

         while(i < n){
            result[k] = arr1[i];
            i++;
            k++;
         }
         while(j < m){
            result[k] = arr2[j];
            j++;
            k++;
         }





         return result;


    }

    public static void main(String[] args) {
        int arr1[] = {1 , 3 , 5, 7, 9};
        int arr2[] = {2 , 4 , 6 , 8 , 10 , 12 ,  14};
        mergeTwoSortArray m = new mergeTwoSortArray();
        int[] result = m.mergeTwoSort(arr1 , arr2 , arr1.length , arr2.length);

        m.printArray(result);
        
    }
    
}
