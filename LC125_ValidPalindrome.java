import java.util.*;

/**
 * Problem: LeetCode 125 - Valid Palindrome
 * Description: Check if string is palindrome considering only alphanumeric characters and ignoring cases.
 * Approach: Regex sanitization and StringBuilder reverse
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC125_ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String r = new StringBuilder(s).reverse().toString();

        System.out.println(s.equals(r));
    }
}
