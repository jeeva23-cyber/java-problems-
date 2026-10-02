import java.util.*;

/**
 * Problem: LeetCode 2574 - Left and Right Sum Differences
 * Description: Find the absolute difference between the sum of elements to the left and to the right for each element.
 * Approach: Total sum with running left sum
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC2574_LeftAndRightSumDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int left = 0, total = 0;
        for (int x : a) total += x;

        for (int x : a) {
            total -= x;
            System.out.print(Math.abs(left - total) + " ");
            left += x;
        }
    }
}
