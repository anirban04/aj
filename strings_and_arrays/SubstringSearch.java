package strings_and_arrays;

public class SubstringSearch {

	public static void main(String[] args) {
		System.out.println(substrSearch("anirban", 
				"anirbaanirbaonanirbanojdahfbvljahdfblvjhbldjhfb"));

	}

	//O(m*n) algorithm
	private static int substrSearch(String subStr, String str) {
		int j;
		for(int i = 0; i < str.length(); i++) {
			for (j = 0; j < subStr.length(); j++) {
				if (str.charAt(i + j) != subStr.charAt(j))
					break;
			}
			if (j == subStr.length())
				return i;
		}
		return -1;
	}	
}
