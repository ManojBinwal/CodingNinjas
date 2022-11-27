//public class Solution {
//
//    public static String reverseEachWord(String input) {
//        String reverseWord = "",result = "";
//        int start = 0,j,end;
//        for(int i= 0;i < input.length();i++) {
//            if(input.charAt(i) == ' ') {
//                end = i - 1;
//                reverseWord = "";
//                for(j = end;j >= start;j--) {
//                    reverseWord += input.charAt(j);
//                }
//                start  = i + 1;
//                result = result + reverseWord + " ";
//            }
//        }
//        reverseWord = "";
//        for(j = input.length() - 1;j >= start;j--) {
//            reverseWord += input.charAt(j);
//        }
//        result = result + reverseWord + " ";
//        return result;
//        //Your code goes here
//    }
//
//}