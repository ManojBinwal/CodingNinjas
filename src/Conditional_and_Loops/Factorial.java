package Conditional_and_Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fac = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fac = fac*i;
        }
        System.out.println(fac);

    }
}
