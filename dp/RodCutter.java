package dp;

public class RodCutter {
	public static void main(String[] args) {
		int[] sizes = {1, 2, 3, 4};
		int[]values = {2, 5, 7, 8};
		int rodLen = 5;
		System.out.println("max profit = " + getProfit(sizes, values, rodLen));
	}
	
	private static int getProfit(int[] sizes, int[] values, int rodLen) {
		int[][] dpTable = new int[sizes.length + 1][rodLen + 1];

		for (int i = 1; i <= sizes.length; i++) {
			for (int j = 1; j <= rodLen; j++) {
				if (sizes[i - 1] <= j)
					dpTable[i][j] = Math.max(values[i - 1] + dpTable[i][j - sizes[i - 1]], 
									dpTable[i - 1][j]);
				else
					dpTable[i][j] = dpTable[i - 1][j]; 
			}
		}
		return dpTable[sizes.length][rodLen];
	}
}
