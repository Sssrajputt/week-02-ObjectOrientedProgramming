import java.util.*;

// Creating a class PalindromeChecker
class Palindrome {
    String text;

    // Creating a constructor
    public Palindrome(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean ifPalindrome() {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }

    // Method to display the result
    public void display() {
        if (ifPalindrome()) {
            System.out.println("Is palindrome: " + text);
        } else {
            System.out.println("Not palindrome: " + text);
        }
    }
}

public class PalindromeChecker {
    public static void main(String args[]) {
        // Creating Scanner class object for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text to check if it is a palindrome:");
        String text = input.nextLine();
        
        // Creating PalindromeChecker class object
        Palindrome palindromeChecker = new Palindrome(text);
        
        // Displaying the result
        palindromeChecker.display();
    }
}
