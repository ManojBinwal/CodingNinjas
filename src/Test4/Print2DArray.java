package Test4;


public class Print2DArray {
    public static void main(String[] args) {
        int input[][] = {{1,2,3},{4,5,6},{7,8,9}};
        print2DArray(input);
    }
    public static void print2DArray(int[][] input,int row,int n) {

      if (input.length>n+row){ //print rows
            for (int i=0;i<input[0].length;i++){
                System.out.print(input[row][i]+" ");
            }
            System.out.println();
            print2DArray(input,row,++n);
        }
        else if (input.length==n+row) { //increments row
            print2DArray(input,++row,0);
        }
    }
    public static void print2DArray(int[][] input) {

        print2DArray(input, 0, 0);
    }
}
