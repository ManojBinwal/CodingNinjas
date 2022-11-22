package Patterns.RecursivePattern;

public class TriangularNumberPattern extends Patterns{
    public void pattern(int n, int p){
        if(p>n){
            return;
        }
        for(int i = 1 ; i<=p; i++){
            System.out.print(p);
        }
        System.out.println();
        pattern(n,p+1);
    }

}
