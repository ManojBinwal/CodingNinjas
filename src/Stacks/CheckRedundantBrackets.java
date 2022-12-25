package Stacks;

import java.util.Stack;

public class CheckRedundantBrackets {
    private static boolean find(char ch) {
        // Check if the character is an operator
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }
        return false;
    }

    public static boolean checkRedundantBrackets(String expression) {
        // Create a stack to store the characters in the expression
        Stack<Character> stk = new Stack<>();

        // Iterate through each character in the expression
        for (int i = 0; i < expression.length(); ++i) {
            // If the character is an opening bracket or an operator, push it onto the stack
            if (expression.charAt(i) == '(' || find(expression.charAt(i))) {
                stk.push(expression.charAt(i));
            }
            // If the character is a closing bracket, check if it is redundant
            else if (expression.charAt(i) == ')') {
                // Flag to check if the brackets contain an operator
                boolean hasOperator = false;
                // Pop elements from the stack until an opening bracket is found
                while (!stk.isEmpty() && stk.peek() != '(') {
                    stk.pop();
                    hasOperator = true;
                }
                // If there are no operators in the brackets, they are redundant
                if (!hasOperator) {
                    return true;
                }
                // If there is an opening bracket, pop it from the stack
                if (!stk.isEmpty()) {
                    stk.pop();
                }
            }
        }

        // If all the brackets are balanced, return false
        return false;
    }
    public static void main(String[] args) {
        // Test cases for the checkRedundantBrackets method
        String[] testCases = {
                "((a+b))", "(a+b)", "((a+b))+c", "a+(b+c)", "a+((b+c))", "a+(b+c))", "(a+(b+c))", "(a+(b+c)", "(a+b))", "((a+b)"
        };

        // Expected output for the test cases
        boolean[] expectedOutput = {
                true, false, false, false, false, true, true, true, true, true
        };

        // Loop through the test cases and check if the checkRedundantBrackets method produces the expected output
        for (int i = 0; i < testCases.length; i++) {
            boolean result = checkRedundantBrackets(testCases[i]);
            System.out.println(testCases[i] + ": " + result + " (Expected output: " + expectedOutput[i] + ")");
        }
    }
}
