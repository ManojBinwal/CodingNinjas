package RecursionAssignments;

public class CountZone {
    public static void main(String[] args) {
        int n = 100200;
       int count = countZeros(n);
        System.out.println(count);
    }
    public static int countZeros(int n){
        if(n==0){
            return 0;
        }
        if(n%10==0){
            return 1+countZeros(n/10);
        }
        else
            return countZeros(n/10);
    }
}
