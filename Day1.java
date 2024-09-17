// Day1.java

public class Day1 {

    // Entry point of the program
    public static void main(String[] args) {
        // 1. Print "Hello, World!"
        System.out.println("Hello, World!");
        
        // 2. Basic Arithmetic Operations
        int num1 = 10;
        int num2 = 5;
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        
        // 3. Check if a number is even or odd
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        // 4. Simple Calculator
        int a = 20;
        int b = 4;
        char operator = '+';
        switch (operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                System.out.println("Division: " + (a / b));
                break;
            default:
                System.out.println("Invalid operator");
        }
        
        // 5. Find the Largest of Three Numbers
        int numx = 12, numy = 25, num3 = 9;
        int largest;
        if (numx >= numy && numx >= num3) {
            largest = numx;
        } else if (numy >= numx && numy >= num3) {
            largest = numy;
        } else {
            largest = num3;
        }
        System.out.println("The largest number is " + largest);

        // 6. Loops
        // For loop example
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // While loop example
        System.out.println("While Loop:");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
