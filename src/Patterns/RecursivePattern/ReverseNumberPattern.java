package Patterns.RecursivePattern;

public class ReverseNumberPattern extends Patterns {
    public void pattern(int n, int p){
        if(p>n){
            return;
        }
        for(int i = 0; i<p; i++) {
            System.out.print(p-i);
        }
        System.out.println();
        pattern(n,p+1);
    }
}
