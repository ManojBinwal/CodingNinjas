package Patterns.RecursivePattern;

import java.util.Scanner;

public class HalfDiamondRec {
    public void pattern1(int n , int p){
        if(p>n){
            return;
        }
        System.out.print("*");
        for(int i=1; i<=p; i++){
            System.out.print(i);
        }
        for (int j=2; j<=p; j++){
            System.out.print(p-1-j+2);
        }
        System.out.print("*");
        System.out.println();
        pattern1(n,p+1);
    }

    public void pattern2(int n, int p) {
        if(p>n){
            return;
        }
        System.out.print("*");
        for(int i = 1; i<=n-p+1; i++){
            System.out.print(i);
        }
        for(int j = 1; j<=n-p; j++){
            System.out.print(n-j-p+1);
        }
        System.out.print("*");
        System.out.println();
        pattern2(n,p+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        System.out.println("*");
        HalfDiamondRec hf = new HalfDiamondRec();
        hf.pattern1(n,p);
        hf.pattern2(n-1,p);
        System.out.print("*");
    }
}
