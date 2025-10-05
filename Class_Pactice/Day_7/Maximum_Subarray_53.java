package Day_7;

public class Maximum_Subarray_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(max_sum(nums));
	}

	public static int maxSubArray(int[] nums) {
		return max_sum(nums);
	}

	public static int max_sum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
			max = Math.max(max, s);
			if (s < 0) {
				s = 0;
			}
		}
		return max;
	}

}
