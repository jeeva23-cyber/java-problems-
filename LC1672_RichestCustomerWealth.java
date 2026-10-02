import java.util.*;

/**
 * Problem: LeetCode 1672 - Richest Customer Wealth
 * Description: Return the wealth that the richest customer has.
 * Approach: Row sum calculation and maximum tracking
 * Time Complexity: O(r * c)
 * Space Complexity: O(1)
 */
public class LC1672_RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int max = 0;

        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++)
                sum += sc.nextInt();
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
