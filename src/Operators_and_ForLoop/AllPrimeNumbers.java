package Operators_and_ForLoop;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        System.out.println("2");


        for (int i = 3; i <= n ; i++) {

            boolean isprime = true;

            for ( int j = 2 ; j<i-1;j++) {

                if(i%j==0) {isprime = false; }

            }
            if (isprime == true) { System.out.println(i);}
        }




        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */


    }
}
