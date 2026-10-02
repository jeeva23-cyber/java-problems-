import java.util.*;

/**
 * Problem: LeetCode 242 - Valid Anagram
 * Description: Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Approach: Sorting character arrays
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class LC242_ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        System.out.println(Arrays.equals(x, y));
    }
}
