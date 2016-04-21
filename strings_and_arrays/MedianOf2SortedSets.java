package strings_and_arrays;

public class MedianOf2SortedSets {
	
	public static void main (String[] args) {
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 4, 6};
		System.out.println(getMedian(arr1, arr2));
	}
	
	private static int getMedian( int[] arr1, int[] arr2) {
		//O(n) approach is to merge the 2 sorted 
		//sets in O(n) and reach the median in O(1).
		
		//O(logn)

		//We will do Binary search in arr1 first.
		int low = 0;
		int high = arr1.length;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			int dir = isMedian(mid, arr1, arr2);
			//found it
			if (0 == dir)
				return arr1[mid];
			//go left
			else if (-1 == dir)
				high = mid - 1;
			//go right
			else
				low = mid + 1;
		}
		
		// Now assuming we did not find the median, 
		// we will do Binary search in arr2.
		low = 0;
		high = arr1.length;
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			int dir = isMedian(mid, arr2, arr1);
			//found it
			if (0 == dir)
				return arr2[mid];
			//go left
			else if (-1 == dir)
				high = mid - 1;
			//go right
			else
				low = mid + 1;
		}
		
		return -100;
	}
	
	private static int isMedian(int idx, int[] targetArr, int[]OtherArr) {
		int length = targetArr.length + OtherArr.length;
		int medianIdx = 0;
		if (length % 2 == 0)
			medianIdx = length / 2 - 1;
		else
			medianIdx = length / 2;
		
		if (medianIdx == idx)
			return 0;
		else if (medianIdx < idx)
			return -1;
		else {
			int remainIdx = medianIdx - idx - 1;
			//proposed median must be greater than remainIdx'th element in 
			//the other array and smaller than remainIdx'th + 1 element.  
			if (targetArr[idx] > OtherArr[remainIdx] && targetArr[idx] < OtherArr[remainIdx + 1])
				return 0;
			else if (targetArr[idx] < OtherArr[remainIdx])
				return  1;
			else
				return -1;
				
		}
			
		// median must be greater than medianIdx elements in the merged array.
		// Its already greater than idx elements in this array. If 
	}
}
