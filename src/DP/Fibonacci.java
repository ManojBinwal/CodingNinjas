package DP;

import java.util.Scanner;

public class Fibonacci {
    public static int fibb(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        int ans1,ans2;
        if(dp[n-1] == -1) {
          ans1 = fibb(n-1,dp);
          dp[n-1]= ans1;
        }
        else {
            ans1 = dp[n-1];
        }
        if(dp[n-2]==-1) {
            ans2 = fibb(n-2,dp);
            dp[n-2] = ans2;
        }else{
            ans2=dp[n-2];
        }

        int myans = ans1 + ans2;
        return myans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] dp = new int[n+1];
        for(int i=0; i<dp.length;i++){
            dp[i]= -1;
        }
        int ans = fibb(n,dp);
        System.out.println(ans);
    }
}
