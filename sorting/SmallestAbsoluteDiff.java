package sorting;
import java.util.*;

public class SmallestAbsoluteDiff {
	
	public static void main(String[] args) {
		int[] arr = {-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854};
		List<Pair> lst = getMinDiff(arr);
		for (Pair p: lst)
			System.out.println(p);
	}
	
	private static List<Pair> getMinDiff(int[] arr) {
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		List<Pair> lst = new ArrayList<Pair>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			int res = arr[i + 1] - arr[i];
			if (res < 0) {
				res = res * -1;
			}
			if (res < min) {
				min = res;
				lst.clear();
				lst.add(new Pair(arr[i], arr[i + 1]));
			}
			else if(res == min)
				lst.add(new Pair(arr[i], arr[i + 1]));
		}
		return lst;
	}
}

class Pair {
	int first;
	int second;
	
	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public String toString() {
		return (String.valueOf(first) + ":" + String.valueOf(second));
	}
}
