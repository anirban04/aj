package recursion;
import java.util.*;

public class Nqueens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nqueens(sc.nextInt());
	}
	
	public static void nqueens(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}
		_nqueens(arr, 0);
	}
	
	private static void _nqueens(int[] arr, int idx) {
		if (idx == arr.length) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for (int i = idx; i < arr.length; i++) {
			swap(arr, idx, i);
			if (isValid(arr, idx)) {
				_nqueens(arr, idx + 1);
			}
			swap(arr, idx, i);
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static boolean isValid(int[] arr, int idx) {
		for (int i = 0; i < idx; i++) {
			//check for same row
			if (arr[i] == arr[idx])
				return false;
			
			if(Math.abs(arr[i] - arr[idx]) == (Math.abs(i - idx)))
					return false;
		}
		
		return true;
	}
}
