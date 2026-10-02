import java.util.*;

/**
 * Problem: LeetCode 1108 - Defanging an IP Address
 * Description: Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * Approach: String replacement
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class LC1108_DefangingIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();

        System.out.println(ip.replace(".", "[.]"));
    }
}
