package Day_7;

import java.util.*;

public class N_Queens_51 {

	public static void main(String[] args) {
		int n = 4;
		List<String> ll = new ArrayList<>();
		List<List<String>> nl = new ArrayList<>();
		boolean[][] board = new boolean[n][n];
		print(board, 0, n, ll, nl);
		System.out.println(nl);
	}

	public static void print(boolean[][] board, int row, int tq, List<String> ll, List<List<String>> nl) {
		if (tq == 0) {
			Display(board, ll, 0, nl);
			return;
		}
		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				print(board, row + 1, tq - 1, ll, nl);
				board[row][col] = false;
			}
		}
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

	public static void Display(boolean[][] arr, List<String> ll, int i, List<List<String>> nl) {
		if (i == arr.length) {
			nl.add(new ArrayList<String>(ll));
			return;
		}
		String ans = "";
		for (int j = 0; j < arr[0].length; j++) {
			if (arr[i][j]) {
				ans += "Q";
			} else {
				ans += ".";
			}
		}
		ll.add(ans);
		Display(arr, ll, i + 1, nl);
		ll.remove(ll.size() - 1);
	}
}
