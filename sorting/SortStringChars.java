package sorting;

public class SortStringChars {

	public static void main(String[] args) {
		String s = "zzuueeddaa";
		System.out.println(sortChars(s));
	}
	
	private static String sortChars(String s) {
		int[] arr = new int[256];
		char[] res = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++)
			arr[Integer.valueOf(s.charAt(i))]++;

		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				for (int j = 0; j < arr[i]; j++) {
					res[k] = (char)i;
					k++;
				}
			}
		}
		return String.valueOf(res);
	}
}
