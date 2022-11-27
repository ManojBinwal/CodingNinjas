package Recursion1;

public class CheckNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int x = 9;
        boolean isPresent = checkNumber(arr,x);
        System.out.println(isPresent);
    }
    public static boolean checkNumber(int arr[],int x){
        return checkNumber(arr,x,0);
    }
    public static boolean checkNumber(int arr[], int x, int startIndex){
        if(arr.length==startIndex){
            return false;
        }
        if(arr[startIndex]==x){
            return true;
        }
        return checkNumber(arr,x,startIndex+1);

    }
}
