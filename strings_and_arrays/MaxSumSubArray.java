package strings_and_arrays;

import java.util.Arrays;

public class MaxSumSubArray {
	public static void main(String[] args) {
		int[] arr = {-10, 20, -15, -40, -60, 15};
		MaxSubArray m = maxSumSubArray(arr);
		System.out.println(m.i);
		System.out.println(m.j);
		System.out.println(m.sum);
	}
	
	private static MaxSubArray maxSumSubArray(int[] arr) {
		
		MaxSubArray max = new MaxSubArray();
		int cs = 0;    //Cumulative sum
		int minCs = 0; //min cumulative sum
		int minCsIdx = -1; //end index of min cumulative sum
		
		for (int j = 0; j < arr.length; j++) {
			cs += arr[j];
			if (cs < minCs) {
				minCs = cs;
				minCsIdx = j;
			}
			if (cs - minCs > max.sum) {
				max.sum = cs - minCs;
				max.i = minCsIdx + 1;
				max.j = j;
			}
			//System.out.println(arr[j] + " " + cs + " " + minCs + " " + minCsIdx + " " + max.sum + " " + max.i + " " + max.j);
		}
		return max;
	}
	
static class MaxSubArray {
	int i;
	int j;
	int sum;
}
}
