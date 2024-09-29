package Day10.recursion;
import java.util.Scanner;

public class FirstTenMultiples {
    
    public static void printMultiples(int num, int count) {
        if (count > 10) {
            return; //stop the count if it reach 10
        }
        System.out.println(num * count);
        printMultiples(num, count + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" number to find the multiple of : ");
        int number = sc.nextInt();
        printMultiples(number, 1);
        sc.close();   
    }

}
