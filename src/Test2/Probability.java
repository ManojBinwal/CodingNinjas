//public class Solution {
//
//    public static int probability(int n,int x){
//
//        double Ns,Ne1,Ne2;
//        int Pe;
//        Ns=factorial(8.0)/(factorial(n*1.0)*factorial(8.0-n));
//        Ne1=factorial(4.0)/(factorial(x*1.0)*factorial(4.0-x));
//        Ne2=factorial(4.0)/(factorial(((n-x)*1.0))*factorial((4.0-(n-x))));
//        Pe=(int)(((Ne1*Ne2)/Ns)*100);
//        return Pe;
//
//        /* Your class should be named Solution
//         * Don't write main().
//         * Don't read input, it is passed as function argument.
//         * Return output and don't print it.
//         * Taking input and printing output is handled automatically.
//         */
//
//    }
//
//    public static double factorial(double num){
//        int fact=1;
//        for(int i=2;i<=num;i++){
//            fact*=i;
//        }
//        return fact;
//    }
//
//
//}
