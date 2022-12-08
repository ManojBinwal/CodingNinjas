package SearchAndSort;

/*
This algorith is the prime example of divide and conquer approach.
time complexity is log(n)
space complexity is constant
 */



public class BinarySearch {
    public static int binarySearch(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            //we only check element at mid in binary search
            int mid = (start + end) / 2;
            if (arr[mid] < x) {
                //if greater than mid it has to be on the right side of mid
                start = mid + 1;
            } else if (arr[mid] > x) {
                //if less than mid than has to be on the left side of mid
                end = mid - 1;
            } else {
                // if element is not smaller or greater than mid than it to be mid.
                return mid;
            }

        }
        // if the loop end without returning mid than element is not present.
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9,11,15,17,21,43};
        int n = 5;
        int index = binarySearch(arr,111);
        System.out.println(index);
    }
}


