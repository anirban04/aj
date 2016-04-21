package sorting;
import java.util.*;

public class NutsAndBolts {
	
	public static void main (String[] args) {
		char[] nuts = {'@', '#', '$', '%'};
		char[] bolts = {'#', '$', '%', '@'};
		System.out.println(Arrays.toString(nuts));
		System.out.println(Arrays.toString(bolts));
		
		sort(nuts, bolts);
		
		System.out.println(Arrays.toString(nuts));
		System.out.println(Arrays.toString(bolts));
	}
	
	private static void sort (char[] nuts, char[] bolts) {
		_sort(nuts, bolts, 0, nuts.length - 1);
	}
	
	private static void _sort(char[] nuts, char[] bolts, int low, int high) {
		if (low > high)
			return;
		
		//choose low as the pivot
		int p = partition(nuts, low, high, bolts[low]);
		p = partition(bolts, low, high, nuts[p]);
		_sort(nuts, bolts, low, p - 1);
		_sort(nuts, bolts, p + 1, high);
	}
	
	private static void swap (char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void movePivot(char[] arr, int low, int pivot) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == pivot) {
				swap(arr, i, low);
				return ;
			}
		}
	}
	
	private static int partition(char[] arr, int low, int high, int pivot) {
		movePivot(arr, low, pivot);
		
		int i = low + 1;
		int j = high;
		
		while(i <= j) {
			while (i <= j && arr[i] < pivot)
				i++;
			while (i <= j && arr[j] > pivot)
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
}
