package recursion;

public class subset_sum {
	public static void main(String[] args) {
		int[] input = {52, 3, 2,-55};
		int tot = 5;
		System.out.println(isSubsetSum(input, tot));
	}
	
	
	public static boolean isSubsetSum(int[] input, int tot) {
		return _subsetSum(input, 0, 0, tot);
	}
	
	public static boolean _subsetSum(int[] inp, int idx, int sum, int tot) {
		if (sum > tot)
			return false;

		if (idx >= inp.length) {
			if (sum == tot) {
				return true;
			}
			return false;
		}
		
		boolean v1 = _subsetSum(inp, idx + 1, sum, tot);
		sum += inp[idx];
		boolean v2 = _subsetSum(inp, idx + 1, sum, tot);
		
		return (v1 || v2);
	}
}
