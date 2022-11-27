//import java.util.Arrays;
//public class Solution {
//
//    public static int tripletSum(int[] arr, int num) {
//        //Your code goes here
//        Arrays.sort(arr);
//        int l=arr.length;
//        int count=0;
//        for(int i=0;i<l-3;i++)
//        {
//            int j=i+1;
//            int k=l-1;
//            while(j<k)
//            {
//                if(arr[i]+arr[j]+arr[k]==num)
//                {
//                    for(int d=k;d>j;d--)
//                    {
//                        if(arr[i]+arr[j]+arr[d]==num)
//                        {
//                            count++;
//                        }
//                    }
//                    j++;
//                }
//                else if(arr[i]+arr[j]+arr[k]<num)
//                {
//                    j++;
//                }
//                else k--;
//            }
//        }
//        return count;
//    }
//}