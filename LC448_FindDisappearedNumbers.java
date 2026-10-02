import java.util.*;

/**
 * Problem: LeetCode 448 - Find All Numbers Disappeared in an Array
 * Description: Given an array nums of n integers in range [1, n], return an array of all integers in [1, n] that do not appear.
 * Approach: Boolean presence tracking array
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC448_FindDisappearedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] seen = new boolean[n + 1];

        for (int i = 0; i < n; i++)
            seen[sc.nextInt()] = true;

        for (int i = 1; i <= n; i++)
            if (!seen[i]) System.out.print(i + " ");
    }
}
