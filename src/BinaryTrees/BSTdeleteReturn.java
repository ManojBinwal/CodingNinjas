package BinaryTrees;

public class BSTdeleteReturn {
    BinaryTreeNode<Integer> newRoot;
    boolean deleted;

    BSTdeleteReturn(BinaryTreeNode<Integer>newRoot,boolean deleted){
        this.newRoot=newRoot;
        this.deleted=deleted;
    }
}
