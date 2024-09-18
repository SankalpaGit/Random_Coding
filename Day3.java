import java.util.Scanner;

public class Day3 {

    // Problem 1: Function to calculate the sum of elements in an array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    // Problem 2 : Function to Reverse the string 
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }


    // Problem 3 : Function to find the largest element in array 
    public static int findLargest(int[] arr){
        int largest= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ( arr[i]> largest){
                largest=arr[i];
            }
        }
        return largest;
    }


    // Problem 4: Function to find if string is palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Problem 1 ----------------------------------------------------------------
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of array elements: " + sumArray(arr));


        // Problem 2 ----------------------------------------------------------------
        System.out.print("Enter the string to be reversed: ");
        String inputString = sc.next();
        System.out.print("The Reversed " + reverseString(inputString));


        // Problem 3 ----------------------------------------------------------------
        System.out.print(findLargest(arr));


        // Problem 4 ----------------------------------------------------------------
        System.out.print("Enter a string to check if it's a palindrome: ");
        String palindromeCheck = sc.next();
        if (isPalindrome(palindromeCheck)) {
            System.out.println(palindromeCheck + " is a palindrome.");
        } else {
            System.out.println(palindromeCheck + " is not a palindrome.");
        }

        sc.close();
    }
}
