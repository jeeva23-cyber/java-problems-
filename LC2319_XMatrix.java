import java.util.*;

/**
 * Problem: LeetCode 2319 - Check if Matrix Is X-Matrix
 * Description: A square matrix is an X-Matrix if all diagonal elements are non-zero and other elements are 0.
 * Approach: Check diagonal conditions (i == j || i + j == n - 1)
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class LC2319_XMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean valid = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (i == j || i + j == n - 1) {
                    if (x == 0) valid = false;
                } else {
                    if (x != 0) valid = false;
                }
            }
        }

        System.out.println(valid);
    }
}
