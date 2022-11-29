package RecursionAssignments;

import org.w3c.dom.ls.LSOutput;

public class MuliplicationRecursive {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        int mul = multiplication(4,6);
        System.out.println(mul);
    }
    public static int multiplication(int m , int n){
        if(n==0){
            return 0;
        }
        return m + multiplication(m,n-1);
    }

}
