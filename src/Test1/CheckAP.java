//import java.util.Scanner;
//public class Main {
//
//    public static void main(String[] args) {
//        int n;
//        Scanner s = new Scanner(System.in);
//        n = s.nextInt();
//        int[] a = new int[n];
//        for (int i = 0;i<n ; i++)
//        {
//            a[i] = s.nextInt();
//        }
//        if(CheckAP(a)==1) {System.out.println("true");}
//        else {System.out.println("false");}
//
//
//
//    }
//
//
//
//    public static int CheckAP(int[] a)
//    {
//        int iDiff=a[1]-a[0];
//        for(int i=0;i<a.length-1;i++)
//        {
//            if((a[i+1]-a[i])!=iDiff)
//                return -1;
//        }
//        return 1;
//    }
//}