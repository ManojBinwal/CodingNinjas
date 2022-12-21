package Test4;

public class MinimumCount{
    public static void main(String[] args) {
        int n = 12;
        int ans = minCount(n);
        System.out.println(ans);
    }
    public static int minCount(int n){

        if (n <= 3)
            return n;
        int ans = n;  //max count possible is n //also it is answer for i=1 so you can ignore 1
        for (int i = 2; i <= n; i++)
        {
            int square = i * i;
            if (square > n) //if square is greater than n. //wrong answer
                break;
            else
                ans = Math.min(ans, 1 + minCount(n -square));
            //counts all possible variation of square adding to n for every loop // ans stores the min no. steps
        }
        return ans;

    }
}
