package Recursion1;
/*
Memoization is the process of storing the answers you get recursively so that further recursive calls to find the same answer is not necessary
 */
public class Fibonacci {

    /**
     * This is the recursive method of finding fibonacci without optimisation.
     * The time complexity of this function is 2^n which can be called one of the worst time complexities.
     * the problem here is that in the recursive tree f(n) is dependent of f(n-1) and f(n-2) and for every f(n)
     * these two functions will be needed therefore. And since every branch calculates these functions independently of other
     * same function will be called multiple times increasing the time.
     */
    public static int fibb(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans1 = fibb(n-1);
        int ans2 = fibb(n-2);

        int myAns= ans1 + ans2;
        return myAns;
    }

    //using Dynamic Programming and Memoization
    /*
    *This is calculating fibonacci numbers recursively using the memoization. This solves the problem with above method
    * where the functions were working independently without sharing data among each other.
    * the idea behind memoization is store the answer returned by each function and when the same function is called
    * again instead of calling the function recusively use the stored value.
    * This reduced the time complexity of the code exponentially from 2^n to n
     */
    public static int fibb(int n,int dp[]){
        if(n==0 || n==1){
            return n;
        }
        int ans1 , ans2;

        //check if the answer is already stored in the array and since it's an array values will not reset on every recursive call
        if(dp[n-1]==-1) {
            ans1 = fibb(n - 1);
            dp[n-1] = ans1; // if there were no answers in array then store the answer in the array
        }
        else {
            ans1 = dp[n-1]; //if dp does not have default value then answer must be inside dp
        }
        if(dp[n-2]==-1) {
            ans2 = fibb(n - 2);
            dp[n-2] = ans2;
        }
        else{
            ans2 = dp[n-2];
        }

        int myAns= ans1 + ans2;
        return myAns;
    }

    public static void main(String[] args) {
        int n = 10;
        int[]dp = new int[n+1];
        for(int i = 0; i< dp.length;i++){
            dp[i]=-1;
        }
        int ans = fibb(n,dp);
        System.out.println(ans);
    }
}
