package Day_7;

import java.util.Arrays;

public class House_Robber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 7, 9, 3, 1 };
		System.out.println(rob(nums));
	}

	public static int rob(int[] nums) {
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
		return Robber(nums, dp, 0);
	}

	public static int Robber(int[] arr, int[] dp, int i) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + Robber(arr, dp, i + 2);
		int Dont_rob = Robber(arr, dp, i + 1);
		return dp[i] = Math.max(rob, Dont_rob);
	}

}
