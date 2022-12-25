package Stacks;

import java.util.Stack;

public class BracketBalanced {
    public static boolean isBalanced(String expression) {
        // Create a stack to store the opening brackets
        Stack<Character> stack = new Stack<Character>();

        // Iterate through each character in the expression
        for (int j = 0; j < expression.length(); j++) {
            char i = expression.charAt(j);
            // If the character is an opening bracket, push it onto the stack
            if (i == '[' || i == '{' || i == '(') {
                stack.push(i);
            }
            // If the character is a closing bracket, check if it is balanced
            else if (i == ']' || i == '}' || i == ')') {
                // If the stack is empty, the expression is not balanced
                if (stack.isEmpty()) {
                    return false;
                }
                // If the character is a closing square bracket, check if the last opening bracket was a square bracket
                else if (i == ']') {
                    if (stack.peek() != '[') {
                        return false;
                    }
                    // If the brackets are balanced, pop the opening bracket off the stack
                    else {
                        stack.pop();
                    }
                }
                // If the character is a closing curly brace, check if the last opening bracket was a curly brace
                else if (i == '}') {
                    if (stack.peek() != '{') {
                        return false;
                    }
                    // If the brackets are balanced, pop the opening bracket off the stack
                    else {
                        stack.pop();
                    }
                }
                // If the character is a closing parentheses, check if the last opening bracket was a parentheses
                else if (i == ')') {
                    if (stack.peek() != '(') {
                        return false;
                    }
                    // If the brackets are balanced, pop the opening bracket off the stack
                    else {
                        stack.pop();
                    }
                }
            }
        }

        // If the stack is empty, all the brackets are balanced
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // Test cases for the isBalanced method
        String[] testCases = {
                "[]", "{}", "()", "[{()}]", "([{}])", "{[()]}", "{[(])}", "{{[[(())]]}}", "", "()[]{}", "([{}])[{}]", "([{}])[{}]{}"
        };

        // Expected output for the test cases
        boolean[] expectedOutput = {
                true, true, true, true, true, true, false, true, true, true, true, true
        };

        // Loop through the test cases and check if the isBalanced method produces the expected output
        for (int i = 0; i < testCases.length; i++) {
            boolean result = isBalanced(testCases[i]);
            System.out.println(testCases[i] + ": " + result + " (Expected output: " + expectedOutput[i] + ")");
        }
    }
}
