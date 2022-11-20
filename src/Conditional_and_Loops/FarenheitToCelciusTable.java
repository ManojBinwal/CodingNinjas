/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
Input Format :

3 integers - S, E and W respectively

Output Format :

Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form. The Fahrenheit value and its corresponding Celsius value should be separate by single space.

Constraints :

0 <= S <= 90
S <= E <=  900
0 <= W <= 80

*/
package Conditional_and_Loops;

import java.util.Scanner;

public class FarenheitToCelciusTable {
    public static void table(int S, int E, int W) {
        for (int i=S; i<=E; i+=W) {
            int far = (int)(5* (i-32) / 9);
            System.out.println(i + " " + far);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        table(S, E, W);
        sc.close();

    }
}
