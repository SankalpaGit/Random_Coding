package Day10.recursion;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    
    public static void countCharacters(String word, HashMap<Character, Integer> frequencyMap, int index){

        //Base Case 
        if (index == word.length()){
            return;
        }

        // Get the curret character
        char currentChar= word.charAt(index);

        // Update the currwnt frequency 
        frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0)+1) ;

        // Recursive case
        countCharacters(word, frequencyMap, index+1);
    }   

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        countCharacters(word, frequencyMap, 0);

        System.out.println("Character Frequencies:");
        for (char c : frequencyMap.keySet()) {
            System.out.println(c + ": " + frequencyMap.get(c));
        }
        
        sc.close();
    }
}
