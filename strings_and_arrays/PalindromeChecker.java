package strings_and_arrays;

public class PalindromeChecker {
	public static void main (String args[]) {
		System.out.println(longestPalindromeSubStringO3("6789abba123abba45"));
		System.out.println(longestPalindromeSubStringO2("6789abba123abba45"));
	}
	
	
	//O(n^3)
	private static String longestPalindromeSubStringO3(String str) {
		char[] strArr = str.toCharArray(); //Can avoid doing this
		//generate all substrings and check if they are a palindrome
		int max_i = 0;
		int max_j = 0;
		int max_len = 0;
		
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i; j < strArr.length; j++) {
				//System.out.println(str.substring(i, j + 1));
				if (isPalindrome(strArr, i, j)) {
					if (j - i + 1 > max_len) {
						max_len = j - i + 1;
						max_i = i;
						max_j = j;
					}
				}
			}
		}
		return str.substring(max_i, max_j + 1);
	}
	
	private static boolean isPalindrome(char[] strArr, int i, int j) {
		if (i == j)
			return true;

		while(i < j) {
			if (strArr[i] != strArr[j])
				return false;
			i++; j--;
		}
		return true;
	}
	
	//O(n^2)
	private static String longestPalindromeSubStringO2(String str) {
		int max = 0;
		int max_l = 0;
		int max_r = 0;
		
		//first check for even sized palindromes
		for (int m = 0; m < str.length() - 1; m++) {
			int l = m;
			int r = m + 1;
			
			while(l >=0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
				l--; r++;
			}
			// note that l and r here are the ones that didn't make it into the
			// palindrome. The length of the palindrome is therefore r - l - 1. 
			if (r - l - 1 > max) {
				max = r - l - 1;
				max_l = l + 1;
				max_r = r - 1;
			}	
		}
		//then check for odd sized palindromes
		for (int m = 1; m < str.length() - 1; m++) {
			int l = m - 1;
			int r = m + 1;
			
			while(l >=0 && r < str.length() && str.charAt(l) == str.charAt(r)) {
				l--; r++;
			}
			// note that l and r here are the ones that didn't make it into the
			// palindrome. The length of the palindrome is therefore r - l - 1. 
			if (r - l - 1 > max) {
				max = r - l - 1;
				max_l = l + 1;
				max_r = r - 1;
			}	
		}
		return str.substring(max_l, max_r + 1);
	}
}
