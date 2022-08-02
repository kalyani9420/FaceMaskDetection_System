package Array;

public class Array1 {

    //int myArray[]
    //int[] myArray

    //arrayName = new dataType[size];

    //dataType[] arrayName = new dataType[size];
    //dataType arrayName[] = new dataType[size];
    //int[] arrayName = {1, 2 , 3 , 4};

     
    public void printArray(int[] arr){
        for(int i = 0; i<arr.length ; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // System.out.println(arr[arr.length - 1]);
    }

    public void DemoArray(){
        int[] myArray = new int[5];
        printArray(myArray);
    }

    public static int[] RemoveEven(int[] arr){
        int odd = 0;
        for(int i = 0; i<arr.length ; i++ ){
            if(arr[i] % 2 != 0){
                odd++;
            }
        }
        int[] temp = new int[odd];
        int indx = 0;

        for(int i = 0; i<arr.length ; i++ ){
            if(arr[i] % 2 != 0){
                temp[indx] = arr[i];
                indx++;
            }
        }
        return temp;       
    }

    public int[] Reverse(int[] arr , int start , int end){
        int[] temp = new int[start +1];
        int indx = 0;
        for(int i = start ; i>=0 ; i--){
            temp[indx] = arr[i];
            indx++;
        }

        return temp;
    
    }

    public int FindMin(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        
        int temp = arr[0];

        for(int i = 0; i<arr.length ; i++ ){
            if(arr[i] < temp){
                temp = arr[i];
            }
        }
        return temp;
    }

    public int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] > max){
                secondMax = max;
                max= arr[i];
            }
            else if(arr[i] > secondMax && arr[i]!= max){
                secondMax = arr[i];
            }

        }
        return secondMax;

    }

    public void shiftAllZeroAtTHeEndOfArray(int[] arr){
        int j = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i] != 0 && arr[j] ==0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }


    }

    public int[] ResizeArray( int[] arr , int resize){
        int[] temp = new int[resize];

        for(int i = 0 ; i< arr.length ; i++){
            temp[i] = arr[i];
        }

        arr = temp;

        return arr;

    }

    //Addition on n natural no. = n * (n+1) / 2
    public int findMissingNumber(int arr[] , int n){
        int add = n*(n+1)/2;
        int addAllElements = 0;
        for(int i =0 ; i< arr.length ; i++){
            addAllElements += arr[i];
        }

        int missingNum = add - addAllElements;
        return missingNum;

    }

    public boolean isPalandrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start ++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        Array1 a = new Array1();
        // a.DemoArray();
        int[] arr1 = {0 ,1 , 0, 2, 3  , 0 , 4 , 5 , 0, 6 , 0 ,7 ,8, 9};
        a.printArray(arr1);
        
        int[] resultArr = RemoveEven(arr1);
        a.printArray(resultArr);
        // a.printArray(new int[] {1 , 2 , 3});

        int[] result1 =a.Reverse(arr1, arr1.length - 1, 0);
        a.printArray(result1);

        int[] arr2= { 108 , 87 , 23 , 45 };

        System.out.println(a.FindMin(arr2));
        System.out.println(a.findSecondMax(arr2));
        a.shiftAllZeroAtTHeEndOfArray(arr1);
        a.printArray(arr1);

        int[] arr3 = a.ResizeArray(arr2 , arr2.length*2);
        a.printArray(arr3);
        System.out.println(arr3.length);

        int[]arr4 = {1 , 2 ,3 ,5, 6, 7, 8, 9 };
        System.out.println(a.findMissingNumber(arr4, 9));

        System.out.println(a.isPalandrome("abcd"));

    }


    
}
  