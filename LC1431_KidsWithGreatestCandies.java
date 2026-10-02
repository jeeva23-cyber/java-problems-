import java.util.*;

/**
 * Problem: LeetCode 1431 - Kids With the Greatest Number of Candies
 * Description: Check if giving extraCandies makes that kid have the greatest candies among all kids.
 * Approach: Find max and compare (candy + extra >= max)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC1431_KidsWithGreatestCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int extra = sc.nextInt();
        int max = Arrays.stream(a).max().getAsInt();

        for (int x : a)
            System.out.print((x + extra >= max) + " ");
    }
}
