/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1


Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
 */
package Conditional_and_Loops;

import java.util.Scanner;

public class PowerofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();
        if(power == 0) {System.out.print("1"); return;}
        int ans = 1;
        for(int i = 0; i < power; i++) {
            ans = ans * number;
        }
        System.out.println(ans);
        sc.close();
    }
}
