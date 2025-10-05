package Day_7;

import java.util.Arrays;

public class Unique_Path_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 3, n = 7;
		System.out.println(uniquePaths(m, n));
	}

	public static int uniquePaths(int m, int n) {
		int[][] dp = new int[m][n];
		for (int[] arr : dp) {
			Arrays.fill(arr, -1);
		}
		return Print(0, 0, m - 1, n - 1, dp);
	}

	public static int Print(int cr, int cc, int er, int ec, int[][] dp) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (dp[cr][cc] != -1) {
			return dp[cr][cc];
		}
		int a = Print(cr + 1, cc, er, ec, dp); // Vertically
		int b = Print(cr, cc + 1, er, ec, dp); // Horizontally
		return dp[cr][cc] = (a + b);
	}

}
