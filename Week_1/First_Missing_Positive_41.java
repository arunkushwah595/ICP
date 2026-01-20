package Week_1;

public class First_Missing_Positive_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 4, -1, 1 };
		System.out.println(firstMissingPositive(nums));
	}

	public static int firstMissingPositive(int[] nums) {
		int n = nums.length;

		// jo value <=0 hai ya fir >n hai use n+1 rakh denge kyuki in worst case ans
		// will be n+1
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] <= 0 || nums[i] > n) {
				nums[i] = n + 1;
			}
		}

		// yha ham us index ki value ko negative kar rhe hai jo arr me present hai. jo
		// value missing hai wo index positve rhengi
		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]);
			if (val > 0 && val <= n) {
				int idx = val - 1;
				nums[idx] = -Math.abs(nums[idx]);
			}
		}

		// jis index ki value positive hai wahi index first missing number hoga
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				return i + 1;
			}
		}
		return n + 1;
	}
}
