// Day4.java

import java.util.Scanner;

public class Day4 {

    // Recursive function to calculate the factorial of a number
    public static int recursiveFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * recursiveFactorial(n - 1); // Recursive call
    }

    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: 0th Fibonacci number is 0
        } else if (n == 1) {
            return 1; // Base case: 1st Fibonacci number is 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    // Function to print a 2D array (matrix)
    public static void print2DArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to calculate the sum of elements in a 2D array
    public static int sum2DArray(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Recursion: Calculate factorial using recursion
        System.out.print("Enter a number to calculate its factorial recursively: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is: " + recursiveFactorial(num));

        // 2. Recursion: Find nth Fibonacci number
        System.out.print("Enter a number to find the nth Fibonacci number: ");
        int fibNum = sc.nextInt();
        System.out.println("Fibonacci number at position " + fibNum + " is: " + fibonacci(fibNum));

        // 3. 2D Arrays: Input and print 2D array (matrix)
        System.out.print("Enter the number of rows for the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns for the matrix: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The entered matrix is:");
        print2DArray(matrix);

        // 4. 2D Arrays: Calculate sum of elements in a 2D array
        System.out.println("The sum of elements in the matrix is: " + sum2DArray(matrix));

        sc.close();
    }
}
