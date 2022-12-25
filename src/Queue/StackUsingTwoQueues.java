package Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class StackUsingTwoQueues {
    // Define the data members
    private Queue<Integer> queue1; // for storing elements
    private Queue<Integer> queue2; // for transferring elements

    public StackUsingTwoQueues() {
        // Initialize the data members
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // ----------------- Public Functions of Stack -----------------/

    public int size() {
        // Return the size of the stack
        return queue1.size();
    }

    public boolean isEmpty() {
        // Return true if the stack is empty, false otherwise
        return queue1.isEmpty();
    }

    public void push(int element) {
        // Add an element to the top of the stack
        queue1.add(element);
    }

    public int pop() {
        // Remove and return the element at the top of the stack
        if (queue1.isEmpty()) {
            throw new NoSuchElementException();
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int element = queue1.remove();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return element;
    }

    public int top() {
        // Return the element at the top of the stack
        if (queue1.isEmpty()) {
            throw new NoSuchElementException();
        }
        while (queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        int element = queue1.remove();
        queue2.add(element);
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return element;
    }


    public static void main(String[] args) {
        StackUsingTwoQueues stack = new StackUsingTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        System.out.println(stack.top()); // outputs 3
//        System.out.println(stack.pop()); // outputs 3
//        System.out.println(stack.pop()); // outputs 2
//        System.out.println(stack.pop()); // outputs 1

    }
}
