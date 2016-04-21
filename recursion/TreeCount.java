package recursion;

public class TreeCount {

	public static void main(String[] args) {
		System.out.println(_treecount(3));
	}
	
	private static int _treecount(int n) {
		if (n <= 1)
			return 1;
		
		int sum = 0;
		for (int k = 1; k <= n; k++) {
			int left =_treecount(n - k);
			int right =_treecount(k - 1);
			sum += left * right;
		}
		return sum;
	}

}
