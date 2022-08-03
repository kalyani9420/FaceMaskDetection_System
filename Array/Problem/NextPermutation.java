package Array.Problem;
// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are considered permutations of arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].
// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
// Given an array of integers nums, find the next permutation of nums.

// The replacement must be in place and use only constant extra memory.
public class NextPermutation {

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public static void reverse(int[] A, int i, int j) {
        while (i < j)
            swap(A, i++, j--);
    }

    public void nextpermutation(int arr[]) {
        int idx = -1;
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > arr[i - 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            reverse(arr, 0, n - 1);
        } else {
            int prev = idx;
            for (int i = idx + 1; i < n; i++) {
                if (arr[i] > arr[idx-1] && arr[i] <= arr[idx]) {
                    prev = i;
                }
            }
            swap(arr, idx - 1, prev);
            reverse(arr, idx + 1, arr.length - 1);
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1 , 2, 3 };
        NextPermutation n = new NextPermutation();
        n.nextpermutation(arr);
        n.printArray(arr);

    }
}
