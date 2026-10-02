import java.util.*;

/**
 * Problem: LeetCode 217 - Contains Duplicate
 * Description: Given an integer array nums, return true if any value appears at least twice.
 * Approach: HashSet
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC217_ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (!set.add(x)) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
