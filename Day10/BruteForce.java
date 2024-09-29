package Day10;

public class BruteForce {
    
    public static int findMax(int [] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Max  value in the array is : "+ findMax(array));

    }
}
