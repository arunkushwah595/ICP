package Day_10;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queues_225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack st = new MyStack();
		st.push(4);
		System.out.println(st.empty());
		System.out.println(st.pop());
	}

	static class MyStack {

		private Queue<Integer> q;

		public MyStack() {
			q = new LinkedList<>();
		}

		public void push(int x) {
			q.add(x);
			for (int i = 0; i < q.size() - 1; i++) {
				q.add(q.poll());
			}
		}

		public int pop() {
			return q.poll();
		}

		public int top() {
			return q.peek();
		}

		public boolean empty() {
			return q.isEmpty();
		}
	}

}
