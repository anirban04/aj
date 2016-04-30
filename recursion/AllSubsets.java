package recursion;

/* Print out all the subsets of a set */
public class AllSubsets {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 2};
		printAllSubsets(arr);
	}
	
	public static void printAllSubsets(int[] arr) {
		int[] res = new int[arr.length];
		_printAllSubsets(arr, 0, res, 0);
	}
	
	private static void _printAllSubsets(int[] set, int sIdx, int[] subset, int suIdx) {
		if (sIdx == set.length) {
			printSubset(subset, suIdx);
			return;
		}
		
		_printAllSubsets(set, sIdx + 1, subset, suIdx);
		subset[suIdx] = set[sIdx];
		_printAllSubsets(set, sIdx + 1, subset, suIdx + 1);
	}
	
	private static void printSubset(int[] subset, int idx) {
		for (int i = 0; i < idx; i++) {
			System.out.printf("%2d", subset[i]);
		}
		System.out.println();
	}

}
