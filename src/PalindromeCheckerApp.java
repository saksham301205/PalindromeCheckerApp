import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean recursivePalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters are not equal
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.print("Enter a word: ");
            String word = sc.nextLine();

            // Remove special characters and convert to lowercase
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            if (recursivePalindrome(word, 0, word.length() - 1)) {
                System.out.println("It is a Palindrome.");
            } else {
                System.out.println("It is NOT a Palindrome.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }
}