package dp;

public class KnapSackSolver {
	public static void main(String[] args) {
		int[] val = {60, 100, 120};
		int[] wt = {10, 20, 30};
		System.out.println("Max Profit = " + maxProfit(val, wt, 50));
	}
	
	public static int maxProfit(int[] val, int[] weights, int totWeight) {
		int [][] dpTable = new int [weights.length + 1][totWeight + 1];
		
		
		for (int i = 1; i <= weights.length; i++) {
			for (int j = 1; j <= totWeight; j++) {
				if (weights[i - 1] <= j)
					dpTable[i][j] = Math.max(dpTable[i - 1][j], val[i - 1] + dpTable[i - 1] [j - weights[i - 1]]);
				else
					dpTable[i][j] = dpTable[i - 1][j];
			}
		}
		return dpTable[weights.length][totWeight];
	}
}


