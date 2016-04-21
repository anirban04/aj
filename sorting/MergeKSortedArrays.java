package sorting;
import java.util.*;

public class MergeKSortedArrays {
	public static void main (String[] args) {
		int[][] arr = {{1, 2, 3, 4, 5, 70},
					  {6, 20, 30, 40, 50, 60},
					  {5, 7, 9, 33, 42, 64}};
		
		System.out.println(Arrays.toString(mergeKSorted(arr)));
	}
	
	private static int[] mergeKSorted(int[][] arr) {
		
		int N = arr[0].length;
		int K = arr.length;
		int[] subArrIdx = new int[K];
		PriorityQueue <SortElement> pq = new PriorityQueue <SortElement>(K, new Comparator<SortElement>() {
			public int compare(SortElement v1, SortElement v2) {
				if (v1.val == v2.val)
					return 0;
				else if (v1.val > v2.val)
					return 1;
				else return -1;
			}
		});
		
		for (int i = 0; i < K; i++) {
			pq.add(new SortElement(arr[i][0], i));
			subArrIdx[i]++;
		}
		
		//we have already added K elements into the array, therefore init our counter to K-1
		int ctr = 0;
		int resIdx = 0;
		int[] res = new int[N * K];
		
		while(ctr < (N * K)) {
			SortElement s = pq.remove();
			res[resIdx] = s.val;
			resIdx++;
			if (subArrIdx[s.arrIdx] < N) {
				//System.out.println("Adding  " + arr[s.arrIdx][subArrIdx[s.arrIdx]]);
				pq.add(new SortElement(arr[s.arrIdx][subArrIdx[s.arrIdx]], s.arrIdx));
				subArrIdx[s.arrIdx]++;
			}
			else {
				pq.add(new SortElement(Integer.MAX_VALUE, 0));
			}
			ctr++;
		}
		
		return res;
	}
}

class SortElement {
	int val;
	int arrIdx;
	
	public SortElement(int val, int arrIdx) {
		this.val = val;
		this.arrIdx = arrIdx;
	}
}
