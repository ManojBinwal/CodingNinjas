package Test5;

public class ReplaceDuplicateValues {
    //use of dynamic programming concepts
    // Method to change the values of a linked list such that no two nodes have the same value
    public static void changeLL(LinkedListNode<Integer> head) {
        // Find the maximum value in the linked list
        int max = 0;
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }

        // Create a boolean array to keep track of which values have been encountered
        boolean done[] = new boolean[max + 1];
        for (int i = 0; i <= max; i++) {
            done[i] = false;
        }

        // Iterate through the linked list and change the values of the nodes
        temp = head;
        while (temp != null) {
            // If the current value has already been encountered, set the value to max + 1
            if (done[temp.data]) {
                temp.data = max + 1;
                max++;
            } else {
                // Mark the current value as encountered
                done[temp.data] = true;
            }
            temp = temp.next;
        }
    }

    // Main function
    public static void main(String[] args) {
        // Create a linked list with values [5, 5, 2, 2, 1]
        LinkedListNode<Integer> head = new LinkedListNode<>(5);
        head.next = new LinkedListNode<>(5);
        head.next.next = new LinkedListNode<>(2);
        head.next.next.next = new LinkedListNode<>(2);
        head.next.next.next.next = new LinkedListNode<>(1);

        // Change the values of the linked list such that no two nodes have the same value
        changeLL(head);

        // Print the resulting linked list
        LinkedListNode<Integer> cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
