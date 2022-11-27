//
//public class Solution {
//
//    public static void totalSum(int[][] arr) {
//        int sum = 0;
//        int n=arr.length;
//        for(int i=0;i<arr.length;i++){
//
//            sum += arr[i][i];
//        }
//        for(int i=0,j=n-1;i<arr.length;i++,j--) {
//            sum += arr[i][j];
//        }
//
//        for(int i=1; i<n-1; i++) {
//            sum=sum + arr[0][i] + arr[i][0] +arr[i][n-1] +arr[n-1][i];
//        }
//        if(n%2==1){sum=sum-arr[n/2][n/2];}
//        System.out.println(sum);
//
//        //Your code goes here
//    }
//
//}