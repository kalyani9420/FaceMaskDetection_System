// package Search;

// import java.lang.reflect.Array;

// Search the key weather it is present in array if yes then return index else find out the appropriate position for the key
// array should be sorted

// public class SearchAndInsert {
//     // int arr[];
//     public int SearchInsertPosition(int arr[] , int key){

       

//             int low = 0;
//             int high  = arr.length - 1;
//             while(low <= high){
//                 int mid = (high + low) /2;
//                 if(arr[mid] == key){
//                     return mid;
//                 }
//                 if(key < arr[mid]){
//                     high = mid - 1;
//                 }
//                 else{
//                     low = mid + 1;
//                 }
//             }
//             return low;
    
        
//     }

//     public int[] InsertPosition(int arr[] , int key){
//         int pos = SearchInsertPosition(arr, key);
//         int arrdemo[];
//         for(int i = pos+1 ; i<arr.length ; i++){
//             // int arrdemo[]
            
//         }

//     }

//     public static void main(String[] args) {
//         int arr[] = { 1 , 2, 4 , 5 ,6 ,7 ,8 ,9};
//         SearchAndInsert  s = new SearchAndInsert();
//         // s.arr = arr;
//         System.out.println(s.InsertPosition(arr, 3)); 
        
//     }
    
// }
