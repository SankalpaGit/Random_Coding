package Day6;
import java.util.Scanner;

public class BinarySearch {

    // Binary Search Algorithm (Array must be sorted)
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define and initialize the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " sorted integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Perform Binary Search
        System.out.print("Enter a number to search using Binary Search: ");
        int binaryTarget = sc.nextInt();
        int binaryResult = binarySearch(arr, binaryTarget);
        if (binaryResult != -1) {
            System.out.println("Element found at index (Binary Search): " + binaryResult);
        } else {
            System.out.println("Element not found (Binary Search).");
        }
    
        sc.close(); 
    
    }
}
