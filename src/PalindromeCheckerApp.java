import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Algorithm 1: Two Pointer
    public static boolean twoPointerPalindrome(String str) {

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

    // Algorithm 2: Stack
    public static boolean stackPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Two Pointer timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(word);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(word);
        long end2 = System.nanoTime();

        System.out.println("\nTwo Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nStack Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        sc.close();
    }
}