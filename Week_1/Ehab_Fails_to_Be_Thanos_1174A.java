package Week_1;

import java.util.Arrays;
import java.util.Scanner;

public class Ehab_Fails_to_Be_Thanos_1174A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[2 * n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long sum = 0;
		long s = 0;
		for (int i = 0; i < n; i++) {
			if (i >= 0 && i < n) {
				s += arr[i];
				sum += arr[i + n];
			}
		}
		if (s == sum) {
			System.out.println(-1);
			return;
		}
		Display(arr);
	}

	private static void Display(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
