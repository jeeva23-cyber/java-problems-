import java.util.*;

/**
 * Problem: LeetCode 1365 - How Many Numbers Are Smaller Than the Current Number
 * Description: For each nums[i] find out how many numbers in the array are smaller than it.
 * Approach: Brute Force Nested Comparison
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class LC1365_SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (a[j] < a[i]) count++;
            System.out.print(count + " ");
        }
    }
}
