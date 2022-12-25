package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> input) {
        // Base case: if the input queue is empty, return it
        if (input.size() == 0) {
            return input;
        }

        // Remove the first element from the queue
        int element = input.peek();
        input.poll();

        // Reverse the remaining elements in the queue
        reverseKElements(input);

        // Add the first element back to the end of the queue
        input.add(element);
        return input;
    }

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        // Create a new queue to store the reversed elements
        Queue<Integer> queue = new LinkedList<>();

        // Remove the first k elements from the input queue and add them to the new queue
        for (int i = 0; i < k; i++) {
            queue.add(input.poll());
        }

        // Reverse the elements in the new queue
        reverseKElements(queue);

        // Add the remaining elements from the input queue to the end of the new queue
        while (input.size() != 0) {
            queue.add(input.poll());
        }

        // Return the new queue
        return queue;
    }
    public static void main(String[] args) {
        // Create a queue with the elements [1, 2, 3, 4, 5]
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Reverse the first 3 elements in the queue
        queue = reverseKElements(queue, 3);

        // Print the reversed queue
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        // Output: 3 2 1 4 5
    }
}
