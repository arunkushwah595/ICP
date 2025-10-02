package Day_3;

public class Traversals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		RowWise_Traversal(arr);
		ColumnWise_Traversal(arr);
		Diagonal_Traversal(arr);
		Reverse_Traversal(arr);
		Spiral_print(arr);
	}

	public static void RowWise_Traversal(int[][] arr) {
		System.out.println("RowWise Traversal");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void ColumnWise_Traversal(int[][] arr) {
		System.out.println("ColumnWise Traversal");
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void Diagonal_Traversal(int[][] arr) {
		int n = arr.length;

		System.out.println("Primary Diagonal");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i == j) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("Secondary Diagonal");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i + j == n - 1) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
	}

	public static void Reverse_Traversal(int[][] arr) {
		System.out.println("RowWise Traversal");
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[0].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void Spiral_print(int[][] arr) {
		System.out.println("Spiral Traversal");

		int minc = 0;
		int minr = 0;
		int maxc = arr[0].length - 1;
		int maxr = arr.length - 1;
		int t = arr.length * arr[0].length;

		while (t > 0) {

			for (int i = minc; i <= maxc; i++) {
				System.out.print(arr[minr][i] + "-->");
				t--;
			}
			minr++;

			for (int i = minr; i <= maxr; i++) {
				System.out.print(arr[i][maxc] + "-->");
				t--;
			}
			maxc--;

			for (int i = maxc; i >= minc; i--) {
				System.out.print(arr[maxr][i] + "-->");
				t--;
			}
			maxr--;

			for (int i = maxr; i >= minr; i--) {
				System.out.print(arr[i][minc] + "-->");
				t--;
			}
			minc++;

		}
		System.out.println();
	}

}
