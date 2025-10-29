package Day_10;

import java.util.ArrayList;

public class Min_Stack_155 {

	class MinStack {
		ArrayList<int[]> ll;

		public MinStack() {
			ll = new ArrayList<>();
		}

		public void push(int val) {
			if (ll.isEmpty()) {
				ll.add(new int[] { val, val });
			} else {
				int min = ll.get(ll.size() - 1)[1];
				if (min > val) {
					min = val;
				}
				ll.add(new int[] { val, min });
			}
		}

		public void pop() {
			ll.remove(ll.size() - 1);
		}

		public int top() {
			return ll.get(ll.size() - 1)[0];
		}

		public int getMin() {
			return ll.get(ll.size() - 1)[1];
		}
	}

	/**
	 * Your MinStack object will be instantiated and called as such: MinStack obj =
	 * new MinStack(); obj.push(val); obj.pop(); int param_3 = obj.top(); int
	 * param_4 = obj.getMin();
	 */

}
