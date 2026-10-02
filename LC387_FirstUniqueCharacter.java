import java.util.*;

/**
 * Problem: LeetCode 387 - First Unique Character in a String
 * Description: Given a string s, find the first non-repeating character in it and return its index.
 * Approach: First and last index comparison
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class LC387_FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
