// Day5.java

import java.util.Scanner;

public class Day5 {

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Linear Search Algorithm
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index of the target element
            }
        }
        return -1; // Target not found
    }

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

    // Utility function to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array for Sorting and Searching
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Bubble Sort
        bubbleSort(arr);
        System.out.println("Array after Bubble Sort:");
        printArray(arr);

        // 2. Selection Sort
        selectionSort(arr);
        System.out.println("Array after Selection Sort:");
        printArray(arr);

        // 3. Linear Search
        System.out.print("Enter a number to search using Linear Search: ");
        int target = sc.nextInt();
        int linearResult = linearSearch(arr, target);
        if (linearResult != -1) {
            System.out.println("Element found at index (Linear Search): " + linearResult);
        } else {
            System.out.println("Element not found (Linear Search).");
        }

        // 4. Binary Search (Array must be sorted, and already sorted by Selection Sort above)
        System.out.print("Enter a number to search using Binary Search: ");
        int binaryTarget = sc.nextInt();
        int binaryResult = binarySearch(arr, binaryTarget);
        if (binaryResult != -1) {
            System.out.println("Element found at index (Binary Search): " + binaryResult);
        } else {
            System.out.println("Element not found (Binary Search).");
        }
    }
}
