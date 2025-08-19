package week_two;

import java.util.*;
public class question_one {

	 // Function to compute LCS of three strings
    public static int lcsOf3(String s1, String s2, String s3) {
        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();

        // 3D DP table
        int[][][] dp = new int[n1 + 1][n2 + 1][n3 + 1];

        // Bottom-up calculation
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                for (int k = 1; k <= n3; k++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1) && s1.charAt(i - 1) == s3.charAt(k - 1)) {
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    } else {
                        dp[i][j][k] = Math.max(
                            dp[i - 1][j][k],
                            Math.max(dp[i][j - 1][k], dp[i][j][k - 1])
                        );
                    }
                }
            }
        }

        return dp[n1][n2][n3];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three strings
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();

        // Compute result
        int result = lcsOf3(s1, s2, s3);

        // Output
        System.out.println(result);
    }
}
