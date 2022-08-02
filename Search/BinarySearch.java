package Search;

public class BinarySearch {

    public int search(int arr[] , int key){

        int low = 0;
        int high  = arr.length - 1;
        while(low <= high){
            int mid = (high + low) /2;
            if(arr[mid] == key){
                return mid +1;
            }
            if(key < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        BinarySearch b =  new BinarySearch();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(b.search(arr, 4));
    }
    
}
