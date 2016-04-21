package recursion;

public class Nqueens {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		_nqueens(arr, 0);
	}
	
	public static void _nqueens(int[] arr, int p) {
		if (p == arr.length) {
			printPerm(arr);
			return;
		}
		
		for(int i = p; i < arr.length; i++) {
			if(isValid(arr, arr[i], p)) {
				swap(arr, i, p);
				_nqueens(arr, p + 1);
				swap(arr, i, p);
			}
		}
	}
	
	public static void printPerm(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%2d", arr[i]);
		}
		System.out.printf("\n");
	}
	
	public static void swap(int[] arr, int p1, int p2) {
		int temp = arr[p1];
		arr[p1] = arr[p2];
		arr[p2] = temp;
	}
	
	public static boolean isValid(int[] arr, int row, int col) {
		for(int i = 0; i < col; i++) {
			if (col - i == Math.abs(arr[i] - row))
				return false;
		}
		return true;
	}
}
