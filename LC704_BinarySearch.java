import java.util.*;

/**
 * Problem: LeetCode 704 - Binary Search
 * Description: Given an array of integers nums which is sorted in ascending order, search target in nums.
 * Approach: Two-pointer Binary Search
 * Time Complexity: O(log n)
 * Space Complexity: O(n)
 */
public class LC704_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int target = sc.nextInt();

        int l = 0, r = n - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (a[m] == target) {
                System.out.println(m);
                return;
            }

            if (a[m] < target) l = m + 1;
            else r = m - 1;
        }

        System.out.println(-1);
    }
}
