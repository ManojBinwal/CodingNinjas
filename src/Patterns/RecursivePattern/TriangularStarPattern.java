package Patterns.RecursivePattern;

public class TriangularStarPattern {
    public void triangularStarPattern(int n, int p) {
        if(n<p){
            return;}

        for(int i=0; i<p; i++){
            System.out.print("*");
            }
        System.out.println();

        triangularStarPattern(n,p+1);

        }
    }
