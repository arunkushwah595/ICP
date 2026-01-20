package Week_1;

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "sadbutsad", needle = "sad";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);
	}

}
