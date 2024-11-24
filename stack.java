import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Search");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push
                    System.out.print("Enter a number to push onto the stack: ");
                    int number = scanner.nextInt();
                    stack.push(number);
                    System.out.println(number + " pushed onto the stack.");
                    break;

                case 2: // Pop
                    if (!stack.isEmpty()) {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty. Nothing to pop.");
                    }
                    break;

                case 3: // Peek
                    if (!stack.isEmpty()) {
                        System.out.println("Top element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty. Nothing to peek.");
                    }
                    break;

                case 4: // Search
                    System.out.print("Enter a number to search in the stack: ");
                    int searchElement = scanner.nextInt();
                    int position = stack.search(searchElement);
                    if (position != -1) {
                        System.out.println(searchElement + " found at position: " + position);
                    } else {
                        System.out.println(searchElement + " not found in the stack.");
                    }
                    break;

                case 5: // Display Stack
                    System.out.println("Current Stack: " + stack);
                    break;

                case 6: // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
