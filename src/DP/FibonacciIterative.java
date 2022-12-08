package DP;

public class FibonacciIterative {

    public static int fibbI(int n) {

        if(n==0 || n==1){
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        //n>=2
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
