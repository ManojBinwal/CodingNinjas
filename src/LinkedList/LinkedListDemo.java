package LinkedList;

import java.util.ArrayList;
import java.util.Scanner;
class Node<T>{
    T data;
    Node next;

    public Node() {}

    public Node(T data) {
        this.data = data;
    }
}
@SuppressWarnings("ALL")
public class LinkedListDemo {

/*                                                                                                           /
 *___________________________________________________________________________________________________________/
 *                                   MAIN METHOD BEGINS                                                      /
 * ----------------------------------------------------------------------------------------------------------/
 */

    public static void main(String[] args) {
        // Create a new Node object with a value of 6 and assign it to the root variable
        Node<Integer>root = new Node(6);

        // Add nodes with values 7, 8, and 9 to the end of the linked list

        root = add(7, root);
        root = add(8, root);
        root = add(9,root);
        root = add(10, root);

        Node<Integer>root1 = new Node<>(0);
        root1 = add(11, root1);
        root1 = add(12, root1);
        root1 = add(34, root1);
        root1 = add(121,root1);
        root1 = add(12, root1);
        root1 = add(13, root1);
        root1 = add(14, root1);



//        root = add(9, root);
//        root = add(8, root);
//        root = add(7,root);
//        root = add(6, root);


//        root = input(root);
//        root = inputLL(root);
//        Print the values of the nodes in the linked list
//
//        root = insert(root, 3, 10);
//        printIterative(root);
//
//        root=delete(root,5);
//        printIterative(root);
//
//        Print the size of the linked list
//        System.out.println(size(root));
//
//        // Print the value of the second element in the linked list
//        System.out.println(get(root, 2));

//        int index = getIndex(root,9);
//        System.out.println(index);

//        root=AppendLastNodeToFirst(root,0);
//        printIterative(root);

        //root = removeDuplicates(root);
//        boolean contains = contains(root,10);
//        System.out.println(contains);

//        Node<Integer>newRoot=removeDuplicates(root);
//        printIterative(newRoot);

//        Node<Integer> newRoot = reverseLinkedList(root);
//        printIterative(newRoot);

//        printReverseRecursive(root);

//        boolean isPal = isPalindrome(root);
//        System.out.println(isPal);

//        root = addRecursive(root,20);
//        printIterative(root);
//
//        root = deleteRecursive(root,5);
//        printIterative(root);
//
//        root= reverseLinkedListRecursive(root);
//        printIterative(root);
//        printIterative(root1);
//        Node<Integer> newNode =mergeSort(root1);
//        printIterative(newNode);

//        int index = findIndex(root1,13,0);
//        System.out.println(index);

//        root1 = evenAfterOdd(root1);
//        printIterative(root1);

//       Node<Integer>newNode=skipMdeleteN(root1,2,3);

//        printIterative(root1);
//        Node<Integer>newNode=swapNodes(root1,3,4);
//        printIterative(newNode);

//        Node<Integer>newNode = kReverse(root1,2);
        root1 = bubbleSort(root1);
        printIterative(root1);




/*                                                                                                          /
 *___________________________________________________________________________________________________________/
 *                                   MAIN METHOD ENDS                                                        /
 * ----------------------------------------------------------------------------------------------------------/
 */
    }
    public static Node<Integer> bubbleSort(Node<Integer> head) {
        // If the list is empty or has only one element, return the list
        if (head == null || head.next == null) {
            return head;
        }

        // Set up a flag to track whether the list was modified in the current pass
        boolean modified = true;

        // Loop until the list is sorted
        while (modified) {
            modified = false;
            Node<Integer> current = head;

            // Loop through the list and compare adjacent elements
            while (current.next != null) {
                // If the current element is greater than the next element, swap them
                if (current.data>(Integer) current.next.data) {
                    Integer temp = current.data;
                    current.data = (Integer) current.next.data;
                    current.next.data = temp;
                    modified = true;
                }
                current = current.next;
            }
        }

        return head;
    }


    // This function takes in a linked list and an integer k as input, and returns the linked list with the first k elements reversed
    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        // If k is 0 or 1, there is no need to reverse the linked list
        if (k == 0 || k == 1 ) {
            return head;
        }

        // Initialize the variables that will be used to reverse the linked list
        Node<Integer> current = head; // current is a pointer that will iterate through the linked list
        Node<Integer> fwd = null; // fwd is a pointer that will point to the next node in the linked list
        Node<Integer> prev = null; // prev is a pointer that will point to the previous node in the linked list
        int count = 0; // count will keep track of how many nodes have been reversed so far

        // Reverse the first k nodes of the linked list
        while (count < k && current != null) {
            // Save the next node in the linked list to fwd
            fwd = current.next;
            // Reverse the current node by pointing it to the previous node
            current.next = prev;
            // Update the pointers for the next iteration
            prev = current;
            current = fwd;
            // Increment the count
            count++;
        }

        // If there are more nodes in the linked list after the first k nodes, recursively reverse the remaining nodes in k-sized chunks
        if (fwd != null) {
            head.next = kReverse(fwd, k);
        }

        // Return the reversed linked list
        return prev;
    }

    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        // If the indices are the same, there is no need to swap. Return the original list.
        if(i == j) {
            return head;
        }
        // Initialize a currentNode variable to the head of the list and a prev variable to null
        Node<Integer> currentNode = head, prev = null;
        // Initialize variables to hold the two nodes to be swapped, and the nodes preceding them
       Node<Integer> firstNode = null, secondNode = null, firstNodePrev = null, secondNodePrev = null;
        // Initialize a counter to keep track of the current position in the list
        int pos = 0;
        // Iterate through the list
        while (currentNode != null) {
            // If the current position is equal to the first index, store the current node and its previous node
            if (pos == i) {
                firstNodePrev = prev;
                firstNode = currentNode;
            }
            // If the current position is equal to the second index, store the current node and its previous node
            else if (pos == j) {
                secondNodePrev = prev;
                secondNode = currentNode;
            }
            // Update the prev and currentNode variables for the next iteration
            prev = currentNode;
            currentNode = currentNode.next;
            // Increment the position counter
            pos += 1;
        }
        // If the first node has a preceding node, set its next value to the second node
        if (firstNodePrev != null) {
            firstNodePrev.next = secondNode;
        }
        // If the first node does not have a preceding node, it is the head of the list. Set the head to the second node
        else {
            head = secondNode;
        }
        // If the second node has a preceding node, set its next value to the first node
        if (secondNodePrev != null) {
            secondNodePrev.next = firstNode;
        }
        // If the second node does not have a preceding node, it is the head of the list. Set the head to the first node
        else {
            head = firstNode;
        }
        // Store the next value of the second node before updating it
       Node<Integer> currentfirstNode = secondNode.next;
        // Set the next value of the second node to the next value of the first node
        secondNode.next = firstNode.next;
        // Set the next value of the first node to the stored next value of the second node
        firstNode.next = currentfirstNode;
        // Return the modified list
        return head;
    }
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        // Return null if the linked list is empty or M is 0
        if (head == null || M == 0) {
            return null;
        }

        // Return the original linked list if N is 0
        if (N == 0) {
            return head;
        }

        // Initialize a variable to keep track of the current node
        Node<Integer> currentNode = head;

        // Iterate through the linked list
        while (currentNode != null) {
            // Skip M nodes
            for (int count = 1; count < M && currentNode != null; count++) {
                currentNode = currentNode.next;
            }

            // If we have reached the end of the linked list, return the modified list
            if (currentNode == null) {
                return head;
            }

            // Initialize a variable to store the node after the Nth node to be deleted
            Node<Integer> nextNode = currentNode.next;

            // Delete N nodes
            for (int count = 1; count <= N && nextNode != null; count++) {
                nextNode = nextNode.next;
            }

            // Set the current node's next pointer to the node after the deleted nodes
            currentNode.next = nextNode;

            // Set the current node to the node after the deleted nodes
            currentNode = nextNode;
        }

        // Return the modified linked list
        return head;
    }
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        // Create variables for the head and tail of even and odd linked lists
        Node<Integer> evenHead = null;
        Node<Integer> evenTail = null;
        Node<Integer> oddHead = null;
        Node<Integer> oddTail = null;

        // Iterate through the original linked list
        while (head != null) {
            // If the current node is even
            if (head.data % 2 == 0) {
                // If the even linked list is empty, set the head and tail to the current node
                if (evenHead == null && evenTail == null) {
                    evenHead = head;
                    evenTail = head;
                }
                // Otherwise, add the current node to the end of the even linked list
                else {
                    evenTail.next = head;
                    evenTail = head;
                }
                // Move to the next node
                head = head.next;
            }
            // If the current node is odd
            else {
                // If the odd linked list is empty, set the head and tail to the current node
                if (oddHead == null && oddTail == null) {
                    oddHead = head;
                    oddTail = head;
                }
                // Otherwise, add the current node to the end of the odd linked list
                else {
                    oddTail.next = head;
                    oddTail = head;
                }
                // Move to the next node
                head = head.next;
            }
        }

        // If the odd linked list is not empty, connect the tail to the head of the even linked list
        if (oddHead != null) {
            oddTail.next = evenHead;
        }
        // Otherwise, return the head of the even linked list
        else {
            return evenHead;
        }

        // If the even linked list is not empty, set the tail to null to end the linked list
        if (evenHead != null) {
            evenTail.next = null;
        }
        // Return the head of the odd linked list
        return oddHead;
    }

    public static int findIndex(Node<Integer> head, int n, int index) {
        // Base case: if the list is empty, return -1
        if (head == null) {
            return -1;
        }

        // If the current node's data is equal to n, return the index
        if (head.data == n) {
            return index;
        }

        // Recursively search the rest of the list
        return findIndex(head.next, n, index + 1);
    }
    public static Node<Integer> mergeSort(Node<Integer> head) {
        // Base case: if the list is empty or has only one element, return the list
        if (head == null || head.next == null) {
            return head;
        }

        // Split the list into two halves
        Node<Integer> middle = getMiddleNode(head);
        Node<Integer> right = middle.next;
        middle.next = null;

        // Recursively sort the two halves
        Node<Integer> left = mergeSort(head);
        right = mergeSort(right);

        // Merge the two sorted halves and return the merged list
        return mergeTwoSortedArrays(left, right);
    }

    private static Node<Integer> mergeTwoSortedArrays(Node<Integer> left, Node<Integer> right) {
        // Create a new node to store the merged list
        Node<Integer> newNode = new Node<Integer>(0);

        // Set up pointers for the current element in each list
        Node<Integer> current = newNode;
        Node<Integer> current1 = left;
        Node<Integer> current2 = right;

        // Loop through both lists while both have elements
        while (current1 != null && current2 != null) {
            // If the element in the first list is smaller or equal to the element in the second list, add it to the merged list
            if (current1.data <= current2.data) {
                current.next = current1;
                // Move to the next element in the first list
                current1 = current1.next;
            }
            // If the element in the second list is smaller, add it to the merged list
            else {
                current.next = current2;
                // Move to the next element in the second list
                current2 = current2.next;
            }
            current = current.next;
        }

        // Add the remaining elements from the first list, if any
        if (current1 != null) {
            current.next = current1;
        }
        // Add the remaining elements from the second list, if any
        else if (current2 != null) {
            current.next = current2;
        }

        // Return the merged list, starting from the second node (to skip the placeholder node)
        return newNode.next;
    }

    // Utility function to find the middle node in a linked list
    private static Node<Integer> getMiddleNode(Node<Integer> head) {
        if (head == null) {
            return head;
        }

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }



    private static Node<Integer> reverseLinkedListRecursive(Node<Integer> root) {
       if(root==null || root.next==null){
           return root;
       }
       Node<Integer> revL = reverseLinkedListRecursive(root.next);
       root.next.next=root;
       root.next= null;
       return revL;
    }


    private static Node<Integer> deleteRecursive(Node<Integer> root, int pos) {
        // If the root node is null, return null
        if(root==null){
            return root;
        }

        // If the position to be deleted is 0, return the next node in the list
        if(pos==0){
            return root.next;
        }

        // Remove the node at the specified position by calling the function recursively with the next node and the position decremented by 1
        root.next=deleteRecursive(root.next,pos-1);

        // Return the root node
        return root;
    }

    private static Node<Integer> addRecursive(Node<Integer> root, int data) {
        // If the root node is null, create a new node and return it
        if (root == null) {
            return new Node<Integer>(data);
        }

        // Add a new node to the end of the list by calling the function recursively with the next node
        root.next = addRecursive(root.next, data);

        // Return the root node
        return root;
    }
    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here

        Node<Integer> node=head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (node!=null)
        {
            arr.add(node.data);
            node=node.next;
        }
        int start=0, end=arr.size()-1;
        while(start<end)
        {
            if (arr.get(start)!=arr.get(end))
            {
                return false;
            }
            else
            {
                start=start+1;
                end=end-1;
            }
        }

        return true;
    }

    public static void printReverseRecursive(Node<Integer> root) {
        //Your code goes here
      if(root==null){
          return;
      }
      printReverseRecursive(root.next);
        System.out.print(root.data+ " ");
    }


    private static Node<Integer> reverseLinkedList(Node<Integer> root) {
        if(root==null){
            return root;
        }
        ArrayList<Integer>temp = new ArrayList();
        temp.add(root.data);
        Node<Integer> current = root;
        while(current.next!=null){
            current=current.next;
            temp.add(current.data);

        }
//        System.out.println(temp);
        Node<Integer> newNode = new Node(temp.get(temp.size()-1));
        int n = temp.size()-2;
        while(n>=0){
            newNode = add(temp.get(n),newNode);
            n--;
        }
        return newNode;

    }

    private static boolean contains(Node<Integer> root,int n) {
        // Check if root is null
        if(root==null){
            // If so, return false to indicate that the element was not found
            return false;
        }
        // Check if the data in the root node is the element we are searching for
        if(root.data==n){
            // If so, return true if element is found
            return true;
        }
        else{
            // Initialize a counter to 1
            int count = 1;
            // Initialize a current node to root
            Node<Integer> current = root;
            // Iterate through the list until the end is reached or the element is found
            while(current.next!=null){
                current = current.next;
                // Check if the current element is the one we are searching for
                if(current.data==n){
                    // If so, return true
                    return true;
                }
                // Increment the counter
                count++;
            }
        }
        // If the element was not found, return false
        return false;
    }

    private static Node<Integer> removeDuplicates(Node<Integer> root) {
        if(root==null || root.next == null){
            return root;
        }
        Node<Integer> newRoot = new Node(root.data);
        while(root.next!=null){

            root=root.next;
            if(!contains(newRoot, root.data)){
                newRoot=add(root.data,newRoot);
            }
        }

        return newRoot;
    }

    private static Node<Integer> AppendLastNodeToFirst(Node<Integer> root,int pos) {
        // Return the root node if pos is 0 or greater than or equal to the size of the linked list
        if(pos==0||pos>=size(root)){
            return root;
        }

        // Initialize variables to traverse the linked list and find the node to be moved
        int size = size(root);
        Node<Integer>current = root;
        int i=0;
        // Traverse the linked list to the node before the node to be moved
        while(i<size-pos-1){
            current = current.next;
            i++;
        }
        // Save a reference to the node to be moved
        Node<Integer> temp = current.next;
        // Set the next node of the current node to null, effectively removing the node to be moved from the linked list
        current.next=null;
        // Set the new root of the linked list to be the node that was removed
        Node<Integer>newRoot=temp;
        // Set the current node to the new root of the linked list
        current =temp;
        // Traverse the linked list to the last node
        while(current.next!=null){
            current=current.next;
        }
        // Append the original root node to the end of the linked list
        current.next=root;
        // Return the new root of the linked list
        return newRoot;
    }


    //method to get the index of specific element in the linkedlist
    private static int getIndex(Node<Integer> root, int n) {
        // Check if root is null
        if(root==null){
            // If so, return -1 to indicate that the element was not found
            return -1;
        }
        // Check if the data in the root node is the element we are searching for
        if(root.data==n){
            // If so, return 0 as the index
            return 0;
        }
        else{
            // Initialize a counter to 1
            int count = 1;
            // Initialize a current node to root
            Node<Integer> current = root;
            // Iterate through the list until the end is reached or the element is found
            while(current.next!=null){
                current = current.next;
                // Check if the current element is the one we are searching for
                if(current.data==n){
                    // If so, return the index
                    return count;
                }
                // Increment the counter
                count++;
            }
        }
        // If the element was not found, return -1
        return -1;
    }

    private static Node<Integer> delete(Node<Integer> root, int pos) {
        // Check if root is null
        if(root==null){
            return null;
        }
        // Check if the position to delete is the first element
        if(pos==0){
            // If so, update root to be the next element in the list
            root = root.next;
        }
        // Check if the position to delete is outside the range of the list
        else if(pos>=size(root)){
            // If so, return the original list without making any changes
            return root;
        }
        else {
            // Initialize a current node to root
            Node<Integer> current = root;
            // Initialize a counter to 0
            int i = 0;
            // Iterate through the list until the element before the one to be deleted is found
            while (i < pos - 1) {
                current = current.next;
                i++;
            }
            // Update the next element of the current node to skip over the element to be deleted
            current.next = current.next.next;
        }
        // Return the updated list
        return root;
    }

    private static Node<Integer> insert(Node<Integer> root, int pos, int data) {
        // Create a new node with the given data
        Node<Integer> newNode = new Node(data);

        // If the root is null, make the new node the root
        if (root == null) {
            root = newNode;
            return root;
        }

        // Set up a reference to the current node
        Node<Integer> current = root;

        // If the position is at the end of the list, iterate to the last element and append the new node
        if (pos == size(root)) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        // If the position is the first element, insert the new node at the beginning of the list
        else if (pos == 1) {
            Node<Integer> temp = root;
            root = newNode;
            root.next = temp;
        }
        // Otherwise, iterate to the desired position and insert the new node
        else {
            int i = 1;
            while (i < pos) {
                current = current.next;
                i++;
            }
            Node<Integer> temp = current.next;
            current.next = newNode;
            current.next.next = temp;
        }

        return root;
    }



    //Method to take input until user input -1 to stop
    private static Node<Integer> input(Node<Integer> root) {

        System.out.println("Enter -1 to end input");
        //take first input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        int data = sc.nextInt();
        //keep loop going until user inputs -1;
        while(data!=-1){
            //create new node with data entered
            Node newNode = new Node(data);
            //if root is make newNode root
            if(root==null){
                root=newNode;
            }
            //create a temp variable to iterate through the list // it will have the same reference as root therefore any change made will reflect in the root
            Node current = root;
            //iterate till the last node as node.next will be null for last node
            while(current.next!=null){
                current=current.next;
            }
            //link last node to the new node
            current.next=newNode;
            //take new input
            System.out.println("Enter element");
            data=sc.nextInt();
        }
        return root;
    }
    private static Node<Integer> inputLL(Node<Integer> root) {
        Node<Integer> last = null;
        Node current = root;
        //iterate till the last node as node.next will be null for last node
        while(current.next!=null){
            current=current.next;
        }
        last = current;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element (-1 to end input):");
        int data = sc.nextInt();

        while (data != -1) {
           Node<Integer> newNode = new Node(data);
            if (root == null) {
                root = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }

            System.out.println("Enter element (-1 to end input):");
            data = sc.nextInt();
        }

        return root;
    }


    // Method that returns the value of the ith element in a linked list
    private static int get(Node<Integer> root, int i) {
        // Return -1 if root is null or i is less than 1
        if (root == null || i < 1) {
            return -1;
        }
        // Initialize a counter to 1
        int count = 1;
        // Traverse the linked list until the ith element is found or the end of the list is reached
        while (count < i && root != null) {
            root = root.next;
            count++;
        }
        // Return -1 if the ith element is not found
        if (root == null) {
            return -1;
        }
        // Return the value of the ith element
        return root.data;
    }

    // Method that returns the size of a linked list
    private static int size(Node<Integer> root) {
        // Return 0 if the linked list is empty
        if (root == null) {
            return 0;
        }
        // Initialize a counter to 0
        int count = 0;
        // Traverse the linked list, incrementing the counter for each element
        while (root != null) {
            count++;
            root = root.next;
        }
        // Return the size of the linked list
        return count;
    }

    // Method that increments the value of each element in a linked list
    private static void Increment(Node<Integer> root) {
        // Return if the linked list is empty
        if (root == null) {
            return;
        }
        // Traverse the linked list, incrementing the value of each element
        while (root != null) {
            root.data += 1;
            root = root.next;
        }

    }

    // Method that prints the values of the nodes in a linked list iteratively
    private static void printIterative(Node<Integer> root) {
        // Return if the linked list is empty
        if (root == null) {
            return;
        }
        // Traverse the linked list, printing the value of each element
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.next;
        }
        //print empty line
        System.out.println();
    }

    public static Node<Integer> add(int data, Node root) {
        // Create a new Node object with the given data
        Node<Integer> newNode = new Node(data);
        // If the linked list is empty, return the new Node object
        if (root == null) {
            return newNode;
        }
        // Traverse the linked list to the last element
        Node current = root;
        while (current.next != null) {
            current = current.next;
        }
        // Add the new Node object to the end of the linked list
        current.next = newNode;
        // Return the root of the linked list
        return root;
    }

    public static void print(Node root) {
        // Return if the linked list is empty
        if (root == null) {
            return;
        }
        // Print the value of the current element
        System.out.print(root.data + " ");
        // Recursively print the values of the remaining elements in the linked list
        print(root.next);
    }
}
