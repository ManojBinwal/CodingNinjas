/* Find Character Case
Send Feedback
Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet */

package Conditional_and_Loops;
import java.util.Scanner;
public class CharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str.toLowerCase();
        char ch = str.charAt(0);

        if (ch >= 65 && ch <= 90) {
            System.out.print("1");
        } else if (ch >= 97 && ch <= 122) {
            System.out.print("0");
        } else {
            System.out.print("-1");
        }
    }
}
