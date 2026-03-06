import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {

            System.out.print("Enter a word: ");
            String word = sc.nextLine();

            if (checkPalindromeUsingDeque(word)) {
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

    public static boolean checkPalindromeUsingDeque(String word) {

        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }
}