import java.util.*;

/**
 * Problem: LeetCode 268 - Missing Number
 * Description: Given an array nums containing n distinct numbers in range [0, n], return the only number missing from the range.
 * Approach: Gauss Formula / Arithmetic Series Sum Difference
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LC268_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++)
            sum -= sc.nextInt();

        System.out.println(sum);
    }
}
