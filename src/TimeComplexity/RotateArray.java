//public class Solution {
//
//    public static void rotate(int[] arr, int d) {
//        //Your code goes here
//        if(d<=0)
//            return;
//        if(d>arr.length)
//            d=d-arr.length;
//        reverseArray(arr,0,arr.length-1);
//        reverseArray(arr,0,arr.length-1-d);
//        reverseArray(arr,arr.length-d,arr.length-1);
//
//    }
//    private static void reverseArray(int[] arr,int start,int end)
//    {
//        int temp;
//        while(start<end){
//            temp = arr[start];
//            arr[start++] = arr[end];
//            arr[end--] = temp;
//
//        }
//    }
//
//}