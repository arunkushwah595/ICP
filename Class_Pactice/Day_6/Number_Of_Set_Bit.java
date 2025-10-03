package Day_6;

public class Number_Of_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(count(n));
	}

	public static int count(int n) {
		if (n == 0) {
			return 0;
		}
		return 1 + count(n & (n - 1));

	}

}
