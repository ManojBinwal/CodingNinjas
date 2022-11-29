package RecursionAssignments;

public class GeometricSum {
    public static void main(String[] args) {
        int k =6;
        double s = geometricSum(k);
        System.out.printf("%.5f",s);
    }
    public static double geometricSum(int k){
        if(k==0){   //it is the last case which is 1/1 = 1
            return 1;
        }
        return 1.0/Math.pow(2,k) + geometricSum(k-1);
        //k is the count of terms of geometric progression.
    }
}
