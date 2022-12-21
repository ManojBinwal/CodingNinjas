package Test4;

public class SplitArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        boolean ans =  splitArray(arr);
        System.out.println(ans);
    }
    public static boolean helper(int[] arr, int n,
                                 int start, int lsum, int rsum)
    {

        if (start == n)
            return lsum == rsum;
        if (arr[start] % 5 == 0)
            lsum += arr[start];
        else if (arr[start] % 3 == 0)
            rsum += arr[start];
        else return helper(arr, n, start + 1, lsum + arr[start], rsum)
                    || helper(arr, n, start + 1, lsum, rsum + arr[start]);

        return helper(arr, n, start + 1, lsum, rsum); //using recursion to iterate over all the elements
    }

    public static boolean splitArray(int[] arr)
    {
        return helper(arr, arr.length, 0, 0, 0);
    }
}
