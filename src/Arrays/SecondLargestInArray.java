package Arrays;
/*
TC - O(N)
space - O(1)
 */
public class SecondLargestInArray {
    public static int secondLargestElement(int[] arr) {

        int L = Integer.MIN_VALUE; //default max value since nothing can be smaller than this
        int D = Integer.MIN_VALUE;

        if (arr.length <= 1) {    //if there is only one element there can be no second largest
            return Integer.MIN_VALUE;
        }
        //Linear traversal to find the largest and second largest
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > L) { //checks if element is the largest
                D = L; //copy the previous largest into the D
                L = arr[i]; //copy largest into L
            }

            if (arr[i] > D && arr[i] != L) { //In case the first element is the largest This finds second largest.
                D = arr[i];
            }
        }

        return D;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        int s= secondLargestElement(arr);
        System.out.println(s);
    }
}
