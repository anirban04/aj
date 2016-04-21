package strings_and_arrays;

import java.util.*;

public class PopularElement {

	public static void main(String[] args) {
		int[] arr = new int [400];
		for (int i = 0; i < 400; i++) {
			if (i >= 101 && i <= 200)
				arr[i] = 101;
			else
				arr[i] = i;
			//System.out.println(i + ":" + arr[i]);
		}
		System.out.println(findPopular(arr));
		System.out.println(Math.log(19)/Math.log(2));
	}
	
	//popular element is one that exists at least 25% of the places.
	private static int findPopular(int[] arr) {
		//since it can show upto 4 times
		int [] popularCandidateIndices = new int[4];
		int firstCandidateIndex =  arr.length / 4 - 1;
		
		//Populate an array with the possible candidate indices
		for (int i = 0; i < popularCandidateIndices.length; i++) {
				popularCandidateIndices[i] = firstCandidateIndex + 
				i * (firstCandidateIndex + 1);
		}
		
		//for every popular index, check if it contains the popular element
		for (int i = 0; i < popularCandidateIndices.length; i++) {
			Range range = getRange(popularCandidateIndices[i], arr);
			if (range.right - range.left + 1 == arr.length / 4)
				return arr[popularCandidateIndices[i]];
		}
		
		//return -1 if no popular element exists
		return -1;
	}
	
	private static Range getRange(int index, int[] arr) {
		Range range = new Range();
		int low = 0;
		int high = index;
		//get leftmost element
		while (low <= high) {
			int mid = low + (high - low) / 2;
			//Do binary search
			if (arr[mid] == arr[index]) {
				// check if we have reached the lowest index or actual left edge
				if (mid == 0) {
					range.left = 0;
					break;
				}
				else if (arr[mid] != arr[mid - 1]) {
					range.left = mid;
					break;
				}
				//go left
				high = mid - 1;  
			}
			else {
				// go right
				low = mid + 1;
			}
		}
		
		low = index;
		high = arr.length - 1;
		//get rightmost element
		while (low <= high) {
			int mid = low + (high - low) / 2;
			//Do binary search
			if (arr[mid] == arr[index]) {
				// check if we have reached the lowest index or actual left edge
				if (mid == arr.length - 1) {
					range.right = mid;
					break;
				}
				else if (arr[mid] != arr[mid + 1]) {
					range.right = mid;
					break;
				}
				//go right
				low = mid + 1;  
			}
			else {
				// go left
				high = mid - 1;
			}
		}
		
		return range;
	}
	
}


class Range {
	int left;
	int right;
}