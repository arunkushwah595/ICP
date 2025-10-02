package Day_3;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = { 2, 1, 5, 6, 2, 3 };
		System.out.println(Largest_Histogram(heights));
	}

	public static int Largest_Histogram(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					ans = Math.max(ans, h * r);
				} else {
					int l = arr[st.peek()];
					int w = r - l - 1;
					ans = Math.max(ans, h * w);
				}
			}
			st.push(i);
		}

		int r = arr.length;
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			if (st.isEmpty()) {
				ans = Math.max(ans, h * r);
			} else {
				int l = arr[st.peek()];
				int w = r - l - 1;
				ans = Math.max(ans, h * w);
			}
		}
		return ans;
	}

}
