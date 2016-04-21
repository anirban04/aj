package sorting;
import java.util.*;

public class HeapSort {
	
	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(Arrays.toString(arr));
		HeapSort s = new HeapSort();
		s.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	private int N;
	
	public void sort(int[] arr) {
		buildHeap(arr);
		for (int i = N; i > 0; i--) {
			swap(arr, 0, i);
			N = N - 1;
			maxHeapify(arr, 0);
		}
	}
	
	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private void buildHeap(int[] arr) {
		N = arr.length - 1;
		
		for (int i = N/2; i >= 0; i--) {
			maxHeapify(arr, i);
		}
	}
	
	private void maxHeapify(int[] arr, int i) {
		
		int left = 2 * i;
		int right = 2 * i + 1;
		int max = i;
		
		if (left <= N && arr[left] > arr[max])
			max = left;

		if (right <= N && arr[right] > arr[max])
			max = right;
		
		if (max != i) {
			swap(arr, max, i);
			maxHeapify(arr, max);
		}
	}
}
