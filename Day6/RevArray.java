package Day6;
import java.util.Scanner;

public class RevArray {

    public static void ReverseArray( int[] arr, int start , int end ) {

        if (start > end) {
            return; //Base case: all elements have been reversed
        }

        //Swapping the element

        int temp= arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        ReverseArray(arr, start +1, end -1);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ReverseArray(arr, 0, size - 1);
        System.out.println("Array after reversing:");
        printArray(arr);

        sc.close(); //close the scanner 
    }

}
