package Patterns.RecursivePattern;

public class AlphaPattern extends Patterns{
    @Override
    void pattern(int a, int b) {
        if(b>a){
            return;
        }
        char s = 'A';
        for(int i=0;i<b;i++){
            System.out.print((char)(s-1+b));
        }
        System.out.println();
        pattern(a,b+1);
    }
}
