package Test4;
import java.util.Arrays;
public class MaximiseProfitOnApp {
    public static void main(String[] args) {
        int budget[] = {30,20,53,14};
        int ans = maximumProfit(budget);
        System.out.println(ans);
    }

    public static int maximumProfit(int budget[]) {
        // Write your code here
        int ans = Integer.MIN_VALUE;
        int n = budget.length;

        //sort array
        Arrays.sort(budget); //sorting the array means that everyone on left side of current value won't subscribe (

        for(int i = 0; i<n; i++){
            //max budget will be maximum of budget * those who are willing to subscribe
            ans = Math.max(ans, budget[i] * (n-i));
        }

        return ans;


    }

}