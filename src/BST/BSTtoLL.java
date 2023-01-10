package BST;

import BinaryTrees.BinaryTreeNode;
import Test5.LinkedListNode;

import java.util.ArrayList;

public class BSTtoLL {
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        // Create an empty ArrayList to store the elements in an in-order traversal of the binary tree
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Construct an in-order traversal of the binary tree and add the visited nodes to the ArrayList
        convertTreeToList(root, arrayList);

        // Create a new LinkedListNode object with a placeholder value
        LinkedListNode<Integer> node = new LinkedListNode<>(-1);

        // Construct a linked list from the elements in the ArrayList
        constructLinkedList(node, arrayList);

        // Return the next field of the LinkedListNode object, which is the first actual element in the linked list
        return node.next;
    }

    private static void constructLinkedList(LinkedListNode<Integer> node, ArrayList<Integer> arrayList) {
        // Iterate through the elements in the ArrayList
        for (Integer integer : arrayList) {
            // Create a new LinkedListNode object with the current element as its value
            node.next = new LinkedListNode<>(integer);
            // Advance the node pointer to the new LinkedListNode object
            node = node.next;
        }
    }

    private static void convertTreeToList(BinaryTreeNode<Integer> root, ArrayList<Integer> arrayList) {
        // Base case: return if the current node is null
        if (root == null) return;

        // Recursively visit the left subtree
        convertTreeToList(root.left, arrayList);

        // Add the current node to the ArrayList
        arrayList.add(root.data);

        // Recursively visit the right subtree
        convertTreeToList(root.right, arrayList);
    }
    public static void main(String[] args) {
        // Create a binary tree
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        root.left = new BinaryTreeNode<>(5);
        root.right = new BinaryTreeNode<>(12);
        root.left.left = new BinaryTreeNode<>(3);
        root.left.right = new BinaryTreeNode<>(6);
        root.right.left = new BinaryTreeNode<>(10);
        root.right.right = new BinaryTreeNode<>(14);

        // Convert the binary tree to a linked list
        LinkedListNode<Integer> linkedList = constructLinkedList(root);

        // Print the linked list
        while (linkedList != null) {
            System.out.print(linkedList.data + " ");
            linkedList = linkedList.next;
        }
    }
}

