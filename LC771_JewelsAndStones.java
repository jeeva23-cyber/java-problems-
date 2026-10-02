import java.util.*;

/**
 * Problem: LeetCode 771 - Jewels and Stones
 * Description: Given jewels and stones strings, count how many stones you have that are also jewels.
 * Approach: Character containment check
 * Time Complexity: O(j * s)
 * Space Complexity: O(1)
 */
public class LC771_JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.next();
        String stones = sc.next();
        int count = 0;

        for (char s : stones.toCharArray())
            if (jewels.indexOf(s) >= 0) count++;

        System.out.println(count);
    }
}
