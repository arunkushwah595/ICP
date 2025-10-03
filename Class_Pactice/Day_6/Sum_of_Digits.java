package Day_6;

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		System.out.println(sum(n));
	}

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		int sum = n % 10 + sum(n / 10);
		return sum;
	}

}
