package SearchAndSort;
import java.util.*;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8,10};
        int arr2[]={1,3,5,7,9};
        int arr[]=merge(arr1,arr2);
//        merge(arr1,arr2);
//        mergeArrays(arr1,arr2);
        MergeTwoSortedArraysWithoutUsingNewSpace(arr1,arr2,arr1.length,arr2.length);
//        System.out.println(Arrays.toString(arr));
    }

    private static int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }
    private static void MergeTwoSortedArraysWithoutUsingNewSpace(int[] arr1, int[] arr2, int m, int n) {
        int i, j, gap = n + m;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            // comparing elements in the first
            // array.
            for (i = 0; i + gap < m; i++)
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }

            // comparing elements in both arrays.
            for (j = gap > m ? gap - m : 0; // ternary operator to initialize value of j
                 i < m && j < n; i++, j++)

                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            System.out.println("for " + "i= " + i + " , j= " + j + " , gap = " + gap);
            if (j < n) {
                // comparing elements in the
                // second array.
                for (j = 0; j + gap < n; j++)
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
            }
            System.out.print(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
            System.out.println();
        }
    }
    static void mergeArrays(int arr1[], int arr2[])
    {
        int len1 = arr1.length;
        int len2 = arr2.length;

        mergeArrays(arr1,arr2,len1,len2);

    }
    static void mergeArrays(int a[], int b[], int n, int m)
    {

        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();

        // Inserting values to a map.
        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(b[i], true);
        }

        // Printing keys of the map.
        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }
    public static int[] merge(int[]arr1,int[]arr2){
        int[] arr = new int[arr1.length+arr2.length];
        int len1 = arr1.length;
        int len2 = arr2.length;

        int i=0;
        int j=0;
        int k=0;

        //compare the two arrays and put smallest one in big array first
        while(i<len1 && j<len2){
            //loop terminates when either of the array is empty
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;

        }
        //copy remaing elements from the array with leftover elements.
        while(i<len1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<len2){
            arr[k]=arr2[j];
            j++;
            k++;
        }

        return arr;
    }


}
