//class Solution {
//
//    public static boolean isPermutation(String input1, String input2) {
//        int frequencyArr[]=new int[256];
//        int count=0;
//        for(int i=0;i<input1.length();i++){
//            int cha=input1.charAt(i);
//            frequencyArr[cha]=frequencyArr[cha]+1;}
//        for(int i=0;i<input2.length();i++)
//        {
//            int ch=input2.charAt(i);
//            frequencyArr[ch]=frequencyArr[ch]-1;
//        }
//        for(int i=0;i<256;i++)
//        {
//            if(frequencyArr[i]==0)
//                count++;
//        }
//        if(count==256)
//            return true;
//        else
//            return false;
//
//        //Your code goes here
//    }
//
//}