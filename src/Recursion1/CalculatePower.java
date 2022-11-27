package Recursion1;

public class CalculatePower {
    public static void main(String[] args) {
        int n = 2;
        int p = 8;

        int pow = power(n,p);
        System.out.println(pow);
    }

    public static int power(int n, int p){
        if(p==0){
            return 1;
        }
        return n*(power(n,p-1));
    }
}
