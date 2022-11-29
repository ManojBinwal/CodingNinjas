package RecursionAssignments;

public class PairStar {
    public static void main(String[] args) {
        String s = "aaa";
        String x = addStars(s);
        System.out.println(x);
    }
    public static String addStars(String x){
        if(x.length()==1){
            return x;
        }
        if(x.charAt(0)==x.charAt(1)){
        return  x.charAt(0)+ "*" + addStars(x.substring(1))  ;
        }
        else
            return x.charAt(0)+ addStars(x.substring(1));
    }
}
