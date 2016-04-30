package recursion;

public class SubsetSum {

	public static void main(String[] args) {
		int[] arr = {1, 3, -2, 9, 7};
		System.out.println(hasSubsetSum(arr, 6));
	}

	public static boolean hasSubsetSum(int[] arr, int sum) {
		int[] subset = new int[arr.length];
		return _hasSubsetSum(arr, 0, subset, 0, sum);
	}
	
	private static boolean _hasSubsetSum(int[] set, int sIdx, int[]subset, int ssIdx, int sum) {
		if (sIdx == set.length) {
			if (checkSum(subset, ssIdx, sum))
				return true;
			return false;
		}
		
		subset[ssIdx] = set[sIdx];
		boolean res1 = _hasSubsetSum(set, sIdx + 1, subset, ssIdx + 1, sum);
		boolean res2 = _hasSubsetSum(set, sIdx + 1, subset, ssIdx, sum);
		return res1 || res2;
	}
	
	private static boolean checkSum(int[] arr, int idx, int sum) {
		int localSum = 0;
		for (int i = 0; i < idx; i++)
			localSum += arr[i];
		
		if (localSum == sum)
			return true;
		
		return false;
	}
}
