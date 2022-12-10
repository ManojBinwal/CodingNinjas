package Recursion1;

/*
the problem is same as find x just find x return its index.
 */

public class FirstIndexOfaNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int x = 5;
        int index = firstIndex(arr,x);
        System.out.println(index);
    }
    public static int firstIndex(int arr[],int x){
        return firstIndex(arr,x,0);
    }
    public static int firstIndex(int arr[], int x, int startIndex){
        if(arr.length==startIndex){
            return -1;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        return firstIndex(arr,x,startIndex+1);
    }
}
