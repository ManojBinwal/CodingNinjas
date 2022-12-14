package Recursion2;

public class TowerOfHanoi {
    //(n-1,a,b,c) -> can be read as moving n-1 disks from a to c with the help of b
    //printing is same as moving one disk from one place to another
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n,'a','b','c');
    }
    public static void towerOfHanoi(int n, char a, char b, char c){
        if(n==0)
            return;

        else if(n==1){ //base case of the recursive function
            System.out.println(a + " " + c); //if only disk move from source to destination
            return;
        }
        towerOfHanoi(n-1,a,c,b); //move n-1 disks from source to helper with help of destination
        System.out.println(a+" "+c);//move last disk from source to destination
        towerOfHanoi(n-1,b,a,c);//makes helper disk(b) the source disk and vise versa.
    }
}
