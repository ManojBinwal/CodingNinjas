package Arrays;

import java.util.Arrays;

public class SumOfTwoArrays {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int m = arr1.length;
        int n = arr2.length;
        int i = m - 1, carry = 0, j = n - 1, k = output.length - 1;

        //backwards loop (addition is right to left)
        while (i >= 0 && j >= 0) {
            //store 1's place in output and take carry out
            output[k] = ((arr1[i] + arr2[j]) % 10) + carry; //add carry to the sum of digits
            carry = (arr1[i] + arr2[j]) / 10; //value of carry
            i--;
            j--;
            k--;
            //System.out.println(Arrays.toString(output));
        }
        output[k] = carry; // carry is put at the front

        //cases where one of the array is bigger add carry to where it belongs
        if (m > n) {
            while (k >= 0 && i >= 0) {
                output[k] = arr1[i] + carry;
                carry = carry / 10;
                k--;
                i--;

            }
        }
        if (m < n) {
            while (k >= 0 && j >= 0) {
                output[k] = arr1[j] + carry;
                carry = carry / 10;
                k--;
                i--;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr2 = {1,2,3,4,5,6,7,8};
        int[] arr1 = {2,3,5,6,7,8,3,3};
        int[] arr = new int[arr1.length+arr2.length];
        sumOfTwoArrays(arr1,arr2,arr);
        System.out.println(Arrays.toString(arr));
    }
}
