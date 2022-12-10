package Recursion1;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n =1234;
        int c = count(n);
        System.out.println(c);
    }
    public static int count(int n){
        if(n<10){
            return 1;
        }
        return 1 + (count(n/10)); //return count + call the function for the smaller number.
    }
}
