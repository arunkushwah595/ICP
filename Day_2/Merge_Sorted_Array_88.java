package Practice;

public class Merge_Sorted_Array_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 6, 7, 0, 0, 0 };
		int[] arr2 = { 2, 5, 6 };
		int m = 4;
		int n = 3;
		merge(arr, m, arr2, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void merge(int[] arr, int m, int[] arr2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (j >= 0) {
			if (i >= 0 && arr[i] > arr2[j]) {
				arr[k--] = arr[i--];
			} else {
				arr[k--] = arr2[j--];
			}
		}

	}

}
