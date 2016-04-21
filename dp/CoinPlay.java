package dp;

public class CoinPlay {

	private static int max;
	
	public static void main(String[] args) {
		int[] coins = {8, 15, 3, 7};
		//getMax(coins);
		//System.out.println("max = " + max);
		System.out.println(getMaxdp(coins));
	}
	
	private static void getMax(int[] coins) {
		//_getMax(coins, 0, coins.length - 1, 0);
		max = _getMax2(coins, 0, coins.length - 1);
	}
	
	private static void _getMax(int[] coins, int start, int end, int sum) {

		if (start > end) {
			if (sum > max)
				max = sum;
			return;
		}

		if ((coins[start + 1] > coins[end]) && (start + 2 < coins.length))
			_getMax(coins, start + 2, end, sum + coins[start]);
		else
			_getMax(coins, start + 1, end - 1, sum + coins[start]);
		
		if ((end - 1 > start) && (end - 2 >= 0))
			_getMax(coins, start, end - 2, sum + coins[end]);
		else
			_getMax(coins, start + 1, end - 1, sum + coins[end]);
			
	}
	
	private static int _getMax2(int[] coins, int start, int end) {
		if (start == end - 1)
			return Math.max(coins[start], coins[end]);
		
		return Math.max(coins[start] + Math.min(_getMax2(coins, start + 1, end - 1), _getMax2(coins, start + 2, end)),
						coins[end]   + Math.min(_getMax2(coins, start + 1, end - 1), _getMax2(coins, start, end - 2)));
		
		
	}
	
	private static int getMaxdp(int[] coins) {
		int[][] dpTable = new int[coins.length][coins.length];
		
		for (int gap = 0; gap < coins.length; gap++) {
			for (int i = 0, j = gap; j < coins.length; i++, j++) {
				int x, y, z;
				if (i + 2 <= j)
					x = dpTable[i + 2][j];
				else
					x = 0;
				
				if (i + 1 <= j - 1)
					y = dpTable[i + 1][j - 1];
				else
					y = 0;
				
				if (i <= j - 2)
					z = dpTable[i][j - 2];
				else
					z = 0;
				
				dpTable[i][j] = Math.max(coins[i] + Math.min(x, y), coins[j] + Math.min(y, z));
			}
		}
		return dpTable[0][coins.length - 1];
	}
	
	
}
