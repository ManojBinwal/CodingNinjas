package LinkedList;

public class AddWithoutOperator  {

    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b; // Sum without carrying
        int carry = (a & b) << 1; // Carry, but don't add it yet
        return add(sum, carry); // Add sum and carry using recursion
    }
    /*
    This function works by first XORing the two numbers a and b to get the sum without carrying.
    It then calculates the carry by ANDing a and b and shifting the result left by one bit.
    Finally, it calls itself recursively with the sum and carry as the arguments, until the carry is zero.
    At that point, the function returns the sum.

    You can use this function to add two numbers by calling add(a, b), where a and b are the numbers you want to add. For example:
     */

    public static void main(String[] args) {
       int c = add(100, 256);
        System.out.println(c);
    }
}
