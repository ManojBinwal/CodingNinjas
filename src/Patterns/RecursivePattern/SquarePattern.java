package Patterns.RecursivePattern;

public class SquarePattern {
    static int temp = 0;

    public static void squarePattern(int n,int p){
        if(p>n) {return;}
        for(int i = 0; i < n; i++){
            System.out.print(n);
        }
        System.out.println();
        squarePattern(n,p+1);

    }

}
