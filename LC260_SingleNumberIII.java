import java.util.*;

/**
 * Problem: LeetCode 260 - Single Number III
 * Description: Exactly two elements appear only once and all others appear twice. Find the two elements.
 * Approach: Frequency count
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class LC260_SingleNumberIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++)
                if (a[i] == a[j]) count++;

            if (count == 1)
                System.out.print(a[i] + " ");
        }
    }
}
