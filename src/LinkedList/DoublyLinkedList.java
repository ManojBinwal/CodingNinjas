package LinkedList;

import java.util.NoSuchElementException;

class DoublyLinkedList {
    private static class Node {
        // element stored in this node
        private int element;
        // reference to the previous node in the list
        private Node prev;
        // reference to the next node in the list
        private Node next;

        // constructor for creating a new node with element, prev, and next references
        public Node(int element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    // reference to the head (first) node in the list
    private Node head;
    // reference to the tail (last) node in the list
    private Node tail;
    // number of elements in the list
    private int size;

    // constructor for creating an empty list
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // returns the number of elements in the list
    public int size() {
        return size;
    }

    // returns true if the list is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // adds an element to the beginning of the list
    public void addFirst(int element) {
        // create a new node with element as the element, null as the prev reference,
        // and head as the next reference
        Node newNode = new Node(element, null, head);
        if (head != null) {
            // set the prev reference of the current head node to the new node
            head.prev = newNode;
        }
        // set the head reference to the new node
        head = newNode;
        if (tail == null) {
            // if the list was empty, set the tail reference to the new node as well
            tail = newNode;
        }
        // increment the size of the list
        size++;
    }

    // adds an element to the end of the list
    public void addLast(int element) {
        // create a new node with element as the element, tail as the prev reference,
        // and null as the next reference
        Node newNode = new Node(element, tail, null);
        if (tail != null) {
            // set the next reference of the current tail node to the new node
            tail.next = newNode;
        }
        // set the tail reference to the new node
        tail = newNode;
        if (head == null) {
            // if the list was empty, set the head reference to the new node as well
            head = newNode;
        }
        // increment the size of the list
        size++;
    }
    public int removeFirst() {
        if (isEmpty()) {
            // throw an exception if the list is empty
            throw new NoSuchElementException();
        }
        // store the element of the head node in a local variable
        int element = head.element;
        // set the head reference to the next node
        head = head.next;
        if (head == null) {
            // if the list is now empty, set the tail reference to null as well
            tail = null;
        } else {
            // set the prev reference of the new head node to null
            head.prev = null;
        }
        // decrement the size of the list
        size--;
        // return the element of the removed node
        return element;
    }

    public int removeLast() {
        if (isEmpty()) {
            // throw an exception if the list is empty
            throw new NoSuchElementException();
        }
        // store the element of the tail node in a local variable
        int element = tail.element;
        // set the tail reference to the previous node
        tail = tail.prev;
        if (tail == null) {
            // if the list is now empty, set the head reference to null as well
            head = null;
        } else {
            // set the next reference of the new tail node to null
            tail.next = null;
        }
        // decrement the size of the list
        size--;
        // return the element of the removed node
        return element;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.element);
            sb.append(" ");
            current = current.next;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // add some elements to the list
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        list.addLast(50);

        // print the list
        System.out.println(list);

        // remove an element from the beginning of the list
        int removed = list.removeFirst();
        System.out.println("Removed element: " + removed);

        // remove an element from the end of the list
        removed = list.removeLast();
        System.out.println("Removed element: " + removed);

        // print the list again
        System.out.println(list);
    }
}