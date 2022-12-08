/*
Insertion sort is a simple sorting algorithm. The sorting technique is similar to Bubble Sort but is more efficient.
It assists in the in-place sorting of a collection by inserting one element at a time in an already sorted collection.
Insertion sort is adaptive in nature, i.e. it is appropriate for data sets which are already partially sorted.

The array is virtually split into a sorted and an unsorted part.
Values from the unsorted part are picked and placed at the correct position in the sorted part.

Time complexity is N^2
Best case complexity is N
 */

package SearchAndSort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 7, 2, 9, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
