package Array.Problem;

public class FindDuplicate {

    public static void main(String[] args) {

        int arr[] ={1 , 5 ,7 , 7 , 1,  8, 9};
        boolean flag = false;
        for(int i = 0; i< arr.length ; i++){
            for(int j = i+1 ; j< arr.length ; j++ ){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;

                }
            }

        }
        System.out.println(flag);
    }
    
}
