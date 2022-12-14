package RecursionAssignments;

public class Staircase {
    public static void main(String[] args) {
       int n = 14;
        int[] dp = new int [n+1];
        int s = staircase(n);
        long w = staircaseDPRecursive(n);
        long t = staircaseDpIterative(n);
//        System.out.println(s);
//        System.out.println(t);
        System.out.println(w);
    }

    /*
    *This function return the solution to staircase problem using both recursion and memoization.
    * This reduced the time complexity from exponential to linear.
     */
    private static long staircaseDPRecursive(int n) {
        long[] dp = new long[n+1]; //creating array to store answers already found once
        for(int i=0; i<=n;i++){ //initialising all value to -1 to check if stores answer or not
            dp[i]=-1;
        }
        //since we can take 3 steps (1,2,3) we need to store their answers from the start
        //0 is counted as 1 step as you need to add 1 to steps from(n-1)t
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        return helper(n,dp);

    }

    private static long helper(int n,long[]dp) {
        //variables to store values of n-1,n-2 and n-3 steps
        long op1,op2,op3;
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        if(dp[n-1]==-1) {
            op1 = helper(n - 1, dp);
            dp[n-1]=op1;
        }
        else{
            op1=dp[n-1];
        }
        if(dp[n-1]==-1) {
            op2 = helper(n - 1, dp);
            dp[n-2]=op2;
        }
        else{
            op2=dp[n-2];
        }
        if(dp[n-3]==-1) {
            op3 = helper(n - 3, dp);
            dp[n-3] = op3;
        }
        else{
            op3 = dp[n-3];
        }
       return op1+op2+op3;
    }

    public static int staircase(int n){
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        int op1=staircase(n-1);
        int op2=staircase(n-2);
        int op3=staircase(n-3);
        return op1+op2+op3;
    }
    public static long staircaseDpIterative(int n){
        if(n<0){
            return 0;
        }
        long[] dp = new long[n+1];

        if(n==0 || n==1){
            return 1;
        }
        if(n>=1){
            dp[1]=1;
        }

        if(n>=2){
            dp[2]=2;
        }
        if(n>=3){
            dp[3]=4;
        }

        if(n>3){
            for(int i=4;i<=n;i++){
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }

        }
        return dp[n];
    }
}
