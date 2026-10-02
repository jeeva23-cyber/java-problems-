import java.util.*;

/**
 * Problem: LeetCode 75 - Sort Colors
 * Description: Given an array nums with n objects colored red, white, or blue, sort them in-place.
 * Approach: Sorting
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class LC75_SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        Arrays.sort(a);

        for (int x : a)
            System.out.print(x + " ");
    }
}
