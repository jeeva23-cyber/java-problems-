import java.util.*;

/**
 * Problem: LeetCode 1389 - Create Target Array in the Given Order
 * Description: Given two arrays nums and index, create target array by inserting nums[i] at index[i].
 * Approach: List insertion at index
 * Time Complexity: O(n^2)
 * Space Complexity: O(n)
 */
public class LC1389_CreateTargetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            a.add(sc.nextInt(), nums[i]);

        for (int x : a) System.out.print(x + " ");
    }
}
