package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {

    public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of elements in the arrray1- ");
//		int m = sc.nextInt();
//		System.out.println("Enter the number of elements in the arrray2- ");
//		int n = sc.nextInt();
        //int[] arr = { 0,2,1,2,1,0,1,2,0};
        //int m = arr.length;
        // int d = 2;
        int [] arr1 = {6,9,8} ; int m = arr1.length;
        int [] arr2 = {1,2}; int n = arr2.length;
        int [] output = new int[m+n];

        SumOfArrays(arr1,arr2,output);

        // int[] arr = new int[m+n];
        // int num = ReturnSecondLargest(arr);
        // System.out.println(num);
        // input(arr1);
        // input(arr2);
//		 System.out.print(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
//         System.out.println();
         MergeTwoSortedArraysWithoutUsingNewSpace(arr1,arr2,arr1.length,arr2.length);
        // MergeArrays(arr1,arr2);
        // arr = BruteMerge(arr1, arr2);
        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        // arr = Merge2SortedArraysUsing3rdArray(arr1,arr2);
        // PushZerostoEnd(arr,m);
        // RotateArraytoLeft(arr);
        // RotateToLeftSWapMethod(arr,d);
        // RotateTOLeftShiftingMethod(arr);
        // SortZerosAndOne(arr);
        // output(arr1);
        // output(arr2);
        //int k = CheckTheRotation(arr);
        //Sort012(arr);
        //System.out.println(k);
        output(output);

    }



    private static void SumOfArrays(int[] arr1, int[] arr2, int[] output) {

        int m = arr1.length;
        int n = arr2.length;
        int i=m-1,  carry = 0 ,  j=n-1 , k=output.length-1;


        while(i>=0 && j>=0) {

            output[k] = ((arr1[i] + arr2[j]) % 10 )+ carry;
            carry = (arr1[i] + arr2[j]) / 10;
            i--; j--; k--;
            System.out.println(Arrays.toString(output));
        }
        if (m>n) {
            while (k>=0 && i>=0) {
                output[k]=arr1[i]+carry;
                carry=carry/10;
                k--; i--;

            }
        }
        if (m<n) {
            while (k>=0 && j>=0) {
                output[k]=arr1[j]+carry;
                carry=carry/10;
                k--;i--;

            }
        }

    }



    private static void Sort012(int[] arr) {
        int n = arr.length;
        int count0=0, count1=0, count2=0;
        for(int i = 0; i<n; i++) {
            if(arr[i]==0) {count0++; }
            if(arr[i]==1) {count1++;}
            if(arr[i]==2) {count2++;}
        }
        //	System.out.println(count0 + " " + count1+ " " + count2);

        for(int i = 0; i<n; i++) {
            if(i<count0) { arr[i] = 0; }
            else if (i<count0+count1) {arr[i]=1; }
            else {arr[i] =2; }
        }

    }

    private static int CheckTheRotation(int[] arr) {
        int n = arr.length;
        int min =arr[0];
        for(int i=0;i<n;i++) {
            if(arr[i]<min) {
                min=arr[i];

            }
        }
        //System.out.println(min);
        int i = 0;
        while(min!=arr[i]) {
            i++;
        }
        return i;
    }

    private static void SortZerosAndOne(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (2 * i < j) {
            if (arr[i] == 1 && arr[j] != 1) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;

            } else if (arr[i] == 1 && arr[j] == 1) {
                j--;
            } else if (arr[i] == 0) {
                i++;
            }
            System.out.println(Arrays.toString(arr));
        }

    }

    private static int ReturnSecondLargest(int[] arr) {
        int L = Integer.MIN_VALUE;
        int D = Integer.MIN_VALUE;

        if (arr.length <= 1) {
            return Integer.MIN_VALUE;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > L) {
                D = L;
                L = arr[i];
            }
            if (arr[i] > D && arr[i] != L) {
                D = arr[i];
            }
        }

        return D;
    }

    private static void RotateToLeftSWapMethod(int[] arr, int d) {
        int n = arr.length, i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i = 0;
        j = n - d - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i = n - d;
        j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static void RotateTOLeftShiftingMethod(int[] arr) {
        int d = 2;
        int j = 0;
        int n = arr.length;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        for (int i = n - d; i < n; i++) {

            arr[i] = temp[j];
            j++;
        }

    }

    private static void RotateArraytoLeft(int[] arr) {
        int n = arr.length;
        int d = 2;
        int temp = 0;

        for (int i = 1; i <= d; i++) {
            temp = arr[0];
            for (int j = 0; j < n - 1; j++) {

                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }

    }

    private static void PushZerostoEnd(int[] arr, int m) {

        int[] temp = new int[m];

        int i = 0, j = 0, k = 0;

        while (i < m) {

            if (arr[i] != 0) {

                temp[k] = arr[i];
                i++;
                k++;

            } else {
                i++;
            }

        }
        while (k < m) {
            temp[k] = 0;
            k++;

        }

        for (i = 0; i < m; i++) {
            arr[i] = temp[i];
        }

    }

    private static int[] Merge2SortedArraysUsing3rdArray(int[] arr1, int[] arr2) {

        int arr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                arr[k] = arr1[i];
                i++;
                k++;
            }

            else {
                arr[k] = arr2[j];

                k++;
                j++;
            }
        }

        while (i < arr1.length) {
            arr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            arr[k] = arr2[j];
            j++;
            k++;
        }

        return arr;
    }

    // Function to find next gap.
    private static int nextGap(int gap) {
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }

    private static void MergeTwoSortedArraysWithoutUsingNewSpace(int[] arr1, int[] arr2, int m, int n) {
        int i, j, gap = n + m;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            // comparing elements in the first
            // array.
            for (i = 0; i + gap < m; i++)
                if (arr1[i] > arr1[i + gap]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }

            // comparing elements in both arrays.
            for (j = gap > m ? gap - m : 0; // ternary operator to initialize value of j
                 i < m && j < n; i++, j++)

                if (arr1[i] > arr2[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            System.out.println("for " + "i= " + i + " , j= " + j + " , gap = " + gap);
            if (j < n) {
                // comparing elements in the
                // second array.
                for (j = 0; j + gap < n; j++)
                    if (arr2[j] > arr2[j + gap]) {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
            }
            System.out.print(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
            System.out.println();
        }
    }

    private static int[] BruteMerge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int[] arr = new int[m + n];

        for (int i = 0; i < m; i++) {
            arr[i] = arr1[i];

        }

        for (int j = 0; j < n; j++) {
            arr[m + j] = arr2[j];
        }

        return arr;
    }

    private static void InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {

                arr[j + 1] = arr[j];
                j--;
                System.out.println(Arrays.toString(arr));
            }
            arr[j + 1] = current;
            System.out.println(Arrays.toString(arr));

        }

    }

    private static void SelectionSort(int[] arr) {
        int a = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] > arr[j]) {
                    a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;

                    // System.out.println(Arrays.toString(arr));
                }
            }
        }

    }

    private static void BubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // System.out.println(Arrays.toString(arr));
                }
            }
        }

    }

    private static void output(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void input(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

}
