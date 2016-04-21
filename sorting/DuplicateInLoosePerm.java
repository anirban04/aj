package sorting;

public class DuplicateInLoosePerm {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10, 11, 12, 13, 14, 15, 15};
		System.out.println(getDuplicate(arr));
	}
	
	private static int getDuplicate(int[] arr) {
		int idx;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				idx = -1 * arr[i];
			else
				idx = arr[i];
			
			if (arr[idx - 1] < 0)
				return idx;
			else
				arr[idx - 1] = -1 * arr[idx - 1];
		}
		return -1; 
	}
}
