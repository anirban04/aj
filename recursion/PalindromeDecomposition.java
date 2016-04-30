package recursion;
import java.util.*;

public class PalindromeDecomposition {

	public static void main(String[] args) {
		List<List<String>> res = getPalDecomp("abracadabra");
		for (List<String> sublst : res) {
			for (String s : sublst) {
				System.out.print(s);
				System.out.print("|");
			}
			System.out.println();
		}
	}
	
	private static List<List<String>> getPalDecomp(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> partition = new ArrayList<String>();
		_getPalDecomp(s, 0, partition, res);
		return res;
	}
	
	private static void _getPalDecomp(String s, int idx, 
			List<String> partition, List<List<String>> res) {
		if (idx == s.length()) {
			res.add(new ArrayList<String>(partition));
			return;
		}
		
		for (int i = idx; i < s.length(); i++) {
			if (isPalindrome(s, idx, i)) {
				partition.add(s.substring(idx, i + 1));
				_getPalDecomp(s, i + 1, partition, res);
				partition.remove(partition.size() - 1);
			}
		}
	}
	
	private static boolean isPalindrome(String s, int low, int high) {
		while(low < high) {
			if (s.charAt(low) != s.charAt(high))
				return false;
			low++;
			high--;
		}
		return true;
	}
}
