package Day_8;

import java.util.Arrays;

public class Climbing_Stairs_II_746 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cost = { 10, 15, 20 };
		System.out.println(minCostClimbingStairs(cost));
	}

	public static int minCostClimbingStairs(int[] costs) {
		int[] dp = new int[costs.length];
		Arrays.fill(dp, -1);
		return Math.min(climb(costs, 0, dp), climb(costs, 1, dp));
	}

	public static int climb(int[] costs, int i, int[] dp) {
		if (i >= costs.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int f = costs[i] + climb(costs, i + 1, dp);
		int s = costs[i] + climb(costs, i + 2, dp);

		return dp[i] = Math.min(f, s);
	}

}
