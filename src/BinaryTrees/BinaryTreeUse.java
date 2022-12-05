package BinaryTrees;

import com.sun.source.tree.BinaryTree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(8);
        //creating root node with data as 1.
        // root.data =1;  // root node data using object
        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(3);
        // creates independent node with data 2
        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(10);
        //creates independent node with data 3
        root.left=rootLeft;
        //linking root to rootLeft (now root has reference to rootLeft node)
        root.right = rootRight;
        //linking root to rootRight(now root has reference to rootRight
        BinaryTreeNode<Integer> threeRight = new BinaryTreeNode<Integer>(6);
        rootLeft.right = threeRight;
        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(1);
        rootLeft.left=threeLeft;
        BinaryTreeNode<Integer> tenRight = new BinaryTreeNode<Integer>(14);
        rootRight.right = tenRight;
        BinaryTreeNode<Integer> tenLeft = new BinaryTreeNode<Integer>(9);
        rootRight.left=tenLeft;

//        printTreeDetailed(root);
//        BinaryTreeNode<Integer> root = takeTreeInputImproved(true,0,true);
//        replaceNodeswithDepth(root);
//        removeLeaves(root);
//        mirrorBinaryTree(root);
//        printTreeDetailed(root);
//        System.out.println(numNodes(root));
//        System.out.println(largest(root));

//        System.out.println(numLeaves(root));
        //printAtDepthK(root,2);
//        System.out.println(isBalanced(root));
//        takeInputLevelWise();
//       BinaryTreeNode<Integer> root=takeInputLevelWise();
//        int k1 = 3;
//        int k2 = 10;
//        printBetweenKs(root,k1,k2);
//        System.out.println(isBST(root));
//        printTreeDetailed(root);
//        System.out.println(searchInBst(root,k));
//        IsBstReturn ans = isBST2(root);
//        System.out.println(ans.min +" " +ans.max + " "+ans.isBst);
//        System.out.println(isBST3(root,Integer.MIN_VALUE, Integer.MAX_VALUE));
//          ArrayList<Integer> path = nodeToRootPath(root,14);
//            for(int i:path){
//                System.out.println(i);
//            }


    }
    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer>root, int x){
        if(root==null){
            return null;
        }
        if(root.data ==x){
            ArrayList<Integer> output = new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = nodeToRootPath(root.left,x);
        if(leftOutput !=null){
            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = nodeToRootPath(root.right,x);
        if(rightOutput !=null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        return null;

    }

    public static boolean isBST3(BinaryTreeNode<Integer>root,int minRange, int maxRange) {
        if(root == null){
            return true;
        }
        if(root.data <minRange || root.data>maxRange){
            return false;
        }
        boolean isLeftWithinRange = isBST3(root.left,minRange,root.data-1);
        boolean isrightWithinRange = isBST3(root.right, root.data, maxRange);
        return isLeftWithinRange && isrightWithinRange;

    }
    public static IsBstReturn isBST2(BinaryTreeNode<Integer>root){
        if(root==null){
            IsBstReturn ans = new IsBstReturn(Integer.MAX_VALUE,Integer.MIN_VALUE,true);
            return ans;
        }
        IsBstReturn leftAns = isBST2(root.left);
        IsBstReturn rightAns = isBST2(root.right);

        int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
        boolean isBst = true;
        if(leftAns.max>=root.data) {
            isBst=false;
        }
        if(!leftAns.isBst) {
            isBst =false;
        }
        if(!rightAns.isBst){
            isBst=false;
        }
        IsBstReturn ans = new IsBstReturn(min,max,isBst);
        return ans;
    }


    public static BinaryTreeNode<Integer> takeTreeInput() {
        System.out.println("Enter root data");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;

        return root;

    }

    public static BinaryTreeNode<Integer> takeTreeInputImproved(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter Left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputImproved(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputImproved(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;

        return root;

    }

    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        printTree(root.left); // recursively print left nodes
        printTree(root.right); // recursively print right nodes
//        if(root.left != null) {
//            printTree(root.left);
//        }
//        if(root.right != null){
//            printTree(root.right);
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        //print the elements of tree linearly
        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
            //prints left child of present node
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
            //prints right child of present node
        }
        System.out.println();
        printTreeDetailed(root.left); //recursive call to print left nodes
        printTreeDetailed(root.right); // recursive call to print right nodes
    }

    public static int numNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftNodeCount = numNodes(root.left);
        int rightNodeCount = numNodes(root.right);
        return 1 + leftNodeCount + rightNodeCount;
    }

    public static int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));

    }

    public static int numLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return numLeaves(root.left) + numLeaves(root.right);
    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {

        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        printAtDepthK(root.left, k - 1);
        printAtDepthK(root.right, k - 1);

    }

    public static void replaceNodeswithDepth(BinaryTreeNode<Integer> root) {
        replaceNodeswithDepth(root, 0);

    }

    public static void replaceNodeswithDepth(BinaryTreeNode<Integer> root, int level) {
        if (root == null) {
            return;
        }
        root.data = level;

        replaceNodeswithDepth(root.left, level + 1);
        replaceNodeswithDepth(root.right, level + 1);
    }

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) return;
        mirrorBinaryTree(root.right);
        mirrorBinaryTree(root.left);
//        Mirroring or Swapping
        BinaryTreeNode<Integer> tmpLeft = root.left;
        root.left = root.right;
        root.right = tmpLeft;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);

    }

    public static BalanceTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            int height = 0;
            boolean isBal = true;
            BalanceTreeReturn ans = new BalanceTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }
        BalanceTreeReturn leftOutput = isBalancedBetter(root.left);
        BalanceTreeReturn rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if (Math.abs(leftOutput.height - rightOutput.height) > 1) {
            isBal = false;
        }
        if (!leftOutput.isBalanced || !rightOutput.isBalanced) {
            isBal = false;
        }
        BalanceTreeReturn ans = new BalanceTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data: ");
        int rootData = s.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChildren.add(root);

        while (!pendingChildren.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter Left Child of +  " + front.data);
            int left = s.nextInt();
            if (left != -1) {
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<Integer>(left);
                front.left = leftChild;
                pendingChildren.add(leftChild);
            }
            System.out.println("Enter Right Child of +  " + front.data);
            int right = s.nextInt();
            if (right != -1) {
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<Integer>(right);
                front.right = rightChild;
                pendingChildren.add(rightChild);
            }
        }
        return root;
    }

    public static boolean searchInBst(BinaryTreeNode<Integer> root, int k) {
        if (root == null) return false;
        if (root.data == k) return true;
        else if (k > root.data) return searchInBst(root.right, k);
        else return searchInBst(root.left, k);
    }

    public static void printBetweenKs(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data < k1) {
            printBetweenKs(root.right, k1, k2);
        } else if (root.data > k2) {
            printBetweenKs(root.left, k1, k2);
        } else {
            printBetweenKs(root.left, k1, k2);
            System.out.print(root.data + " ");
            printBetweenKs(root.right, k1, k2);
        }

    }

    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    public static int maximum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));

    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        int leftMax = maximum(root.left);
        if (leftMax >= root.data) {
            return false;
        }
        int rightMin = minimum(root.right);
        if (rightMin < root.data) {
            return false;
        }
        boolean isLeftBst = isBST(root.left);
        boolean isRightBst = isBST(root.right);
        return isLeftBst && isRightBst;
    }

}
