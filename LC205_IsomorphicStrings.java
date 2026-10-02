import java.util.*;

/**
 * Problem: LeetCode 205 - Isomorphic Strings
 * Description: Given two strings s and t, determine if they are isomorphic.
 * Approach: Matching character index pattern comparison
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class LC205_IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (a.length() != b.length()) {
            System.out.println(false);
            return;
        }

        for (int i = 0; i < a.length(); i++)
            if (a.indexOf(a.charAt(i)) != b.indexOf(b.charAt(i))) {
                System.out.println(false);
                return;
            }

        System.out.println(true);
    }
}
