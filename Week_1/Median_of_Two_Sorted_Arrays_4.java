package Week_1;

public class Median_of_Two_Sorted_Arrays_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { -2, -2, -1, 0, 1, 3, 4, 6, 7 };
		int[] nums2 = { -1, -1, 2, 3, 4, 5, 8 };
		for (int i : merge(nums1, nums2)) {
			System.out.print(i + " ");
		}
		System.out.println("\n" + findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double med = 0;
		int[] arr = merge(nums1, nums2);
		int n = nums1.length + nums2.length; // total no. of elements

		// for odd no. of elements
		if (n % 2 != 0) {
			int idx = (n + 1) / 2;
			med = arr[idx - 1];
		}

		// for even no. of elements
		else {
			int idx = n / 2;
			int f = arr[idx - 1];
			int s = arr[idx];
			med = (double) (f + s) / 2;
		}
		return med;
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] arr = new int[arr1.length + arr2.length];
		int i = arr1.length - 1; // last idx of arr1
		int j = arr2.length - 1; // last idx of arr2
		int k = arr.length - 1; // last idx of merged arr

		// now putting elements in arr from the last index from arr1 and arr2
		while (i >= 0 && j >= 0) {
			if (arr1[i] > arr2[j]) {
				arr[k--] = arr1[i--];
			} else if (j >= 0) {
				arr[k--] = arr2[j--];
			}
		}

		// arr2 is Empty but arr1 is not
		while (i >= 0) {
			arr[k--] = arr1[i--];
		}

		// arr1 is empty and arr2 is not
		while (j >= 0) {
			arr[k--] = arr2[j--];
		}
		return arr;
	}
}
