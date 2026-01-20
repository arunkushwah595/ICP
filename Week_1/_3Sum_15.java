package Week_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(nums));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums); // Sort the arr

		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) { // here we will ignore if there are same values
				continue;
			}

			int j = i + 1;
			int k = nums.length - 1;

			// Now we we'll check in the range [i+1, last index]
			while (j < k) {
				int total = nums[i] + nums[j] + nums[k];

				if (total > 0) { // if total >0 so we'll remove last index(larger element)
					k--;
				} else if (total < 0) { // total <0 so we'll remove jth idx and add next which is larger than of jth idx
					j++;
				} else { // if total ==0 we'll add in a list
					res.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					// here we'll ignore same values
					while (nums[j] == nums[j - 1] && j < k) {
						j++;
					}
				}
			}
		}
		return res;
	}

}
