package BinaryTrees;

import OOPs.Generics.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

class BalancedTreeReturn{
    int height;
    boolean isBal;
    BalancedTreeReturn(int height, boolean isBal){
        this.height=height;
        this.isBal=isBal;
    }
}
public class BinaryTreeNode<T> {
    public T data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;


    public BinaryTreeNode() {}

    public BinaryTreeNode(T data){
        this.data=data;
    }
}

class BinaryTreeUse{


    public static void main(String[] args) {
        // create the root node and its children
        BinaryTreeNode<Integer>root = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer>rootleft = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer>rootright = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer>rootleftright = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer>rootrightleft = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer>rootrightleftleft = new BinaryTreeNode<>(7);
        BinaryTreeNode<Integer>rootrightleftleftleft = new BinaryTreeNode<>(6);

        // set the left and right children of the root node
        root.right = rootright;
        root.left = rootleft;
        root.left.right=rootleftright;
        root.right.left=rootrightleft;
//        root.right.left.left=rootrightleftleft;
//        root.right.left.left.left= rootrightleftleftleft;

        // call the print method to print the data of the nodes in the binary tree in preorder traversal
        //print(root);

        // call the printBetter method to print the data of the nodes in the binary tree in a more readable format
//        printBetter(root);
//
//             System.out.println(numberNodes(root));
//        System.out.println(heightOfTree(root));
//        System.out.println(sumOfNodes(root));
//        printPreOrder(root);
//        System.out.println();
//        printInOrder(root);
//        System.out.println();
//        printPostOrder(root);
//        int maxLeft = maxNodeLeft(root);
//        System.out.println(maxLeft);
//        int maxRight= maxNodeRight(root);
//        System.out.println(maxRight);
//        int maxNode= maxNode(root);
//        System.out.println(maxNode);
//        int nodesgreaterthank = countNodesGreaterThanK(root,2);
//        System.out.println(nodesgreaterthank);
//        int height = getHeight(root);
//        System.out.println(height);
//        replaceNodesWithDepth(root);
//        printBetter(root);
//        boolean ispresent=isNodePresent(root,3);
//        System.out.println(ispresent);
//        printNodesWithoutSibling(root);
//        removeLeafNodes(root,null);
//        printBetter(root);
//        mirrorBinaryTree(root);
//        printBetter(root);
//        BalancedTreeReturn ans = isBalanced(root);
//        System.out.println(ans.isBal);

//        Pair<Integer,Integer> diameter = getDiameterBetter(root);
//        System.out.println(diameter.getFirst());

//        BinaryTreeNode<Integer>newRoot = takeinputLevelWise();

//        printLevelWise(root);

//        int preOrder[] ={1,2,4,5,3,6,7};
//        // Test 1: Build a tree from the given post-order and in-order traversal arrays
//        int[] postOrder = {4, 5, 2, 6, 7, 3, 1};
//        int[] inOrder = {4, 2, 5, 1, 3, 6, 7};
//        BinaryTreeNode<Integer> newroot = buildTree(postOrder, inOrder);
//        print(newroot);

//        insertDuplicateNode(root);
//        print(root);

//        int[] minMax = getMinAndMax(root);
//        System.out.println("Minimum value: " + minMax[0]);
//        System.out.println("Maximum value: " + minMax[1]);

//        printLevelWiseSimple(root);

//        int k = 120;
//        System.out.println("Root-to-leaf paths whose nodes add up to " + k + ":");
//        rootToLeafPathsSumToK(root, k);

        AgainnodesAtDistanceK(root,2,2);



    }


    public static void AgainnodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        // Call the helper function to find the node with the given value and print the nodes at distance k from it.
        int x = print(root, node, k);
    }

    public static int print(BinaryTreeNode<Integer> root, int node, int k) {
        // Check if the root is null. If it is, return -1.
        if (root == null) {
            return -1;
        }

        // Check if the root's data is equal to the given value. If it is, print the nodes at distance k from it and return 0.
        if (root.data == node) {
            printAtk(root, k);
            return 0;
        }

        // Recursively search for the node in the left subtree.
        int ld = print(root.left, node, k);

        // If the node was not found in the left subtree, search for it in the right subtree.
        int rd;
        if (ld == -1) {
            rd = print(root.right, node, k);

            // If the node was not found in the right subtree either, return -1.
            if (rd == -1) {
                return -1;
            }
            // If the node was found in the right subtree and the distance from it to the root is equal to k, print the root's data and return k.
            else if (rd + 1 == k) {
                System.out.println(root.data + " ");
                return k;
            }
            // If the node was found in the right subtree but the distance from it to the root is not equal to k,
            // print the nodes at distance k - rd - 2 from the root's left child and return rd + 1.
            else {
                printAtk(root.left, k - rd - 2);
                return rd + 1;
            }
        }
        // If the node was found in the left subtree and the distance from it to the root is equal to k, print the root's data and return k.
        else if (ld + 1 == k) {
            System.out.println(root.data + " ");
            return k;
        }
        // If the node was found in the left subtree but the distance from it to the root is not equal to k,
        // print the nodes at distance k - ld - 2 from the root's right child and return ld + 1.
        else {
            printAtk(root.right, k - ld - 2);
            return ld + 1;
        }
    }

    public static void printAtk(BinaryTreeNode<Integer> root, int k) {
        // Check if the root is null. If it is, return immediately.
        if (root == null) {
            return;
        }
        // If the distance from the root to the node is equal to k, print the root's data.
        if(k==0){
            System.out.println(root.data+" ");
            return;
        }
        printAtk(root.left,k-1);
        printAtk(root.right,k-1);
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String str) {
        // Check if the root is null. If it is, return immediately.
        if(root==null){
            return;
        }

        // Append the root's data to the string str.
        str+=root.data+" ";

        // Check if the root is a leaf node and if the sum of its data and the remaining value of k is equal to k.
        // If it is, print the string str.
        if(root.left==null && root.right==null && root.data==k){
            System.out.println(str);
        }

        // Recursively call the function for the left and right children of the root, with the updated value of k.
        rootToLeafPathsSumToK(root.left,k- root.data,str);
        rootToLeafPathsSumToK(root.right,k-root.data,str);
    }


    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        // Call the helper function with an empty string as the initial value of str.
        rootToLeafPathsSumToK(root,k,"");
    }
    public static void printLevelWiseSimple(BinaryTreeNode<Integer> root) {
        // Check if the root is null. If it is, return immediately.
        if (root== null) return;

        // Create a queue to store the nodes that still need to be processed.
        // We use a LinkedList as the implementation of the queue.
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();

        // Add the root node to the queue.
        pendingNodes.add(root);

        // Add a null element to the queue to mark the end of a level.
        pendingNodes.add(null);

        // Keep processing nodes until the queue is empty.
        while(!pendingNodes.isEmpty()) {
            // Remove the first element from the queue.
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

            // Check if the removed element is null. If it is, it means we have reached the end of a level.
            if (frontNode == null) {
                // Print a newline character.
                System.out.println();

                // Check if the queue is not empty. If it is not, add another null element to the queue to mark the end of the next level.
                if (!pendingNodes.isEmpty()) {
                    pendingNodes.add(null);
                }
            } else {
                // If the removed element is not null, it means it is a node. Print its data.
                System.out.print(frontNode.data + " ");

                // Add the left and right children of the node to the queue, if they exist.
                if (frontNode.left != null) {
                    pendingNodes.add(frontNode.left);
                }
                if (frontNode.right != null) {
                    pendingNodes.add(frontNode.right);
                }
            }
        }
    }

    public static int[] getMinAndMax(BinaryTreeNode<Integer> root) {
        int[] minMax = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE};
        if (root == null) return minMax;

        int[] leftMinMax = getMinAndMax(root.left);
        int[] rightMinMax = getMinAndMax(root.right);

        if (root.data < minMax[0]) minMax[0] = root.data;
        if (root.data > minMax[1]) minMax[1] = root.data;

        if (leftMinMax[0] < minMax[0]) minMax[0] = leftMinMax[0];
        if (leftMinMax[1] > minMax[1]) minMax[1] = leftMinMax[1];

        if (rightMinMax[0] < minMax[0]) minMax[0] = rightMinMax[0];
        if (rightMinMax[1] > minMax[1]) minMax[1] = rightMinMax[1];

        return minMax;
    }
    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        // Return if the root node is null
        if (root == null) return;

        // Create a new node with the same value as the root node
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);

        // Store the left child of the root node in a temporary variable
        BinaryTreeNode<Integer> rootLeft = root.left;

        // Set the left child of the root node to the new duplicate node
        root.left = newNode;

        // Set the left child of the duplicate node to the original left child of the root node
        newNode.left = rootLeft;

        // Recursively insert duplicate nodes into the left and right subtrees
        insertDuplicateNode(rootLeft);
        insertDuplicateNode(root.right);


    }
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        // Check if the input arrays are null or empty
        if (postOrder == null || postOrder.length == 0 || inOrder == null || inOrder.length == 0) {
            return null;
        }

        // Call the helper function with the appropriate indices
        return buildTreeHelper(postOrder, 0, postOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    private static BinaryTreeNode<Integer> buildTreeHelper(
            int[] postOrder,
            int postOrderStart,
            int postOrderEnd,
            int[] inOrder,
            int inOrderStart,
            int inOrderEnd
    ) {
        // Base case: If the start indices are larger than the end indices, return null
        if (postOrderStart > postOrderEnd || inOrderStart > inOrderEnd) return null;

        // Create a root node with the value at the end of the post-order array
        int rootValue = postOrder[postOrderEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootValue);

        // Find the index of the root value in the in-order array
        int k = 0;
        for (int i = inOrderStart; i <= inOrderEnd; i++) {
            if (rootValue == inOrder[i]) {
                k = i;
                break;
            }
        }

        // Recursively build the left and right subtrees
        // The left subtree will contain elements in the post-order array from postOrderStart to (postOrderStart + k - inOrderStart) - 1
        // The left subtree will contain elements in the in-order array from inOrderStart to k - 1
        root.left = buildTreeHelper(postOrder, postOrderStart, (postOrderStart + k - inOrderStart) - 1, inOrder, inOrderStart, k - 1);

        // The right subtree will contain elements in the post-order array from (postOrderStart + k - inOrderStart) to postOrderEnd - 1
        // The right subtree will contain elements in the in-order array from k + 1 to inOrderEnd
        root.right = buildTreeHelper(postOrder, postOrderStart + k - inOrderStart, postOrderEnd - 1, inOrder, k + 1, inOrderEnd);

        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preorder, int[] inorder, int preStart, int inStart, int preEnd, int inEnd) {
        // Check if the start index of the preorder subarray is greater than the end index.
        // If it is, return null as this indicates that there are no elements left to create a tree from.
        if (preStart > preEnd) {
            return null;
        }
        // Get the data from the first element in the preorder subarray as the root node.
        int rootData = preorder[preStart];
        // Create a new BinaryTreeNode object using the root node data.
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        // Initialize the root index to -1.
        int rootIndex = -1;
        // Find the index of the root node data in the inorder array.
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootData) {
                rootIndex = i;
                // Break out of the loop once the root index is found.
                break;
            }
        }
        // Define the subarrays of preorder and inorder that correspond to the left and right subtrees of the root node.
        // Update the start and end indices of these subarrays based on the value of rootIndex.
        int leftPreStart = preStart + 1;
        int leftInStart = inStart;
        int leftInEnd = rootIndex - 1;
        int leftSize = leftInEnd - leftInStart + 1;
        int leftPreEnd = leftPreStart + leftSize - 1;
        int rightPreStart = leftPreEnd + 1;
        int rightInStart = rootIndex + 1;
        int rightPreEnd = preEnd;
        int rightInEnd = inEnd;
        // Recursively call buildTree on the left and right subtree subarrays to construct the left and right subtrees.
        BinaryTreeNode<Integer> left = buildTree(preorder, inorder, leftPreStart, leftInStart, leftPreEnd, leftInEnd);
        BinaryTreeNode<Integer> right = buildTree(preorder, inorder, rightPreStart, rightInStart, rightPreEnd, rightInEnd);
        // Set the left and right attributes of the root node to be the root nodes of the left and right subtrees, respectively.
        root.left = left;
        root.right = right;
        // Return the root node.
        return root;
    }

    private static BinaryTreeNode<Integer> constructBinaryTree(int[] preorder, int[] inorder) {
        // Call buildTree with the full lengths of the preorder and inorder arrays to construct the binary tree.
        BinaryTreeNode<Integer> root = buildTree(preorder, inorder, 0, 0, preorder.length - 1, inorder.length - 1);
        // Return the root node of the constructed tree.
        return root;
    }

    private static void printLevelWise(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>>pendingPrint = new LinkedList<>();
        pendingPrint.add(root);
        while(!pendingPrint.isEmpty()){
            BinaryTreeNode<Integer>front = pendingPrint.poll();
            System.out.print(front.data + ":");
            if(front.left!=null) {
                System.out.print(" L" + front.left.data + " ");
                pendingPrint.add(front.left);
            }
            if(front.right!=null) {
                System.out.print(" R" + front.right.data + " ");
                pendingPrint.add(front.right);
            }
            System.out.println();
        }
    }

    public static BinaryTreeNode<Integer>takeinputLevelWise(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data(-1 to return ");
        int rootData = sc.nextInt();

        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer>root = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);

        while(!pendingChildren.isEmpty()){
            BinaryTreeNode<Integer>front = pendingChildren.poll();
            System.out.println("Enter Left Child of " + front.data);
            int left = sc.nextInt();
            if(left!=-1){
                BinaryTreeNode<Integer>leftchild   = new BinaryTreeNode<>(left);
                front.left = leftchild;
                pendingChildren.add(leftchild);
            }
            System.out.println("Enter Right Child of " + front.data);
            int right = sc.nextInt();
            if(right!=-1){
                BinaryTreeNode<Integer>rightchild   = new BinaryTreeNode<>(right);
                front.left = rightchild;
                pendingChildren.add(rightchild);
            }
        }
        return root;
    }

    private static Pair<Integer,Integer> getDiameterBetter(BinaryTreeNode<Integer>root){
        if(root == null){
            return new Pair<>(0, 0);
        }
        Pair<Integer, Integer> leftResult = getDiameterBetter(root.left);
        Pair<Integer, Integer> rightResult = getDiameterBetter(root.right);
        int leftHeight = leftResult.getSecond();
        int rightHeight = rightResult.getSecond();
        int diameterThroughRoot = leftHeight + rightHeight + 1;
        int diameter = Math.max(diameterThroughRoot, Math.max(leftResult.getFirst(), rightResult.getFirst()));
        int height = 1 + Math.max(leftHeight, rightHeight);
        return new Pair<>(diameter, height);
    }
    private static int getDiameter(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int leftheight = heightOfTree(root.left);
        int rightheight = heightOfTree(root.right);
        int diameter = leftheight+rightheight;
        int leftDiameter = getDiameter(root.left);
        int rightDiameter = getDiameter(root.right);
        int maxDiamter = Math.max(leftDiameter,rightDiameter);
        return Math.max(maxDiamter,diameter);
    }

    private static BalancedTreeReturn isBalanced(BinaryTreeNode<Integer>root){
        if (root==null){
            int height=0;
            boolean isBal=true;
            BalancedTreeReturn ans = new BalancedTreeReturn(height,isBal);
            return ans;
        }
        BalancedTreeReturn leftoutput = isBalanced(root.left );
        BalancedTreeReturn rightoutput = isBalanced(root.right);
        boolean isBal = true;
        int height = 1+ Math.max(leftoutput.height,rightoutput.height);
        if(Math.abs(leftoutput.height-rightoutput.height)>1){
            isBal=false;
        }
        if(!leftoutput.isBal || !rightoutput.isBal){
            isBal=false;
        }
        BalancedTreeReturn ans = new BalancedTreeReturn(height,isBal);
        return ans;
    }
    private static boolean checkBalancedBetter(BinaryTreeNode<Integer> root) {
        // Create an AtomicBoolean object with an initial value of true
        AtomicBoolean isBalanced = new AtomicBoolean(true);
        // Call the getHeight method with the root node and isBalanced as arguments
        getHeight(root, isBalanced);
        // Return the value of isBalanced
        return isBalanced.get();
    }
    private static int getHeight(BinaryTreeNode<Integer> root, AtomicBoolean isBalanced) {
        // If the root node is null, return 0
        if (root == null) {
            return 0;
        }

        // Create two AtomicBoolean objects with initial values of true
        AtomicBoolean leftIsBalanced = new AtomicBoolean(true);
        AtomicBoolean rightIsBalanced = new AtomicBoolean(true);
        // Call the getHeight method recursively on the left and right children of the root node, passing in the respective AtomicBoolean objects
        int leftHeight = getHeight(root.left, leftIsBalanced);
        int rightHeight = getHeight(root.right, rightIsBalanced);

        // Set the value of isBalanced to be the conjunction of the values of leftIsBalanced, rightIsBalanced, and the condition that the difference between the left and right heights is less than or equal to 1
        isBalanced.set(leftIsBalanced.get() && rightIsBalanced.get() && Math.abs(leftHeight - rightHeight) <= 1);
        // Return the maximum of the left and right heights, plus 1 to account for the root node
        return Math.max(leftHeight, rightHeight) + 1;
    }
    private static boolean checkBalanced(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        boolean isleftbalance = checkBalanced(root.left);
        boolean isrightbalance = checkBalanced(root.right);
        return isleftbalance && isrightbalance;
    }

    private static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }

        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        BinaryTreeNode<Integer> temp;
        temp = root.left;
        root.left=root.right;
        root.right=temp;
    }

    private static void removeLeafNodes(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> parent) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            // Node is a leaf node, remove it
            if (parent.left == root) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } else {
            // Node is not a leaf node, recurse on its children
            removeLeafNodes(root.left, root);
            removeLeafNodes(root.right, root);
        }
    }

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        if (root == null) return;

        if (root.left == null && root.right != null) {
            System.out.print(root.right.data + " ");
        } else if (root.left != null && root.right == null) {
            System.out.print(root.left.data + " ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
    }


    private static boolean isNodePresent(BinaryTreeNode<Integer>root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }

        return isNodePresent(root.left,x) || isNodePresent(root.right,x);
    }
    private static void replaceNodesWithDepth(BinaryTreeNode<Integer> root) {
        replaceNodesWithDepth(root,0);
    }

    private static void replaceNodesWithDepth(BinaryTreeNode<Integer> root, int level) {
        if(root==null){
            return;
        }
        root.data=level;
        replaceNodesWithDepth(root.left,level+1);
        replaceNodesWithDepth(root.right,level+1);
    }

    private static int getHeight(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        int countLeft=1+getHeight(root.left);
        int countRight=1+getHeight(root.right);
        return Math.max(countLeft,countRight);
    }

    public static int countNodesGreaterThanK(BinaryTreeNode<Integer> root, Integer k) {
        // Handle the case where k is null or the tree is empty
        if (root == null || k == null) {
            return 0;
        }

        // Recursively count the number of nodes in the left and right subtrees
        int leftCount = countNodesGreaterThanK(root.left, k);
        int rightCount = countNodesGreaterThanK(root.right, k);

        // If the current node's value is greater than k, add 1 to the count
        int count = (root.data > k) ? 1 : 0;

        // Return the total count
        return count + leftCount + rightCount;
    }

    public static int maxNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int maxValue = root.data;
        int leftMax = maxNode(root.left);
        int rightMax = maxNode(root.right);
        return Math.max(maxValue, Math.max(leftMax, rightMax));
    }
    private static int maxNodeRight(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int maxValue = root.data;
//        int leftMax = maxNode(root.left);
        int rightMax = maxNode(root.right);
        return Math.max(maxValue, rightMax);
    }

    private static int maxNodeLeft(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int maxValue = root.data;
        int leftMax = maxNode(root.left);
//        int rightMax = maxNode(root.right);
        return Math.max(maxValue, leftMax);
    }

    private static void printPreOrder(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    private static void printInOrder(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        printPreOrder(root.left);
        System.out.print(root.data+" ");
        printPreOrder(root.right);
    }
    private static void printPostOrder(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        printPreOrder(root.left);
        printPreOrder(root.right);
        System.out.print(root.data+" ");
    }
    // method to print the data of the nodes in the binary tree in preorder traversal
    private  static void print(BinaryTreeNode<Integer>root){
        // base case: if the root is null, return
        if(root==null){
            return;
        }
        // print the data of the current node
        System.out.print(root.data +" ");
        // if the left child exists, recursively call the print method on the left child
        if(root.left!=null){
            print(root.left);
        }
        // if the right child exists, recursively call the print method on the right child
        if(root.right!=null){
            print(root.right);
        }
    }

    // method to print the data of the nodes in the binary tree in a more readable format
    private static void printBetter(BinaryTreeNode<Integer> root){
        // base case: if the root is null, return
        if(root==null){
            return;
        }
        // print the data of the current node, followed by the data of its left and right children (if they exist)
        System.out.print(root.data + ":" );
        if(root.left!=null){
            System.out.print("L" + root.left.data + ", ");
        }
        if(root.right!=null){
            System.out.print("L" + root.right.data + ", ");
        }
        System.out.println();
        // if the left child exists, recursively call the printBetter method on the left child
        if(root.left!=null){
            printBetter(root.left);
        }
        // if the right child exists, recursively call the printBetter method on the right child
        if(root.right!=null){
            printBetter(root.right);
        }

    }
    private static BinaryTreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Root Data(-1 to return): ");
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput();
        root.right = takeInput();
        return root;
    }
    private static BinaryTreeNode<Integer>takeInputBetter(boolean isRoot,int parentData,boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data ");
        }
        else{
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            }
            else{
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();

        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInputBetter(false,rootData,true);
        root.right = takeInputBetter(false,rootData,false);
        return root;
    }
    private static int numberNodes(BinaryTreeNode<Integer>root){
        //the function is called n number of times, where n is the number of nodes.
        //at each  call it returns 0 for left and right nodes.
        //after all recursive call are made and stack starts unbinding and 1 is added for every call made
        //it then return the count.

        if(root==null){
            return 0;
        }
        int counLeft = numberNodes(root.left);
        int countright=numberNodes(root.right);
        return 1+countright+counLeft;

    }
    private static int heightOfTree(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int countleft = 1+heightOfTree(root.left);
        int countRight= 1+heightOfTree(root.right);
        return Math.max(countleft,countRight);
    }
    private static int sumOfNodes(BinaryTreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int rootdata = root.data;
        int sumLeft = sumOfNodes(root.left);
        int sumRight= sumOfNodes(root.right);

        return rootdata+sumLeft+sumRight;

    }


}
