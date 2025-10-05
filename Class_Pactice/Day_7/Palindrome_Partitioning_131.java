package Day_7;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning_131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abacab";
		System.out.println(partition(s));
	}

	public static List<List<String>> partition(String s) {
		List<String> ll = new ArrayList<String>();
		List<List<String>> nl = new ArrayList<List<String>>();
		palindrome_partition(s, ll, nl);
		return nl;
	}

	public static void palindrome_partition(String ques, List<String> ll, List<List<String>> nl) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			nl.add(new ArrayList<String>(ll));
			return;
		}
		for (int cut = 1; cut <= ques.length(); cut++) {
			String s = ques.substring(0, cut);
			if (isPalindrome(s)) {
				ll.add(s);
				palindrome_partition(ques.substring(cut), ll, nl);
				ll.remove(ll.size() - 1);
			}
		}

	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
