package Recursion1;

public class LastIndexofaNumber{
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,9,5,4};
        int x = 4;
        int index = lastIndex(arr,x);
        System.out.println(index);
    }
    public static int lastIndex(int arr[], int x){
        return lastIndex(arr,x,arr.length-1);
    }
    public static int lastIndex(int arr[], int x, int startIndex){
        if(startIndex==0){
            return -1;
        }
        if(arr[startIndex]==x){
            return startIndex;
        }
        return lastIndex(arr,x,startIndex-1);
    }
}
