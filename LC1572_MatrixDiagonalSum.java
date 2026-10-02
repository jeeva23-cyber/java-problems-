import java.util.*;

/**
 * Problem: LeetCode 1572 - Matrix Diagonal Sum
 * Description: Given a square matrix mat, return the sum of the matrix diagonals.
 * Approach: Diagonal index checking (primary and secondary diagonal)
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */
public class LC1572_MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (i == j || i + j == n - 1)
                    sum += x;
            }

        System.out.println(sum);
    }
}
