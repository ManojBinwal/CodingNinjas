package BinaryTrees;

public class BinaryTreeNode<T> {
    //generic class /<T> means the type of data you are going to store in it.

   public T data; //data of type T
   public BinaryTreeNode<T> left;
    //when data type will be passed in main it will decide the data type of nodes
   public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data){
        this.data = data;
    }

}
