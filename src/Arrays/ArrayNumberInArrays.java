//public class Solution {
//
//    public static void arrange(int[] arr, int n) {
//
//        int len = 0;
//        int temp = 2;
//        if (n%2==0) { len = n/2 -1;}
//        else{len = n/2;}
//
//        for(int i = 0 ; i<n ; i++) {
//
//            if(i<=len)  { arr[i]=2*i + 1;}
//
//
//        }
//
//
//        for(int i = n-1 ; i>len; i--) {
//
//            arr[i] = temp;
//            temp = temp + 2;
//
//        }
//        //Your code goes here
//    }
//}