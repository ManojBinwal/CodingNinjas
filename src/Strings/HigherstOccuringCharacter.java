//
//public class Solution {
//
//    public static char highestOccuringChar(String str) {
//        int count[] = new int[256];
//
//        // Construct character count array from the input
//        // string.
//        int len = str.length();
//        for (int i=0; i<len; i++)
//            count[str.charAt(i)]++;
//
//        int max = -1;  // Initialize max count
//        char result = ' ';   // Initialize result
//
//        // Traversing through the string and maintaining
//        // the count of each character
//        for (int i = 0; i < len; i++) {
//            if (max < count[str.charAt(i)]) {
//                max = count[str.charAt(i)];
//                result = str.charAt(i);
//            }
//        }
//
//        return result;
//        //Your code goes here
//    }
//
//}