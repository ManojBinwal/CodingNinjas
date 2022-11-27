// class Solution {
//
//    public static void wavePrint(int input[][]){
//        if(input.length==0){ return;}
//        for (int i = 0; i < input[0].length; i++) {
//            if (i % 2 == 0) {
//                for (int j = 0; j <=input.length-1; j++) {
//                    System.out.print(input[j][i]+" ");
//                }
//            }
//            else if (i % 2 != 0) {
//                for (int j = input.length - 1; j >= 0; j--) {
//                    System.out.print(input[j][i]+" ");
//                }
//            }
//        }
//        //Your code goes here
//    }
//
//}