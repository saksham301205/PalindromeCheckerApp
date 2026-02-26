import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker Application");
        Scanner sc = new Scanner(System.in);

        char choice;

        do {
            System.out.println("Enter a word:");
            String word = sc.nextLine();

            // UC8 - Empty check
            if (word.trim().isEmpty()) {
                System.out.println("Input cannot be empty!");
                continue;
            }

            if (checkPalindrome(word)) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is not a Palindrome");
            }

            System.out.println("Do you want to continue? (y/n)");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'y' || choice == 'Y');

        sc.close();
    }

    // UC4 + UC7
    public static boolean checkPalindrome(String word) {

        // UC4 - Remove special characters & spaces
        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}