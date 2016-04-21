package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main (String[] args) {
		int[] arr = {3, 1, 2, 5, 3, 5, 9, -2, 0};
		System.out.println(Arrays.toString(arr));
		quickSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr) {
		_qs(arr, 0, arr.length - 1);
	}
	
	private static void _qs(int[] arr, int low, int high) {
		if (low >= high)
			return;
		
		int pIdx = choosePivot(arr, low, high);
		swap(arr, low, pIdx);
		int p = partition(arr, low, high);
		_qs(arr, low, p - 1);
		_qs(arr, p + 1, high);
	}
	
	private static int partition(int[] arr, int low, int high) {
		int i = low + 1;
		int j = high;
		int pivot = arr[low];
		
		while (i <= j) {
			while(i <= j && arr[i] < pivot)
				i++;
			while(i <= j && arr[j] > pivot)
				j--;
			
			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		swap(arr, low, i - 1);
		return i - 1;
	}
	
	private static int choosePivot(int[] arr, int low, int high) {
		return low;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
