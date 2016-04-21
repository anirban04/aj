package sorting;
import java.util.*;

public class MergeSort {
	public static void main (String[] args) {
		int[] arr = {3, 1, 2, 5, 3, 5, 9, -2, 0};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(_mergeSort(arr)));
	}
	
	private static int[] _mergeSort(int[] input) {
		
		if(input.length == 1)
			return input;
		
		int[] left = new int[input.length / 2];
		int[] right = new int[input.length - left.length];
		
		for (int i = 0; i < left.length; i++)
			left[i] = input[i];
		
		for (int i = 0; i < right.length; i++)
			right[i] = input[i + left.length];
		
		return mergeSorted(_mergeSort(left), _mergeSort(right));
	}
	
	private static int[] mergeSorted(int[] left, int[] right) {
		int[] res = new int[left.length + right.length];
		
		int lIdx = 0; int rIdx = 0; int resIdx = 0;
		
		while (lIdx < left.length || rIdx < right.length) {
			while (lIdx < left.length && rIdx < right.length) {
				if (left[lIdx] <= right[rIdx]) {
					res[resIdx] = left[lIdx];
					resIdx++;
					lIdx++;
				}
				else {
					res[resIdx] = right[rIdx];
					resIdx++;
					rIdx++;
				}
			}
			
			if (lIdx < left.length) {
				res[resIdx] = left[lIdx];
				resIdx++;
				lIdx++;
			}
			if (rIdx < right.length) {
				res[resIdx] = right[rIdx];
				resIdx++;
				rIdx++;
			}
		}
		return res;
	}
}
