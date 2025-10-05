package Day_7;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		System.out.println(subsets(nums));
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<Integer> ll = new ArrayList<Integer>();
		List<List<Integer>> nl = new ArrayList<List<Integer>>();
		print(nums, 0, ll, nl);
		return nl;
	}

	public static void print(int[] arr, int i, List<Integer> ll, List<List<Integer>> nl) {
		nl.add(new ArrayList<Integer>(ll));
		for (int j = i; j < arr.length; j++) {
			ll.add(arr[j]);
			print(arr, j + 1, ll, nl);
			ll.remove(ll.size() - 1);
		}
	}

}
