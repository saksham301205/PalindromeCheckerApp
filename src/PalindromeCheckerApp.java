import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Application");
        Scanner sc = new Scanner(System.in);

        char choice;

        do {
            System.out.println("Enter a word:");
            String word = sc.nextLine();
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            boolean isPalindrome = true;

            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
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
}
