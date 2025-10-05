package Day_7;

import java.util.*;

public class Generate_Parentheses_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(generateParenthesis(n));
	}

	public static List<String> generateParenthesis(int n) {
		List<String> ll = new ArrayList<String>();
		generate(n, 0, 0, "", ll);
		return ll;
	}

	private static void generate(int n, int open, int close, String ans, List<String> ll) {
		// TODO Auto-generated method stub
		if (open == n && close == n) {
			ll.add(ans);
			return;
		}
		if (close > open || open > n) {
			return;
		}
		
		generate(n, open + 1, close, ans + "(", ll);
		generate(n, open, close + 1, ans + ")", ll);

	}

}
