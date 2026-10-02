import java.util.*;

/**
 * Problem: LeetCode 867 - Transpose Matrix
 * Description: Given a 2D integer array matrix, return the transpose of matrix.
 * Approach: Swapping rows and columns
 * Time Complexity: O(r * c)
 * Space Complexity: O(r * c)
 */
public class LC867_TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
