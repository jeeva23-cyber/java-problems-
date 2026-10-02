import java.util.*;

/**
 * Problem: LeetCode 263 - Ugly Number
 * Description: An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Approach: Repeated division by prime factors 2, 3, 5
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class LC263_UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(false);
            return;
        }

        int[] p = {2, 3, 5};

        for (int x : p)
            while (n % x == 0)
                n /= x;

        System.out.println(n == 1);
    }
}
