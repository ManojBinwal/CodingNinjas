package Patterns.RecursivePattern;

import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = n;

        SquarePattern s = new SquarePattern();
        s.squarePattern(n,p);

    }
}
