package Recursion2;
/*
*Quick sort is an algorithm based on divide and conquer approach.
* The idea is to take a random element as the pivot.
* put all the elements smaller than pivot on the left of pivot.
* put all the elements larger than pivot on the right of the pivot.
* then call the recursive function on left and right sides.
 */
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,2,6,8,7};
        quickSort(arr); //calls quick sort method
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[]){
        quickSort(arr,0,arr.length-1); //calls quicksort helper method with start index and length of array
    }
    public static void quickSort(int arr[],int si, int ei){
        if(si>=ei){   //if array is empty return
            return;
        }
        int pi = partition(arr,si,ei);  //creating virtual partitions
        quickSort(arr,si,pi-1); //calls quicksort on the left side of the pivot index
        quickSort(arr,pi+1,ei); //calls quicksort on the right side of the pivot index
    }
    public static int partition(int[] arr, int si, int ei){
        int pe = arr[si];  //pivot element // can be random but for sake of understanding take it as first element
        int snc = 0;  //(small number count) count of  elements smaller the pe
        //loop to count elements smaller than pe
        for(int i=si+1;i<=ei;i++){
            if(arr[i]<pe){
                snc++;
            }
        }
        //move pe to its right position(startIndex + count of elements smaller than pe)
        int temp =arr[si+snc];
        arr[si+snc]=arr[si]; //swap elements at SI(pe) with the element at (si+snc)
       arr[si]=temp;
        //variables so that we don't change actual values of si and ei
        int i = si;
        int j = ei;

        //loop to move all elements smaller than pe to the left of pe and all the elements greater than pe to the right of pe
        while(i<j){ //iterating from both left and right side at the same time // loop end ends when left index exceeds right index
            if(arr[i]<pe){ //if elements of the left are smaller than pe than move to right
                i++;
            }
            else if(arr[j]>=pe){ // if elements on the right are greater than pe than move to left
                j--;
            }
            else{ //if element on the left is greater than pe and element on the right is greater than pe than swap the two elements
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[i]^arr[j];
                arr[i]=arr[i]^arr[j];
                i++;
                j--;
            }
        }
        return si + snc;//return index of pe
    }
}
