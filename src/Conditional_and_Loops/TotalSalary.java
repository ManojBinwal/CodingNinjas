
/*Total Salary
Send Feedback
Write a program to calculate the total salary of a person. The user has to enter the basic salary
(an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
        totalSalary = basic + hra + da + allow – pf
        where :
        hra   = 20% of basic
        da    = 50% of basic
        allow = 1700 if grade = ‘A’
        allow = 1500 if grade = ‘B’
        allow = 1300 if grade = ‘C' or any other character
        pf    = 11% of basic.
        Round off the total salary and then print the integral part only.
        Note: Try finding out a function on the internet to do so*/

package Conditional_and_Loops;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basic = input.nextInt();
        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        String grade = input.next().toLowerCase();
        char g = grade.charAt(0);
        int allow = 0;
        int total = 0;
        double pf = (0.11) * basic;
        if(g == 'a') {
            allow = 1700;
            total = (int) Math.round((basic + hra + da + allow - pf));
        }
        else if(g == 'b') {
            allow =1500;
            total = (int) Math.round((basic + hra + da + allow - pf));
        }
        else {
            total = (int) Math.round((basic + hra + da + 1300 - pf));

        }

        System.out.println(total);
        input.close();

    }
}
