import java.util.*;

/**
 * Problem: LeetCode 137 - Single Number II
 * Description: Every element appears three times except for one, which appears exactly once. Find that single one.
 * Approach: Frequency count
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class LC137_SingleNumberII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int x : a) {
            int count = 0;
            for (int y : a)
                if (x == y) count++;

            if (count == 1) {
                System.out.println(x);
                return;
            }
        }
    }
}
