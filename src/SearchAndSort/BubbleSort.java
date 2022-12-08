/*
Bubble sort is the simplest, comparison-based sorting algorithm which helps us sort an array by traversing it repeatedly,
comparing adjacent elements, and swapping them based upon desired sorting criteria.
Bubble sort is an in-place algorithm, meaning it does not require any extra space;
it changes the original array instead.

The bubble sort algorithm is classified as a stable algorithm because it does not change the relative order of duplicate values in an array.

 the average case time complexity of the bubble sort algorithm is n^2.
 worst-case complexity, in this case, will be n^2.

 In its best-case scenario, which is to check whether the array is already sorted, the optimized algorithm is extremely efficient.
 Best case complexity is N
 */

package SearchAndSort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr){

        int n = arr.length;
        int temp [] = new int[n];

        for(int i = 0; i<n-1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                //ignoring the last element since it is sorted

                if (arr[j] > arr[j + 1]) {
                    //move the largest element to the last

                    temp[j] = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp[j];

                }
            }
         }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,6,7,3,9,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
