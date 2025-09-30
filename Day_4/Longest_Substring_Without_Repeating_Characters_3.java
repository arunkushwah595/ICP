package Day_4;

import java.util.ArrayList;

public class Longest_Substring_Without_Repeating_Characters_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bsabb";
		System.out.println(length(s));
	}

	public static int length(String s) {
		ArrayList<Character> ll = new ArrayList<Character>();
		int si = 0, ei = 0, len = 0;
		while (ei < s.length()) {
			if (!ll.contains(s.charAt(ei))) {
				ll.add(s.charAt(ei));
				len = Math.max(ei - si + 1, len);
				ei++;
			} else {
				while (si <= ei && ll.contains(s.charAt(ei))) {
					ll.remove(0);
					si++;
				}
			}
		}
		return len;
	}
}
