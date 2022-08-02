package Search;

public class LinearSearch {

    public int search (int[] arr , int x){
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] == x){
                return i+1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {8 , 7 , 5 , 4 , 6, 3, 2};
        LinearSearch s = new LinearSearch();
        System.out.println(s.search(arr, 5)); 
    }

    
    
}
