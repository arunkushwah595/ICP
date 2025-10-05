package Day_7;

public class Power_of_Two_231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 32;
		System.out.println(isPowerOfTwo(n));
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 1) {
			return true;
		}
		if (n % 2 == 1 || n < 1) {
			return false;
		}
		return isPowerOfTwo(n / 2);
	}

}
