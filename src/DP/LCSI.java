package DP;

public class LCSI {
    public static int lcsi(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
       int[][]dp = new int [m+1][n+1];

       for(int i=m-1; i>=0; i--){
           for(int j=n-1; j>=0; j--){
                int ans=0;
               if(s1.charAt(i)== s2.charAt(j)){

               }else{
                   int ans1 = dp[i][j+1];
                   int ans2 = dp[i+1][j+1];
                   ans = Math.max(ans1,ans2);
               }
               dp[i][j]=ans;
           }
       }
       return dp[0][0];
    }
}
