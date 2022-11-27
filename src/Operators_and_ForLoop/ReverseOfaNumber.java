package Operators_and_ForLoop;

import java.util.Scanner;

public class ReverseOfaNumber {


        public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();


            while (N % 10 == 0) {

                N = N / 10;

            }


            while (N  != 0) {

                System.out.print(N % 10);

                N = N / 10;
            }



            // Write your code here

        }
    }

