package Practice;

public class Valid_Perfect_Square_367 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 196;
		System.out.println(isPerfectSqare(n));
	}

	public static boolean isPerfectSqare(int n) {
		int lo = 0;
		int hi = n;
		while (lo <= hi) {
			int mid = hi + (lo - hi) / 2;
			if (Math.pow(mid, 2) < n) {
				lo = mid + 1;
			}

			else if (Math.pow(mid, 2) == n) {
				return true;
			}

			else {
				hi = mid - 1;
			}
		}

		return false;
	}

}
