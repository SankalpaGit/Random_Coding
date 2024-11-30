package java;
/**
 * Day8
 */
import java.util.*;

public class Day8 {

    public static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial( n-1);
    }

    public static int fibbonnacci(int n){
        if (n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        return fibbonnacci(n - 1)+ fibbonnacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find the factorial :");
        int facNum = sc.nextInt();
        int fact = factorial(facNum);
        System.out.print("Factorial of "+ facNum + " is "+ fact);

        // Fibonacci Calculation
        System.out.print("Enter the term for Fibonacci sequence: ");
        int term = sc.nextInt();
        int fib = fibbonnacci(term);
        System.out.println(term + "th Fibonacci number is: " + fib);
        
        sc.close();
    }
}