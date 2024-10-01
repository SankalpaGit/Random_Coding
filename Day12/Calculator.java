package Day12;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    
    // HashMap to store operation history
    private static HashMap<Integer, String> history = new HashMap<>();
    private static int operationCounter = 1;

    // Method to perform addition
    public static double sum(double a, double b) {
        double result = a + b;
        history.put(operationCounter++, "Sum: " + a + " + " + b + " = " + result);
        return result;
    }

    // Method to perform subtraction
    public static double subtract(double a, double b) {
        double result = a - b;
        history.put(operationCounter++, "Subtract: " + a + " - " + b + " = " + result);
        return result;
    }

    // Method to perform multiplication
    public static double multiply(double a, double b) {
        double result = a * b;
        history.put(operationCounter++, "Multiply: " + a + " * " + b + " = " + result);
        return result;
    }

    // Method to perform division
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        double result = a / b;
        history.put(operationCounter++, "Divide: " + a + " / " + b + " = " + result);
        return result;
    }

    // Method to display operation history
    public static void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("No operations performed yet.");
        } else {
            System.out.println("Operation History:");
            for (int key : history.keySet()) {
                System.out.println(history.get(key));
            }
        }
    }

    // Main method to drive the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Calculator Menu:");
                System.out.println("1. Add");
                System.out.println("2. Subtract");
                System.out.println("3. Multiply");
                System.out.println("4. Divide");
                System.out.println("5. View History");
                System.out.println("6. Exit");

                System.out.print("Choose an operation: ");
                int choice = scanner.nextInt();

                if (choice == 6) {
                    System.out.println("Exiting calculator. Goodbye!");
                    break;
                }

                double num1 = 0, num2 = 0;
                if (choice >= 1 && choice <= 4) {
                    // Get inputs for the operation
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                }

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + sum(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case 4:
                        try {
                            System.out.println("Result: " + divide(num1, num2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;
                    case 5:
                        displayHistory();
                        break;
                    default:
                        System.out.println("Invalid choice! Please choose a valid operation.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.next();  // Clear invalid input
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }
}