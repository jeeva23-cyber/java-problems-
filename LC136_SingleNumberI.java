import java.util.*;

/**
 * Problem: LeetCode 136 - Single Number
 * Description: Every element appears twice except for one. Find that single one.
 * Approach: Bitwise XOR (a ^ a = 0, a ^ 0 = a)
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LC136_SingleNumberI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;

        for (int i = 0; i < n; i++)
            ans ^= sc.nextInt();

        System.out.println(ans);
    }
}
