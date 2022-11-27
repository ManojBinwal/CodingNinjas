//public class Solution {
//
//    public static void sortZeroesAndOne(int[] arr) {
//
//        int n = arr.length;
//        int i = 0 , j=n-1;
//        while(i<j) {
//            if (arr[i]==1 && arr[j]!=1) {
//                int temp = arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                i++; j--;
//
//            }
//            else if(arr[i]==1 && arr[j]==1) {
//                j--;
//            }
//            else if(arr[i]==0) {i++; }
//
//        }
//        //Your code goes here
//    }
//}