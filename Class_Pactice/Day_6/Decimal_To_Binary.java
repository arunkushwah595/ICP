package Day_6;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 89;
		System.out.println(binary(n));
	}

	public static String binary(int n) {
		if (n == 1) {
			return "1";
		}
		if (n == 0) {
			return "0";
		}
		String s = binary(n / 2);
		return s + n % 2;
	}

}
