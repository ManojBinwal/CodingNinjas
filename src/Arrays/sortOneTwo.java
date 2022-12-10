package Arrays;

/*
TC - O(N)
space - constant
 */
import java.util.Arrays;

public class sortOneTwo {
    public static void sort012(int[] arr){
        int n = arr.length;
        int count0=0, count1=0, count2=0;
        //count 0's , 1's and 2's
        for(int i = 0; i<n; i++) {
            if(arr[i]==0) {count0++; }
            if(arr[i]==1) {count1++;}
            if(arr[i]==2) {count2++;}
        }
        //put 0's , 1's and 2's according to count in the array
        for(int i = 0; i<n; i++) {
            if(i<count0) { arr[i] = 0; }
            else if (i<count0+count1) {arr[i]=1; }
            else {arr[i] =2; }
        }
    }

    public static void main(String[] args) {
        int arr[]  = {1,1,1,0,0,0,1,0,1,2,0,1,2,2};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
