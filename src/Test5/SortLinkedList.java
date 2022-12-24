package Test5;

public class SortLinkedList {
    // Method to sort a linked list in ascending order
    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head) {
        // Return the head if the linked list has 0 or 1 node
        if (head == null || head.next == null) return head;

        // Iterate through the linked list and sort it using bubble sort
        for (int i = 0; i < lengthLL(head) - 1; i++) {
            // Initialize the previous, current and next nodes
            LinkedListNode<Integer> prev = null;
            LinkedListNode<Integer> curr = head;
            LinkedListNode<Integer> next = curr.next;

            // Iterate through the linked list
            while (curr.next != null) {
                // If the current node is greater than the next node,
                // swap them and update the previous, current and next nodes
                if (curr.data > curr.next.data) {
                    if (prev == null) {
                        curr.next = next.next;
                        next.next = curr;
                        prev = next;
                        head = prev;
                    } else {
                        next = curr.next;
                        curr.next = next.next;
                        prev.next = next;
                        next.next = curr;
                        prev = next;
                    }
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
        return head;
    }

    // Method to find the length of a linked list
    private static int lengthLL(LinkedListNode<Integer> head) {
        int count = 1;
        // Iterate through the linked list and count the number of nodes
        while (head.next != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // Create a linked list with values [5, 4, 3, 2, 1]
        LinkedListNode<Integer> head = new LinkedListNode<>(5);
        head.next = new LinkedListNode<>(4);
        head.next.next = new LinkedListNode<>(3);
        head.next.next.next = new LinkedListNode<>(2);
        head.next.next.next.next = new LinkedListNode<>(1);

        // Sort the linked list in ascending order
        head = sort(head);

        // Print the resulting linked list
        LinkedListNode<Integer> cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}
