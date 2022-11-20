/*
Sum of even & odd
Send Feedback
Write a program to input an integer N and print the sum of all its even digits
and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245",
even digits are 2 & 4 and odd digits are 1, 3 & 5.
        Input format :
         Integer N
        Output format :
        Sum_of_Even_Digits Sum_of_Odd_Digits
        (Print first even sum and then odd sum separated by space)
        Constraints
        0 <= N <= 10^8
        Sample Input 1:
        1234
        Sample Output 1:
        6 4
*/
package Conditional_and_Loops;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int even = 0, odd = 0;

        while(digit != 0){
            int rem = digit % 10;
            if(rem%2==1){
                odd = odd + rem;
            }
            else {
                even = even + rem;
            }
            digit = digit / 10;
        }
        System.out.print(even + " " + odd);
        sc.close();
    }
}
