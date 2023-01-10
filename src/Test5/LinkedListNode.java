package Test5;

public class LinkedListNode<T> {
    // Data stored in the node
    public T data;
    // Pointer to the next node
    public LinkedListNode<T> next;

    // Constructor to initialize the node with given data
    public LinkedListNode(T data) {
        this.data = data;
    }
}
