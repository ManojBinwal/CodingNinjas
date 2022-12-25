package Stacks;

public class StackUsingArray<T>  {
    // data is the underlying array that stores the elements in the stack
    private T[] data;

    // top is the index of the element at the top of the stack
    private int top;

    // Constructor to initialize an empty stack with a fixed size
    public StackUsingArray(int size) {
        // Initialize the array to store the elements
        data = (T[]) new Object[size];

        // Set the top index to -1 to indicate that the stack is empty
        top = -1;
    }

    // Method to add an element to the top of the stack
    public void push(T element) {
        // If the stack is full, throw an exception
        if (top == data.length - 1) {
            throw new RuntimeException("Stack is full");
        }

        // Increment the top index and add the element at that index
        top++;
        data[top] = element;
    }

    // Method to remove and return the element at the top of the stack
    public T pop() {
        // If the stack is empty, throw an exception
        if (top == -1) {
            throw new RuntimeException("Cannot pop from empty stack");
        }

        // Get the element at the top of the stack
        T element = data[top];

        // Set the element at the top of the stack to null and decrement the top index
        data[top] = null;
        top--;

        // Return the element that was removed
        return element;
    }

    // Method to return the element at the top of the stack without removing it
    public T top() {
        // If the stack is empty, return null
        if (top == -1) {
            return null;
        }

        // Return the element at the top of the stack
        return data[top];
    }

    // Method to return the number of elements in the stack
    public int size() {
        // Return the number of elements in the stack
        return top + 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        // Return true if the stack is empty, false otherwise
        return top == -1;
    }
}

class StackUse {
    public static void main(String[] args) {
        StackUsingArray<Integer> stack = new StackUsingArray<>(7);
        stack.push(6);
        stack.push(5);
        stack.push(10);
        System.out.println(stack.top());
        stack.pop();
        int size = stack.size();
        System.out.println(size);
        System.out.println(stack.isEmpty());
    }
}

