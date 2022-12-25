package Queue;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList {
    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head; // remove from the head
    private Node tail; // add to the tail

    public boolean isEmpty() {
        return head == null;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public void add(int data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }
}
class QueueDriver{
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek()); // outputs 1
        System.out.println(queue.remove()); // outputs 1
        System.out.println(queue.remove()); // outputs 2
        System.out.println(queue.remove()); // outputs 3
    }
}