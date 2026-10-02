import java.util.*;

/**
 * Problem: LeetCode 28 - Find the Index of the First Occurrence in a String
 * Description: Given two strings needle and haystack, return the index of the first occurrence of needle in haystack.
 * Approach: String indexOf substring search
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 */
public class LC28_FindFirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        System.out.println(a.indexOf(b));
    }
}
