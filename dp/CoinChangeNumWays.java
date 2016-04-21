package dp;

public class CoinChangeNumWays {
	public static void main(String[] args) {
		int[] coins = {1, 2, 3};
		int total  = 5;
		System.out.println("Num of ways = " + changeCoins(coins, total));
	}
	
	private static int changeCoins(int[] coins, int total) {
		int[][] dpTable = new int[coins.length + 1][total + 1];
		
		for (int i = 0; i <= coins.length; i++) {
			dpTable[i][0] = 1;
		}
		
		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= total; j++) {
				if (coins[i - 1] <= j) {
					dpTable[i][j] = dpTable[i][j - coins[i - 1]] + dpTable[i - 1][j];
				}
				else {
					dpTable[i][j] = dpTable[i - 1][j];
				}
			}
		}
		
		return dpTable[coins.length][total];
	}
}
