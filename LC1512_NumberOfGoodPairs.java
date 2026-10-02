import java.util.*;

/**
 * Problem: LeetCode 1512 - Number of Good Pairs
 * Description: Given an array of integers nums, return the number of good pairs (nums[i] == nums[j] and i < j).
 * Approach: Nested Loops Comparison
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class LC1512_NumberOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (a[i] == a[j]) count++;

        System.out.println(count);
    }
}
