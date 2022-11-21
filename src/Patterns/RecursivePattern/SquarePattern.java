package Patterns.RecursivePattern;

public class SquarePattern {
    static int temp = 0;

    public static void squarePattern(int n,int p){
        if(n == 0) {return;}
        for(int i = 0; i < p; i++){
            System.out.print(p);
        }
        System.out.println();
        squarePattern(n - 1,p);

    }

}
