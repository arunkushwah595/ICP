package Day_1;

public class Count_Set_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		System.out.println(countSetBits(i));
	}

	static int countSetBits(int n) {
		int count = 0;
		while (n > 0) {
			n &= (n - 1);
			count++;
		}
		return count;
	}

}
