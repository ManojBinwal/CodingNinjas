package RecursionAssignments;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "ratcecar";
        boolean ispal = checkPalindrome(s);
        System.out.println(ispal);
    }
    public static boolean checkPalindrome(String s){
        if(s.length()<=1){  //till the middle index
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)) {  //if begin and end are same then it is palindrome
            return checkPalindrome(s.substring(1, s.length() - 1)); //begin+1 and end -1
        }
        else
            return false; //if begin and end are not same then return false.
    }
}
