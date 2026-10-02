import java.util.*;

/**
 * Problem: LeetCode 1480 - Running Sum of 1d Array
 * Description: Given an array nums, return the running sum of nums.
 * Approach: Prefix Sum / Cumulative Sum
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LC1480_RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
            System.out.print(sum + " ");
        }
    }
}
