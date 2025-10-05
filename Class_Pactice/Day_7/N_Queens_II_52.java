package Day_7;

public class N_Queens_II_52 {

	public static void main(String[] args) {
		int n = 4;
		boolean[][] board = new boolean[n][n];

		System.out.println(print(board, 0, n));
	}

	public static int print(boolean[][] board, int row, int tq) {
		if (tq == 0) {
			return 1;
		}
		int a = 0;
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				a += print(board, row + 1, tq - 1);
				board[row][col] = false;

			}
		}
		return a;
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		// up
		int r = row;
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}
		// diagonal--> up-right
		r = row;
		int c = col;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}

		// diagonal---> up-left
		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		return true;

	}
}
