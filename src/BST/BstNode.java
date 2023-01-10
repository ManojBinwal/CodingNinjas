package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BstNode<T> {
    T data ;
    BstNode left;
    BstNode right;

    BstNode(T data){
        this.data=data;
    }

}
class BstUse{
    public static void main(String[] args) {
//        BstNode<Integer> root = new BstNode<>(8);
//        BstNode<Integer> rootleft = new BstNode<>(5);
//        BstNode<Integer> rootright = new BstNode<>(12);
//        BstNode<Integer> rootleftleft = new BstNode<>(3);
//        BstNode<Integer> rootleftright = new BstNode<>(6);
//        BstNode<Integer> rootleftrightright = new BstNode<>(7);
//        BstNode<Integer> rootleftleftleft = new BstNode<>(2);
//        BstNode<Integer> rootleftleftright = new BstNode<>(4);
//        BstNode<Integer> rootrightleft = new BstNode<>(10);
//        BstNode<Integer> rootrightright = new BstNode<>(14);
//        BstNode<Integer> rootrightrightright = new BstNode<>(15);
//        BstNode<Integer> rootrightrightleft = new BstNode<>(13);
//        BstNode<Integer> rootrightleftleft = new BstNode<>(9);
//        BstNode<Integer> rootrightleftright = new BstNode<>(11);
//
//        root.left = rootleft;
//        root.right = rootright;
//        rootleft.left = rootleftleft;
//        rootleft.right = rootleftright;
//        rootleftleft.left = rootleftleftleft;
//        rootleftleft.right = rootleftleftright;
//        rootleftright.right = rootleftrightright;
//        rootright.left = rootrightleft;
//        rootright.right = rootrightright;
//        rootrightright.left = rootrightrightleft;
//        rootrightright.right = rootrightrightright;
//        rootrightleft.left = rootrightleftleft;
//        rootrightleft.right = rootrightleftright;

        // Create the root node with data 6
        BstNode<Integer> root = new BstNode<>(6);
        // Create the left child of the root with data 2
        root.left = new BstNode<>(2);
        // Create the right child of the root with data 8
        root.right = new BstNode<>(8);
        // Create the left child of the left child of the root with data 1
        root.left.left = new BstNode<>(1);
        // Create the right child of the left child of the root with data 4
        root.left.right = new BstNode<>(4);
        // Create the left child of the right child of the root with data 7
        root.right.left = new BstNode<>(7);
        // Create the right child of the right child of the root with data 9
        root.right.right = new BstNode<>(9);

//        System.out.println(root.left.right.data);

        /*
                                                    6
                                                   / \
                                                  2   8
                                                 / \ / \
                                                1  4 7  9
        ==============================================================================================================
        ==============================================================================================================
                                                       8
                                                    /     \
                                                  5         12
                                                / \        /  \
                                               3  6       10    14
                                              / \  \     / \    / \
                                             2  4   7   9  11    13 15

         */

//        boolean ispresent = ispresent(root,51);
//        System.out.println(ispresent);

//        int elementbetwenk1k2 = ElementsBetweenK1K2(root,3,11);
//        System.out.println(elementbetwenk1k2);

//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//        BstNode<Integer> newroot = createBst(arr);
//        printLevelwise(newroot);

//        boolean isBst= checkBst(root);
//        System.out. println(isBst);
        
//        LinkedList<Integer>newLL = new LinkedList<>();
//        constructLinkedList(newLL,root);
//        System.out.println(newLL);

//        int lca = getLCA(root,3,6);
//        System.out.println(lca);

//        replaceSumWithGN(root);
//        printLevelwise(root);

        ArrayList<Integer>path = getPath(root,4);
        System.out.println(path);


    }

    private static ArrayList<Integer> getPath(BstNode<Integer> root, int x) {
        if(root==null){
            return null;
        }
        ArrayList<Integer>path = new ArrayList<>();
        if(root.data==x){
            path.add(root.data);
            
            return path;
        }
       else if(x<root.data){
            if(path!=null){
                path.add(root.data);
            }
            return path;
        }
        else{
            if(path!=null){
                path.add(root.data);

            }
            return path;
        }
    }

    public static void replaceSumWithGN(BstNode<Integer> root) {
        // Call the helper method to replace the values of the nodes in the tree
        int sum = replaceWithSumOfGreaterNodes(root, 0);
    }
    /*
                                                    6
                                                   / \
                                                  2   8
                                                 / \ / \
                                                1  4 7  9
           recursive call on the right subtree till 9 --> since there is no element greater than 9 so it will stay same.
           stack goes up so value of 8 will update to 8+sum =>17 -> call on left of 8 value of 7 updates to 7+sum = 24.
           similarly stack goes up to the root and then to left side of the root.
           recursive call pattern - 9,8,7,6,4,2,1
     */

    public static int replaceWithSumOfGreaterNodes(BstNode<Integer> root, int sum) {
        // If the root node is null, return the sum
        if (root == null) return sum;
        // Recursively process the right subtree, passing in the right child of the root node and the current sum as arguments
        sum = replaceWithSumOfGreaterNodes(root.right, sum);
        // Add the value of the root node to the sum
        sum += root.data;
        // Replace the value of the root node with the sum
        root.data = sum;
        // Recursively process the left subtree, passing in the left child of the root node and the current sum as arguments
        sum = replaceWithSumOfGreaterNodes(root.left, sum);
        // Return the sum
        return sum;
    }

    public static int getLCA(BstNode<Integer> root, int a, int b) {
        // If the root is null, the LCA cannot be found, so return -1
        if (root == null) {
            return -1;
        }
        // If the root's data is equal to one of the given values (a or b), then the root is the LCA
        if (root.data == a || root.data == b) {
            return root.data;
        }
        // Recursively search for the LCA in the left and right subtrees
        int left = getLCA(root.left, a, b);
        int right = getLCA(root.right, a, b);
        // If the LCA is found in both the left and right subtrees, then the current root is the LCA
        if (left != -1 && right != -1) {
            return root.data;
        }
        // If the LCA is found only in the left subtree, return the result from the left subtree
        if (left != -1) {
            return left;
        }
        // If the LCA is found only in the right subtree, return the result from the right subtree
        if (right != -1) {
            return right;
        }
        // If the LCA is not found in either subtree, return -1
        return -1;
    }


    private static void constructLinkedList(LinkedList<Integer> newLL, BstNode<Integer> root) {
        if (root == null) {
            return;
        }
        constructLinkedList(newLL, root.left);
        newLL.add(root.data);
        constructLinkedList(newLL, root.right);
    }

    private static boolean checkBst(BstNode<Integer> root) {
        return checkBstHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean checkBstHelper(BstNode<Integer> root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        if (root.data < minValue || root.data > maxValue) {
            return false;
        }
        return checkBstHelper(root.left, minValue, root.data - 1) && checkBstHelper(root.right, root.data , maxValue);
    }

    private static void printLevelwise(BstNode<Integer> root) {
        if(root==null){
            return;
        }
        Queue<BstNode<Integer>>pendingPrint = new LinkedList<>();
        pendingPrint.add(root);
        while(!pendingPrint.isEmpty()){
            BstNode<Integer>front = pendingPrint.poll();
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

    private static void print(BstNode<Integer> root) {
        if (root == null) {
            return;
        }

        // print left subtree
        print(root.left);

        // print current node
        System.out.print(root.data + " ");

        // print right subtree
        print(root.right);
    }


    private static BstNode<Integer> createBst(int[] arr) {
        return createBst(arr, 0, arr.length - 1);
    }

    private static BstNode<Integer> createBst(int[] arr, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }

        int mid = (startIndex + endIndex) / 2;
        BstNode<Integer> root = new BstNode<>(arr[mid]);
        root.left = createBst(arr, startIndex, mid - 1);
        root.right = createBst(arr, mid + 1, endIndex);
        return root;
    }


    private static int ElementsBetweenK1K2(BstNode<Integer> root, int k1, int k2) {
        if(root==null){
            return 0;
        }
        int leftcount=0;
        int rightcount=0;

        if(root.data>=k1){
            if(root.data>=k1 && root.data<=k2){
                leftcount = ElementsBetweenK1K2(root.left,k1,k2);
                rightcount = ElementsBetweenK1K2(root.right,k1,k2);
            }

        }
      else if(root.data<k1){
            if(root.data>=k1 && root.data<=k2){
                leftcount = ElementsBetweenK1K2(root.left,k1,k2);
                rightcount = ElementsBetweenK1K2(root.right,k1,k2);
            }

        }
       else {

           if(root.data>=k1 && root.data<=k2){
               leftcount = ElementsBetweenK1K2(root.left,k1,k2);
               rightcount =  ElementsBetweenK1K2(root.right,k1,k2);
           }

        }
        return 1+leftcount+rightcount;
    }

    private static boolean ispresent(BstNode<Integer> root,int x) {
        if(root==null ){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(root.data>x){
            return ispresent(root.left,x);
        }
        else
            return ispresent(root.right,x);

    }

}
