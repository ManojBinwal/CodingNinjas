package Test5;
class LinkedListNode<T> {
    // Data stored in the node
    T data;
    // Pointer to the next node
    LinkedListNode<T> next;

    // Constructor to initialize the node with given data
    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class NextNumber {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        // Initialize the last non-9 node to null
        LinkedListNode<Integer> last = null;
        // Initialize the current node to the head
        LinkedListNode<Integer> cur = head;

        // Iterate till the last node
        while (cur.next != null) {
            // If the current node is not 9, set the last non-9 node to it
            if (cur.data != 9) {
                last = cur;
            }
            // Move to the next node
            cur = cur.next;
        }

        // If the last node is not equal to 9
        // add 1 to it and return the head
        if (cur.data != 9) {
            cur.data++;
            return head;
        }

        // If list is of the type 9 . 9 . 9 ...
        if (last == null) {
            // Create a new node with value 0 and set it as the head
            last = new LinkedListNode<>(0);
            last.next = head;
            head = last;
        }

        // For cases when the rightmost node which
        // is not equal to 9 is not the last
        // node in the linked list
        last.data++;
        last = last.next;

        // Set all the nodes after the last non-9 node to 0
        while (last != null) {
            last.data = 0;
            last = last.next;
        }
        return head;
    }

    // Main function
    public static void main(String[] args) {
        // Create a linked list with values [9, 9, 9]
        LinkedListNode<Integer> head = new LinkedListNode<>(9);
        head.next = new LinkedListNode<>(9);
        head.next.next = new LinkedListNode<>(9);

        // Find the next large number with the same number of digits
        head = nextLargeNumber(head);

        // Print the resulting linked list
        LinkedListNode<Integer> cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
