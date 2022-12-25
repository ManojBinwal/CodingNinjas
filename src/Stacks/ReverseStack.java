package Stacks;

import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        // If the input stack is empty or has only one element, there is nothing to reverse
        if (input.size() == 0 || input.size() == 1) {
            return;
        }

        // Pop the top element from the input stack
        int top = input.pop();

        // Reverse the rest of the elements in the input stack using recursion
        reverseStack(input, extra);

        // Transfer all the elements from the input stack to the extra stack, except for the top element
        while (!input.isEmpty()) {
            extra.push(input.pop());
        }

        // Push the top element back onto the input stack
        input.push(top);

        // Transfer all the elements from the extra stack back to the input stack
        while (!extra.isEmpty()) {
            input.push(extra.pop());
        }
    }
    public static void main(String[] args) {
        // Create a stack and push some elements onto it
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Print the stack before reversing it
        System.out.println("Before reversing: " + stack);

        // Reverse the stack
        reverseStack(stack, new Stack<>());

        // Print the stack after reversing it
        System.out.println("After reversing: " + stack);
    }
}
