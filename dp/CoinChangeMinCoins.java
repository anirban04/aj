package dp;

import java.util.Arrays;
import java.util.Collections;

public class CoinChangeMinCoins {
	public static void main(String[] args) {
		int[] coins = {1, 2, 3};
		int total  = 4;
		System.out.println("min coins = " + changeCoins(coins, total));
	}
	
	private static int changeCoins(int[] coins, int total) {
		int[][] dpTable = new int[coins.length + 1][total + 1];
		Arrays.sort(coins);

		//Initialize to a high value that we know id out of limits.
		//Should not be too high, else can easily overflow. Also,
		//should be > total.
		for (int j = 0; j <= total; j++) {
			dpTable[0][j] = total + 1;
		}
		
		for (int i = 1; i <= coins.length; i++) {
			for (int j = 1; j <= total; j++) {
				if (coins[i - 1] <= j)
					dpTable[i][j] = Math.min(1 + dpTable[i][j - coins[i - 1]],
							dpTable[i - 1][j]);
				else
					dpTable[i][j] = dpTable[i - 1][j];
			}
		}
		
		int minCoins = dpTable[coins.length][total];
		
		//To figure out what the coins are
		int i = coins.length;
		int j = total;
		int[] res = new int[minCoins];
		while(minCoins > 0) {
			if (dpTable[i][j] != dpTable[i - 1][j]) {
				res[minCoins - 1] = coins[i - 1];
				j = j - coins[i - 1];
				minCoins--;
			}
			else
				i--;
		}
		
		for (int k = 0; k < res.length; k++)
			System.out.print(res[k] + " ");
		System.out.println();
		
		for (int m = 0; m <= coins.length; m++) {
			for (int n = 0; n <= total; n++) {
				System.out.printf("%3d", dpTable[m][n]);
			}
			System.out.print("\n");
		}
		return dpTable[coins.length][total];
	}
}
