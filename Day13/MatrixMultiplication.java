package Day13;

import java.util.Scanner;

public class MatrixMultiplication {

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) throws Exception {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        // Check if matrices can be multiplied (i.e., colsA should match rowsB)
        if (colsA != rowsB) {
            throw new Exception("Matrix dimensions do not match for multiplication.");
        }

        // Resultant matrix will have rowsA rows and colsB columns
        int[][] result = new int[rowsA][colsB];

        // Multiply matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;  // Initialize the element
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input dimensions for Matrix A
            System.out.print("Enter number of rows in Matrix A: ");
            int rowsA = scanner.nextInt();
            System.out.print("Enter number of columns in Matrix A: ");
            int colsA = scanner.nextInt();

            // Input dimensions for Matrix B
            System.out.print("Enter number of rows in Matrix B: ");
            int rowsB = scanner.nextInt();
            System.out.print("Enter number of columns in Matrix B: ");
            int colsB = scanner.nextInt();

            // Initialize matrices A and B
            int[][] A = new int[rowsA][colsA];
            int[][] B = new int[rowsB][colsB];

            // Input Matrix A elements
            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsA; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }

            // Input Matrix B elements
            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < rowsB; i++) {
                for (int j = 0; j < colsB; j++) {
                    B[i][j] = scanner.nextInt();
                }
            }

            // Multiply matrices
            int[][] result = multiplyMatrices(A, B);

            // Display result
            System.out.println("Resultant Matrix after multiplication:");
            displayMatrix(result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        }finally {
            scanner.close();
        }
    }
}
