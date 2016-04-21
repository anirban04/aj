package strings_and_arrays;

public class LexicographicOrder {
	
	public static void main (String[] args) {
		System.out.println(getLexicographicOrder("cadb"));
	}
	
	private static int getLexicographicOrder(String str) {
		int[] arr = new int[256];
		for (int i = 0; i < str.length(); i++)
			arr[Integer.valueOf(str.charAt(i))] = 1;

		return _getLexicographicOrder(str, 0, arr);
	}
	
	
	private static int _getLexicographicOrder(String str, int i, int[] arr) {
		if (str.length() - 1 == i)
			return 1;
		
		int cnt = 0;
		Integer idx = Integer.valueOf(str.charAt(i)) - 1;
		arr[Integer.valueOf(str.charAt(i))] = 0;
		
		while (idx >= 0) {
			if (arr[idx] == 1)
				cnt++;
			idx--;
		}

		return cnt * fact(str.length() - i - 1) + _getLexicographicOrder(str, i + 1, arr);
	}
	
	private static int fact(int n) {
		if (n == 0 || n == 1)
			return 1;
		
		return n * fact(n - 1);
	}

}
