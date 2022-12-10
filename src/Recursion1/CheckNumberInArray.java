package Recursion1;

public class CheckNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int x = 9;
        boolean isPresent = checkNumber(arr,x);
        System.out.println(isPresent);
    }
    public static boolean checkNumber(int arr[],int x){
        //helper function with additional startIndex
        return checkNumber(arr,x,0);
    }
    public static boolean checkNumber(int arr[], int x, int startIndex){
        //return if array is empty or if the start index reaches the end of the array
        if(arr.length==startIndex){
            return false;
        }
        //checks if the array at the start index is x
        if(arr[startIndex]==x){
            return true;
        }
        //traverse the whole array by incrementing the start index by one every call
        return checkNumber(arr,x,startIndex+1);

        //you can also check the element by creating a small array check the element at the last index and
        //then pass the smaller array in the function
    }
}
