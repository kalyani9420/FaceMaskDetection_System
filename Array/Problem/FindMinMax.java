package Array.Problem;

// Maximum and minimum of an array using minimum number of comparisons
public class FindMinMax {

    public String  minMax(int arr[]){
        int min = arr[0];
        int max = arr[0];

        for(int i = 1 ; i< arr.length  ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            else if(arr[i] > max){
                max = arr[i];
            }
            else{
                continue;
            }
        }

        return "Minimum--->" + min + "\nMaximum--->" + max;

    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        FindMinMax f = new FindMinMax();
        String result =  f.minMax(arr);
        System.out.println(result);
    
    }
    
}
