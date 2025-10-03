package Day_6;

public class Inorder_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		print(n);
	}

	public static void print(int n) {
		if (n == 0) {
			return;
		}
		print(n - 1);
		System.out.print(n + " ");
		print(n - 1);
	}

}
