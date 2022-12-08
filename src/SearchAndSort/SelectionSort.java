package SearchAndSort;

import java.util.Arrays;

public class SelectionSort {

    /*
    Selection sort is the process of sorting where the smallest element is selected
    from the array and is swapped with element at beginning. Since the first element
    is sorted it left alone for the rest of the process and the next smallest is selected
    and placed at the beginning.

    e.g. - [ 5, 7 ,3 ,2 ,1] --> [1,7,3,2,5] --> [1,2,3,7,5]
    --> [1,2,3,7,5] -->[1,2,3,5,7] --> [1,2,3,5,7]

    time complexity of this algorithm is n^2
    space complexity is constant
     */
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        int temp = 0; //to help with swapping

        for (int i = 0; i <= n - 1; i++) {

            int min = Integer.MAX_VALUE; //min is by default set to maximum possible integer value.
            int minIndex = -1; //index is -1 since there is no such index

            for (int j = i; j < n; j++) {
                //value of j is i since the min element will be placed at i index at every iteration.
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;

                }
            }

            //swapping element at index i with min element
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,1,8,6,5,7};
        int n = 5;
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

