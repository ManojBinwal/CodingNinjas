package Recursion2;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={1,3,6,2,4,5,7,9,8};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int arr[]){
        if(arr.length<=1){
            return;
        }
        int smallarr1[] = new int[arr.length/2];
        int smallarr2[] = new int[arr.length-arr.length/2];
        for(int i =0 ; i <arr.length/2;i++){
            smallarr1[i]=arr[i];
        }
        int k=0;
        for(int j=arr.length/2; j<arr.length;j++){
            smallarr2[k]=arr[j];
            k++;
        }
        mergeSort(smallarr1);
        mergeSort(smallarr2);
        merge(smallarr1,smallarr2,arr);
    }
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
