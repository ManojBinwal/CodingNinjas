package Test6;
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
public class MoveToLast {
    public static Node<Integer> func(Node<Integer> head,int n) {
        // If the linked list is empty or has only one element, return the head
        if (head==null || head.next==null) return head;

        // Initialize pointers for the current node, previous node, and tail of the linked list
        Node<Integer> prev = null, curr = head, tail = head;

        // Find the tail of the linked list
        while (tail.next!=null) {
            tail = tail.next;
        }
        // Save the original tail
        Node<Integer> oldTail = tail;

        // Iterate through the linked list until we reach the original tail
        while (curr.next!=oldTail) {
            // If the current node has the value we are looking for, add a new node with the same value at the end of the linked list
            if (curr.data==n) {
                tail.next = new Node<>(n);
                tail = tail.next;
                // If the previous node is null, then the current node is the head, so update the head and move to the next node
                if (prev==null) {
                    curr = curr.next;
                    head = curr;
                    // Otherwise, skip the current node by updating the previous node's next pointer
                } else {
                    prev.next = prev.next.next;
                    curr = prev.next;
                }
            } else {
                // If the current node does not have the value we are looking for, move to the next node
                prev = curr;
                curr = curr.next;
            }
        }
        // Return the updated head of the linked list
        return head;
    }
    public static void main(String[] args) {
        // Create a linked list
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        head.next.next.next = new Node<>(4);
        head.next.next.next.next = new Node<>(5);

        // Call the func function to move all occurrences of 3 to the end of the linked list
        head = func(head, 3);

        // Print the updated linked list
        Node<Integer> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
