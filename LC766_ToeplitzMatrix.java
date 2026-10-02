import java.util.*;

/**
 * Problem: LeetCode 766 - Toeplitz Matrix
 * Description: Given an m x n matrix, return true if every diagonal from top-left to bottom-right has identical elements.
 * Approach: Adjacent diagonal cell verification (a[i][j] == a[i+1][j+1])
 * Time Complexity: O(r * c)
 * Space Complexity: O(r * c)
 */
public class LC766_ToeplitzMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r - 1; i++)
            for (int j = 0; j < c - 1; j++)
                if (a[i][j] != a[i + 1][j + 1]) {
                    System.out.println("false");
                    return;
                }

        System.out.println("true");
    }
}
