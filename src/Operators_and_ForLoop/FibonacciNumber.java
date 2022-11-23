package Operators_and_ForLoop;

import java.util.Scanner;

public class FibonacciNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        int a =0;
//        int b = 1;
//        int fib = 0;
//
//        for(int i = 1; i<=n-2 ; i++){
//            fib = a + b;
//            a=b;
//            b=fib;
//        }
//        System.out.println(fib);

        int f = fibonacci(n);
        System.out.println(f);

    }

    private static int fibonacci(int n) {
        if(n<=1){
            return n;
        }
     return fibonacci(n-1)+fibonacci(n-2);
    }
}
