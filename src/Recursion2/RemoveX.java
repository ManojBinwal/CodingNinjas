package Recursion2;
/*
if str.charAt(anyIndex)==X then return substring by calling function from substring 1 after adding nothing..
this will remove x which is the char at 0
else add the charAt(0) and call the function from substring 1
this will return the complete string without removing anything but create a separate string of character which are checked.
 */
public class RemoveX {
    public static void main(String[] args) {
        String str = "this is an xx eXample xx of removing xxX";
        String newStr=removeX(str);
        System.out.println(newStr);
    }
    public static String removeX(String str) {
        if(str.length()==0){ //if string length becomes zero means there are no x
            return str;
        }
        return ((str.charAt(0) == 'x') ? "":str.charAt(0)) + removeX(str.substring(1));  //traverse through the string
    }
}
