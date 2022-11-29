package RecursionAssignments;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        int s = sumOfDigits(n);
        System.out.println(s);
    }
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }
}
