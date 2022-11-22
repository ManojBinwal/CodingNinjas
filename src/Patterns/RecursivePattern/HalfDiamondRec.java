package Patterns.RecursivePattern;

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

    public void pattern2(int i, int p) {

    }
}
