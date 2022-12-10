package Arrays;
import java.util.Arrays;
public class RotateArrays {
    /*
    Time complexity of this code is 2n which is O(N)
    space complexity is constant since no extra space is used.
     */
    public static void rotate(int[] arr, int d) {

        //reverse the whole array
        int n = arr.length, i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        //from start
        i = 0;
        //length - number of rotations -1 (same as how many shifts to the left)(pivot index)
        j = n - d - 1;
        // reverse the left half of the pivot index
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        //from right of pivot index to the end
        i = n - d;
        j = n - 1;
        //reverse the right half
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        rotate(arr,4);
        System.out.println(Arrays.toString(arr));
    }
}
