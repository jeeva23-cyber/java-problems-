import java.util.*;

/**
 * Problem: LeetCode 58 - Length of Last Word
 * Description: Given a string s consisting of words and spaces, return the length of the last word.
 * Approach: Backward pointer traversal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LC58_LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ' ') i--;

        System.out.println(s.length() - i - 1);
    }
}
