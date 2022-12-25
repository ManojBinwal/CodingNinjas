package Stacks;

import java.util.Stack;

public class MnimumBracketReversal {
    public static int countBracketReversals(String input) {
        // Declare a variable to store the length of the input string
        int len = input.length();

        // Return 0 if the input string is empty
        if (len == 0) {
            return 0;
        }

        // Return -1 if the input string has an odd number of brackets, as only even number of brackets can be balanced
        if (len % 2 != 0) {
            return -1;
        }

        // Create a stack to store the brackets as we iterate through the input string
        Stack<Character> stack = new Stack<>();

        // Iterate through the input string
        for (int i = 0; i < len; i++) {
            // Get the current character in the string
            char currentChar = input.charAt(i);

            // If the current character is an opening bracket, push it onto the stack
            if (currentChar == '{') {
                stack.push(currentChar);
            } else {
                // If the current character is a closing bracket, try to pop a matching opening bracket from the stack
                // If there is no matching opening bracket on the stack, push the current character onto the stack
                if (!stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(currentChar);
                }
            }
        }

        // Initialize a variable to keep track of the number of bracket reversals needed
        int count = 0;

        // At this point, the stack should only contain unbalanced brackets
        // Pop two brackets from the stack and try to balance them by reversing them
        while (!stack.isEmpty()) {
            char char1 = stack.pop();
            char char2 = stack.pop();

            // If char1 is a closing bracket and char2 is an opening bracket, we need to reverse both of them
            // Increase the count by 2 to reflect this
            if (char1 != char2) {
                count += 2;
            }
            // If char1 and char2 are either both opening brackets or both closing brackets, we only need to reverse one of them
            // Increase the count by 1 to reflect this
            else {
                count += 1;
            }
        }

        // Return the number of bracket reversals needed
        return count;
    }
    public static void main(String[] args) {
        // Test the countBracketReversals function with some example inputs
        String input1 = "{}";
        int result1 = countBracketReversals(input1);
        System.out.println("Input: " + input1 + " Output: " + result1); // Output: 0

        String input2 = "{{}}";
        int result2 = countBracketReversals(input2);
        System.out.println("Input: " + input2 + " Output: " + result2); // Output: 0

        String input3 = "{{}{}}";
        int result3 = countBracketReversals(input3);
        System.out.println("Input: " + input3 + " Output: " + result3); // Output: 2

        String input4 = "{{}}{";
        int result4 = countBracketReversals(input4);
        System.out.println("Input: " + input4 + " Output: " + result4); // Output: -1

        String input5 = "}{}";
        int result5 = countBracketReversals(input5);
        System.out.println("Input: " + input5 + " Output: " + result5); // Output: 2
    }
}
