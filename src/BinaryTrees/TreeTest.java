package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTest {

    public static void printTree(TreeNode<Integer>root){
        if(root==null){
            return;
        }
        System.out.print(root.data+ " ");
        for(int i=0; i<root.children.size();i++){
            TreeNode<Integer>child = root.children.get(i);
            printTree(child);
        }
    }
    public static void printTreeDetailed(TreeNode<Integer>root){
        if(root==null){
            return;
        }
        System.out.print(root.data+ ": ");
        for(int i=0;i<root.children.size();i++){
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for(int i=0; i<root.children.size();i++){
            TreeNode<Integer>child = root.children.get(i);
            printTreeDetailed(child);
        }
    }

    public static int numberOfNodes(TreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int count =1;
        for(int i=0; i<root.children.size(); i++){
            int childCount = numberOfNodes(root.children.get(i));
            count += childCount;
        }
        return count;
    }
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

        if(root==null){
            return null;
        }
        int childCount = root.children.size();
        if(childCount==0) return null;

        TreeNode<Integer> largest = root , secondLargest = root.children.get(0);
        if(largest.data < secondLargest.data)
        {
            secondLargest = root;
            largest = root.children.get(0);
        }
        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode<Integer> curr = q.peek();
            q.remove();
            childCount = curr.children.size();

            for(int i=0; i<childCount;i++){
                q.add(curr.children.get(i));

                if(curr.children.get(i).data >secondLargest.data)
                {
                    if(curr.children.get(i).data > largest.data)
                    {
                        secondLargest = largest;
                        largest = curr.children.get(i);
                    }
                    else
                    {
                        secondLargest = curr.children.get(i);
                    }
                }
            }
        }
        return secondLargest;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(1);
        TreeNode<Integer> node4 = new TreeNode<>(5);
        TreeNode<Integer> node5 = new TreeNode<>(6);
        //TreeNode<Integer> node6 = new TreeNode<>(4);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);
        node2.children.add(node5);
        //printTreeDetailed(root);
        System.out.println(numberOfNodes(root));
    }
}
