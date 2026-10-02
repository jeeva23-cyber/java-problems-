import java.util.*;

/**
 * Problem: LeetCode 169 - Majority Element
 * Description: Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than floor(n / 2) times.
 * Approach: Boyer-Moore Voting Algorithm
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class LC169_MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (count == 0) ans = x;
            count += (x == ans) ? 1 : -1;
        }

        System.out.println(ans);
    }
}
