import java.util.*;

/**
 * Problem: LeetCode 1475 - Final Prices With a Special Discount in a Shop
 * Description: Receive a discount equivalent to prices[j] where j > i is the first index with prices[j] <= prices[i].
 * Approach: Nested loop search for first smaller or equal element
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class LC1475_FinalPricesWithSpecialDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (a[j] <= a[i]) {
                    a[i] -= a[j];
                    break;
                }

        for (int x : a) System.out.print(x + " ");
    }
}
