import java.util.*;

/**
 * Problem: LeetCode 1920 - Build Array from Permutation
 * Description: Given a zero-based permutation nums, build an array ans where ans[i] = nums[nums[i]].
 * Approach: Direct permutation indexing
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC1920_BuildArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            System.out.print(a[a[i]] + " ");
    }
}
