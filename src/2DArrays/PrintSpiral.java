//
//public class Solution {
//
//	public static void spiralPrint(int arr[][]){
//
//        if(arr.length==0) {return;}
//        int n = arr.length;
//        int m = arr[0].length;
//         int top =0, down =n-1, left =0, right =m-1,dir=0;
//       while (top <= down && left <= right) {
//           if(dir==0 && top <= down && left <= right) {
//               for (int i = left; i <= right; i++) {
//                   System.out.print(arr[top][i] + " ");
//               }
//               top = top + 1;
//               dir = dir + 1;
//           }
//
//           if(dir==1 && top <= down && left <= right) {
//               for (int i = top; i <= down; i++) {
//                   System.out.print(arr[i][right] + " ");
//               }
//               right = right - 1;
//               dir = dir + 1;
//           }
//           if(dir ==2 && top <= down && left <= right) {
//               for (int i = right; i >= left; i--) {
//                   System.out.print(arr[down][i] + " ");
//               }
//               down = down - 1;
//               dir = dir + 1;
//           }
//           if(dir ==3 && top <= down && left <= right) {
//               for (int i = down; i >= top; i--) {
//                   System.out.print(arr[i][left] + " ");
//               }
//               left = left + 1;
//               dir = dir + 1;
//           }
//          dir=dir%4;
//
//        }
////Your code goes here
//	}
//    }