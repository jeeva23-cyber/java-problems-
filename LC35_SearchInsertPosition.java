import java.util.*;

/**
 * Problem: LeetCode 35 - Search Insert Position
 * Description: Given a sorted array of distinct integers and a target value, return the index if target is found or where it would be inserted.
 * Approach: Linear Scan
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC35_SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int target = sc.nextInt();

        for (int i = 0; i < n; i++)
            if (a[i] >= target) {
                System.out.println(i);
                return;
            }

        System.out.println(n);
    }
}
