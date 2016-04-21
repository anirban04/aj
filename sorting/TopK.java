package sorting;
import java.util.*;

public class TopK {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9};
		System.out.println(Arrays.toString(getTopK(arr, 9)));
	}

	private static int[] getTopK(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, new Comparator <Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1.compareTo(i2);
			}
		});
		
		try {
			int i = 0;
			while(true) {
				if (i >= k) {
					if (pq.peek() < arr[i]) {
						pq.remove();
						pq.add(arr[i]);
					}
				}
				else
					pq.add(arr[i]);
				i++;
			}
			
		}
		catch (Exception e) {
			
		}
		
		int[] res = new int [pq.size()];
		
		for (int i = 0; i < res.length; i++)
			res[i] = pq.remove();
		
		return res;
	}
}
