import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static boolean checkPalindrome(String str) {

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
        char choice;

        do {

            System.out.print("Enter a word: ");
            String word = sc.nextLine();

            // Normalize string (ignore spaces and case)
            word = word.replaceAll("\\s+", "").toLowerCase();

            if (checkPalindrome(word)) {
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