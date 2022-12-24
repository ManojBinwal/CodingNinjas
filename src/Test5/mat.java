package Test5;

import java.util.Scanner;

public class mat {
    int[][] matrix;

    // Constructor to initialize the matrix
    mat(int[][] mat) {
        matrix = mat;
    }

    // Method to add two matrices
    public static mat add(mat a, mat b) {
        // Check if either matrix is empty
        if (a.matrix.length == 0) return null;
        int[][] c = new int[a.matrix.length][a.matrix[0].length];
        // Add the corresponding elements of the matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a.matrix[i][j] + b.matrix[i][j]; // Use - for subtraction
            }
        }
        return new mat(c);
    }

    // Method to multiply two matrices
    public static mat multiply(mat a, mat b) {
        // Check if either matrix is empty
        if (a.matrix.length == 0 || b.matrix.length == 0) return null;
        try {
            // Multiply the matrices and return the result
            return new mat(matrixMultiplication(a.matrix, a.matrix.length, a.matrix[0].length, b.matrix, b.matrix.length, b.matrix[0].length));
        } catch (Exception e) {
            return null;
        }
    }

    // Method to perform matrix multiplication
    public static int[][] matrixMultiplication(
            int[][] matrix1, int rows1, int cols1,
            int[][] matrix2, int rows2, int cols2)
            throws Exception {
        // Required condition for matrix multiplication
        if (cols1 != rows2) {
            throw new Exception("Invalid matrix given.");
        }
        // Create a result matrix
        int resultMatrix[][] = new int[rows1][cols2];
        // Core logic for 2 matrices multiplication
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0;
                 j < resultMatrix[i].length;
                 j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j]
                            += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
    public static mat transpose(mat m) {
        // Check if the matrix is empty
        if (m.matrix.length == 0) return null;
        // Create a new matrix for the transpose
        int[][] B = new int[m.matrix[0].length][m.matrix.length];
        int i, j;
        // Find the transpose of the matrix
        for (i = 0; i < m.matrix[0].length; i++) {
            for (j = 0; j < m.matrix.length; j++) {
                B[i][j] = m.matrix[j][i];
            }
        }
        return new mat(B);
    }

    // Method to rotate a matrix 90 degrees clockwise
    public static mat rotate(mat m) {
        int[][] matrix = m.matrix;
        int n = matrix.length;
        // Return null if the matrix has only one element
        if (n == 1) {
            return null;
        }
        // Perform the rotation 3 times to get a 90 degree rotation
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < n / 2; i++) {
                for (int j = i; j < n - 1 - i; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n - 1 - j][i];
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                    matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = temp;
                }
            }
        }
        return new mat(matrix);
    }

    // Method to print the matrix
    public void print() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int option=s.nextInt();
        if(option==1)
        {
            int r1=s.nextInt();
            int c1=s.nextInt();
            int [][] m1=new int[r1][c1];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    m1[i][j]=s.nextInt();
                }
            }
            mat mat1=new mat(m1);
            int r2=s.nextInt();
            int c2=s.nextInt();
            int [][] m2=new int[r2][c2];
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    m2[i][j]=s.nextInt();
                }
            }
            mat mat2=new mat(m2);
            mat ans=mat.add(mat1,mat2);
            ans.print();
        }
        else if (option==2)
        {
            int r1=s.nextInt();
            int c1=s.nextInt();
            int [][] m1=new int[r1][c1];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    m1[i][j]=s.nextInt();
                }
            }
            mat mat1=new mat(m1);
            int r2=s.nextInt();
            int c2=s.nextInt();
            int [][] m2=new int[r2][c2];
            for(int i=0;i<r2;i++)
            {
                for(int j=0;j<c2;j++)
                {
                    m2[i][j]=s.nextInt();
                }
            }
            mat mat2=new mat(m2);
            mat ans=mat.multiply(mat1,mat2);
            ans.print();
        }
        else if(option==3)
        {
            int r1=s.nextInt();
            int c1=s.nextInt();
            int [][] m1=new int[r1][c1];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    m1[i][j]=s.nextInt();
                }
            }
            mat mat1=new mat(m1);
            mat ans=mat.transpose(mat1);
            ans.print();
        }
        else
        {
            int r1=s.nextInt();
            int c1=s.nextInt();
            int [][] m1=new int[r1][c1];
            for(int i=0;i<r1;i++)
            {
                for(int j=0;j<c1;j++)
                {
                    m1[i][j]=s.nextInt();
                }
            }
            mat mat1=new mat(m1);
            mat ans=mat.rotate (mat1);
            ans.print();
        }
    }
}


