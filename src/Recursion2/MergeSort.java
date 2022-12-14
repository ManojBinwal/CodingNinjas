/*
In case of merge sort the big array is first divided into two smaller arrays.
These two smaller arrays will then be passed to the merge sort function
The first arrays will then be split into smaller arrays and when array length becomes 1 the process of splitting will end.
The first array will then be passed into the merge function -
    In merge function it will first sort the values and then merge the array back again.
same process will take place in second array.
now we will have original small arrays with sorted values-They will be sent to merge function where they will sorted and then merged into single array.
https://he-s3.s3.amazonaws.com/media/uploads/37deb43.jpg

 */


package Recursion2;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={1,3,6,2,4,5,7,9,8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int arr[]){
        if(arr.length<=1){   //when to stop splitting / sorting
            return;
        }
        int smallarr1[] = new int[arr.length/2];  //small array 1
        int smallarr2[] = new int[arr.length-arr.length/2]; //small array 2
        for(int i =0 ; i <arr.length/2;i++){  // copying first half elements into array 1
            smallarr1[i]=arr[i];
        }
        int k=0;
        for(int j=arr.length/2; j<arr.length;j++){ //copying second half elements into array2
            smallarr2[k]=arr[j];
            k++;
        }
        mergeSort(smallarr1); // Recursively calling sort on small array 1
        mergeSort(smallarr2); // Recursively calling sort on small array 2
        merge(smallarr1,smallarr2,arr); //merge the two small arrays
    }

    /*
    This is a merge function which also sorts the elements of the arrays.
     */
    public static void merge(int smallarr1[],int smallarr2[], int arr[]){
        int i=0;
        int j=0;
        int k=0;

        while(i<smallarr1.length && j<smallarr2.length){
            if(smallarr1[i]>smallarr2[j]){
                arr[k]=smallarr2[j];
                j++;
            }
            else{
                arr[k]=smallarr1[i];
                i++;
            }
            k++;
        }
        while(i<smallarr1.length){
            arr[k]=smallarr1[i];
            i++;
            k++;
        }
        while(j<smallarr2.length){
            arr[k]=smallarr2[j];
            k++;
            j++;
        }
    }
}
