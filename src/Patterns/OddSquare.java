/*
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135

 */
package Patterns;

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n   = sc.nextInt();
        for (int i = 1; i <= n*2; i+=2) {
            for (int j = i; j <= n * 2; j+=2) {
                System.out.print(j);
            }
        if(i>1) {
            for (int k = 1; k <= i - 2; k += 2)
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
