import java.util.*;

/**
 * Problem: LeetCode 6 - Zigzag Conversion
 * Description: Convert string into zigzag pattern on a given number of rows and read row by row.
 * Approach: Direction-controlled row array buffering
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC6_ZigzagConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        if (n == 1 || n >= s.length()) {
            System.out.println(s);
            return;
        }

        String[] rows = new String[n];
        for (int i = 0; i < n; i++) rows[i] = "";

        int row = 0;
        boolean down = true;

        for (char c : s.toCharArray()) {
            rows[row] += c;

            if (row == 0) down = true;
            if (row == n - 1) down = false;

            row += down ? 1 : -1;
        }

        for (String x : rows)
            System.out.print(x);
    }
}
