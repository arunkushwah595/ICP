package Day_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 2 };
		Arrays.sort(arr);
		List<Integer> ll = new ArrayList<Integer>();
		List<List<Integer>> nl = new ArrayList<List<Integer>>();
		print(arr, 0, ll, nl);
		System.out.println(nl);
	}

	public static void print(int[] arr, int i, List<Integer> ll, List<List<Integer>> nl) {
		if (i == arr.length) {
			if (!nl.contains(ll))
				nl.add(new ArrayList<Integer>(ll));
			return;
		}
		print(arr, i + 1, ll, nl);
		ll.add(arr[i]);
		print(arr, i + 1, ll, nl);
		ll.remove(ll.size() - 1);
	}
}
