//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int temp = N;
//        int count = 0;
//        int num = 0;
//
//        while(temp !=0) {
//
//            temp = temp/10;
//            count++;
//        }
//
//        for(int i = 1; i<=count ; i++) {
//
//            int powr = (int) Math.pow(2, i-1);
//
//            int rem = N % 10;
//            num = num + (rem * powr);
//            N=N/10;
//
//
//        }
//        System.out.println(num);
//
//        // Write your code here
//
//    }
//}