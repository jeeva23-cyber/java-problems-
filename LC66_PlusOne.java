import java.util.*;

/**
 * Problem: LeetCode 66 - Plus One
 * Description: Increment the large integer represented as an array of digits by one.
 * Approach: Backward scan with carry
 * Time Complexity: O(n)
 * Space Complexity: O(1) (or O(n) if all digits are 9)
 */
public class LC66_PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < 9) {
                a[i]++;
                for (int x : a) System.out.print(x + " ");
                return;
            }
            a[i] = 0;
        }

        System.out.print("1 ");
        for (int i = 0; i < n; i++) System.out.print("0 ");
    }
}
