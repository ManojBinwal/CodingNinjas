package Stacks;

import java.util.LinkedList;

public class StackUsingLinkedList<T> {
    // data is the underlying linked list that stores the elements in the stack
    private LinkedList<T> data = new LinkedList<>();

    // Constructor to initialize an empty stack
    public StackUsingLinkedList() {}

    // Method to add an element to the top of the stack
    public void push(T data){
        // Add the element at the beginning of the linked list
        this.data.addFirst(data);
    }

    // Method to remove and return the element at the top of the stack
    public T pop(){
        // If the stack is empty, throw an exception
        if (data.isEmpty()) {
            throw new RuntimeException("Cannot remove data from empty stack");
        }

        // Remove and return the element at the beginning of the linked list
        return this.data.removeFirst();
    }

    // Method to return the element at the top of the stack without removing it
    public T top(){
        // If the stack is empty, return null
        if (data.isEmpty()) {
            return null;
        }

        // Return the element at the beginning of the linked list
        return this.data.getFirst();
    }

    // Method to return the number of elements in the stack
    public int size(){
        // Return the size of the linked list
        return this.data.size();
    }

    // Method to check if the stack is empty
    public boolean isEmpty(){
        // Return true if the stack is empty, false otherwise
        return data.isEmpty();
    }
}

class LLUse{
    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        int p = stack.pop();
        System.out.println(p);
       int top = stack.top();
        System.out.println(top);
       int size = stack.size();
        System.out.println(size);
      boolean isempty =  stack.isEmpty();
        System.out.println(isempty);
    }
}
