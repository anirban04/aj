package recursion;

public class Subset {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		printSubsets(arr);
	}
	
	private static void printSubsets(int[] set) {
		int[] subset = new int[set.length];
		_printSubsets(set, 0, subset, 0);
	}
	
	private static void _printSubsets(int[] set, int setIdx, int[] subset, int subIdx) {
		if (setIdx == set.length) {
			printRes(subset, subIdx);
			return;
		}
		
		_printSubsets(set, setIdx + 1, subset, subIdx);
		subset[subIdx] = set[setIdx];
		_printSubsets(set, setIdx + 1, subset, subIdx + 1);
	}

	private static void printRes(int [] subset, int idx) {
		for (int i = 0; i < idx; i++) {
			System.out.printf("%2d", subset[i]);
		}
		System.out.printf("\n");
	}
}
