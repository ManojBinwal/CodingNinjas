package LinkedList;
import java.util.*;
import java.util.Scanner;

class Node<T>{
    T data;
    Node next;

    public Node(){

    }
    public Node(T data){
        this.data = data;
    }
}
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
        root = add(9, root);
        root = add(8, root);
        root = add(7,root);
        root = add(6, root);


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

        boolean isPal = isPalindrome(root);
        System.out.println(isPal);






/*                                                                                                          /
 *___________________________________________________________________________________________________________/
 *                                   MAIN METHOD ENDS                                                        /
 * ----------------------------------------------------------------------------------------------------------/
 */
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
        Node<Integer> smallOutput=printReverseRecursion(root);
    }

    public static Node<Integer> printReverseRecursion(Node<Integer> node)
    {
        if (node==null)
            return node;
        Node<Integer> smallOutput=printReverseRecursion(node.next);
        System.out.print(node.data+" ");
        return smallOutput;

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
