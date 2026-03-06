import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String str) {

        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

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
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        PalindromeChecker checker = new PalindromeChecker();

        do {

            System.out.print("Enter a word: ");
            String word = sc.nextLine();

            if (checker.checkPalindrome(word)) {
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