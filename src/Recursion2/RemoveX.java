package Recursion2;

public class RemoveX {
    public static void main(String[] args) {
        String str = "this is an xx example xx of removing xxX";
        String newStr=removeX(str);
        System.out.println(newStr);
    }
    public static String removeX(String str) {
        if(str.length()==0){ //if string length becomes zero means there are no x
            return str;
        }
        if(str.charAt(0)=='x'){
            return removeX(str.substring(1)); //returns string from index 1 to end of string
            //in effect this removes x from beginning of the string
        }
        else
            return str.charAt(0)+removeX(str.substring(1));  //traverse through the string


    }
}
