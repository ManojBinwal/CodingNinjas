package Recursion2;

/*
This is exact same logic as remove x, just compare two consecutive characters and return substring from 1 if they are
same else call the fn after adding char at zero to create new string.
 */
public class RemoveConsequitiveDuplicates {
    public static void main(String[] args) {
        String str ="Thiss iss a eexammplee";
        String newstr=removeConsecutiveDuplicates(str);
        System.out.println(newstr);
    }
    public static String removeConsecutiveDuplicates(String str){
        if(str.length()==1){ //if there is only one char then, there are no duplicates and therefore return that char
            return str;
        }
       return  ((str.charAt(1)==str.charAt(0)) ? "":str.charAt(0)) + removeConsecutiveDuplicates(str.substring(1));
    }
}
