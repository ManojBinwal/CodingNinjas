package Recursion2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {1,4,3,5,2,6,8,7};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int arr[]){
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int pi = partition(arr,si,ei);
        quickSort(arr,si,pi-1);
        quickSort(arr,pi+1,ei);
    }
    public static int partition(int[] arr, int si, int ei){
        int pe = arr[si];
        int snc = 0;
        for(int i=si+1;i<=ei;i++){
            if(arr[i]<pe){
                snc++;
            }
        }
        int temp =arr[si+snc];
        arr[si+snc]=pe;
       arr[si]=temp;

        int i = si;
        int j = ei;

        while(i<j){
            if(arr[i]<pe){
                i++;
            }
            else if(arr[j]>=pe){
                j--;
            }
            else{
                arr[i]=arr[i]^arr[j];
                arr[j]=arr[i]^arr[j];
                arr[i]=arr[i]^arr[j];
                i++;
                j--;
            }
        }
        return si + snc;
    }
}
