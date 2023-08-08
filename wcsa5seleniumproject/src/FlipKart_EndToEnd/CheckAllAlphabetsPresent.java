package FlipKart_EndToEnd;
import java.util.*;

public class CheckAllAlphabetsPresent {
    // Function to check if a character is a letter of the English alphabet (a-z or A-Z)
    public static boolean isAlphabet(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // Function to check if all letters from a to z are present in the input string
    public static boolean allAlphabetsPresent(String str) {
        // Create a HashSet to store the letters found in the string
        Set<Character> lettersFound = new HashSet<>();

        // Iterate through the string and add letters to the HashSet
        for (char c : str.toCharArray()) {
            if (isAlphabet(c)) {
                lettersFound.add(Character.toLowerCase(c));
            }
        }

        // Check if all letters from a to z are present in the HashSet
        for (char c = 'a'; c <= 'z'; c++) {
            if (!lettersFound.contains(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        
        String inputString = scanner.nextLine();

        boolean result = allAlphabetsPresent(inputString);

        System.out.println("Result: " + result);
    }
}

