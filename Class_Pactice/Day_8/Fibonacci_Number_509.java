package Day_8;

import java.util.Arrays;

public class Fibonacci_Number_509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fib(n));
	}

	public static int fib(int n) {
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		return fibo(n, dp);
	}

	public static int fibo(int n, int[] dp) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		int f1 = fibo(n - 1, dp);
		int f2 = fibo(n - 2, dp);
		return dp[n] = (f1 + f2);
	}

}
