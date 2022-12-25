package Stacks;

import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;

public class Stockspan {
    public static int[] stockSpan(int[] prices) {
        // Create a stack to store the indices of the prices
        Deque<Integer> stack = new ArrayDeque<>();
        // Create an array to store the stock spans of the prices
        int[] stockSpan = new int[prices.length];

        // The stock span of the first price is 1
        stockSpan[0] = 1;
        // Push the index of the first price onto the stack
        stack.offerFirst(0);

        // Loop through the rest of the prices
        for (int i = 1; i < prices.length; i++) {
            // Pop the indices of the prices from the stack until the top of the stack has a price that is less than or equal to the current price
            while (!stack.isEmpty() && prices[stack.peekFirst()] < prices[i]) {
                stack.pollFirst();
            }

            // If the stack is empty, the stock span of the current price is its index + 1
            if (stack.isEmpty()) {
                stockSpan[i] = i + 1;
            }
            // If the stack is not empty, the stock span of the current price is its index minus the index of the top element on the stack
            else {
                stockSpan[i] = i - stack.peekFirst();
            }

            // Push the index of the current price onto the stack
            stack.offerFirst(i);
        }

        // Return the array of stock spans
        return stockSpan;
    }
    public static void main(String[] args) {
        // Test case: prices of stock over a period of time
        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        // Calculate the stock spans of the prices
        int[] stockSpans = stockSpan(prices);

        // Print the stock spans
        System.out.println(Arrays.toString(stockSpans));
    }
}
