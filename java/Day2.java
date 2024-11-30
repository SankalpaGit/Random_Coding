package java;
// Day2.java

import java.util.Scanner;

public class Day2 {

    // Function to check if a number is positive, negative, or zero
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }
    }

    // Corrected factorial function
    public static int factorial(int n) {
        int result = 1;  // Initialize result as 1 (factorial of 0 and 1 is 1)
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by i in each iteration
        }
        return result;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If-Else Statements: Check if a number is positive, negative, or zero
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        checkNumber(number); // Call function to check number

        // For Loop Example: Calculate Factorial
        System.out.print("Enter a number to find its factorial: ");
        int factNumber = sc.nextInt();
        System.out.println("Factorial of " + factNumber + " is " + factorial(factNumber));

        // While Loop Example: Find sum of first 'n' natural numbers
        System.out.print("Enter a number to find the sum of natural numbers: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);

        // Check if a number is prime using a for loop
        System.out.print("Enter a number to check if it's prime: ");
        int primeCheck = sc.nextInt();
        if (isPrime(primeCheck)) {
            System.out.println(primeCheck + " is a prime number.");
        } else {
            System.out.println(primeCheck + " is not a prime number.");
        }
        sc.close();
    }

}
