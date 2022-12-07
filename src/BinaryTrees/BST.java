package BinaryTrees;

public class BST{
    private BinaryTreeNode<Integer> root;
    public int size;

    private static boolean ispresent(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(x<root.data){
            return ispresent(root.left,x);
        }
        else{
            return ispresent(root.right,x);
        }
    }
    public boolean ispresent(int x){
       return ispresent(root,x);
    }
    private static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root,int  x){
        if(root==null){
            BinaryTreeNode<Integer>newRoot = new BinaryTreeNode<>(x);
            return newRoot;
        }
        if(x>=root.data){
            root.right= insert(root.right,x);
        }
        else {
            root.left = insert(root.left,x);
        }
        return root;
        }
    public void insert(int x){
       root = insert(root,x);
       size++;
    }

    private static BSTdeleteReturn delete(BinaryTreeNode<Integer>root,int x){
        if(root==null){
            return new BSTdeleteReturn(null,false);
        }
        if(root.data < x){
            BSTdeleteReturn outputRight = delete(root.right,x);
            root.right=outputRight.newRoot;
            outputRight.newRoot=root;
            return outputRight;
        }
        if(root.data > x){
            BSTdeleteReturn outputLeft = delete(root.left,x);
            root.left=outputLeft.newRoot;
            outputLeft.newRoot=root;
            return outputLeft;
        }
       if(root.left ==null && root.right == null) {
           return new BSTdeleteReturn(null,false);
       }

       if(root.left !=null && root.right==null){
           return new BSTdeleteReturn(root.left,true);
       }
       if(root.left==null && root.right !=null){
           return new BSTdeleteReturn(root.right,true);
       }

       int rightMin = minimum(root.right);
       root.data = rightMin;
       BSTdeleteReturn outputRight = delete(root.right,rightMin);
       root.right = outputRight.newRoot;
       return new BSTdeleteReturn(root,true);
    }
    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    private static int largest(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));

    }
    public boolean deleteData(int x) {
        BSTdeleteReturn output = delete(root,x);
        root=output.newRoot;
        if(output.deleted){
            size--;
        }
        return output.deleted;

    }

    public int size(){
        return size;
    }

    private static void printTree(BinaryTreeNode<Integer>root){
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
        printTree(root.left); //recursive call to print left nodes
        printTree(root.right); // recursive call to print right nodes
    }
    public void printTree(){
        printTree(root);
    }
}