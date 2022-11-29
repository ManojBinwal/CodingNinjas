package RecursionAssignments;

public class StringToInteger {
    public static void main(String[] args) {
        String s = "1234";
        int num = covertStringToInt(s);
        System.out.println(num);
    }
    public static int covertStringToInt(String s){
        int i = Integer.valueOf(s);
        return i;
    }
}
