package Recursion2;

public class RemoveConsequitiveDuplicates {
    public static void main(String[] args) {
        String str ="Thiss iss a eexammplee";
        String newstr=removeConsecutiveDuplicates(str);
        System.out.println(newstr);
    }
    public static String removeConsecutiveDuplicates(String str){
        if(str.length()==1){
            return str;
        }
        if(str.charAt(1)==str.charAt(0)){
            return removeConsecutiveDuplicates(str.substring(1));
        }
        else
            return str.charAt(0)+ removeConsecutiveDuplicates(str.substring(1));
    }
}
