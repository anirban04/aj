package dp;

public class NumPathsMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1, 1, 1},
						{1, 0, 1},
						{1, 1, 1}};
		
		System.out.println(getNumPaths(grid));
	}

	private static int getNumPaths(int[][] obstacleGrid) {
		int[][] dpTable = new int[obstacleGrid.length][obstacleGrid[0].length];
		
		if (obstacleGrid[0][0] == 0)
			return 0;
		
		dpTable[0][0] = 1;
		
		for (int i = 1; i < obstacleGrid.length; i++) {
			if (obstacleGrid[i][0] == 1)
				dpTable[i][0] = dpTable[i - 1][0];
		}
		
		for (int j = 1; j < obstacleGrid[0].length; j++) {
			if (obstacleGrid[0][j] == 1)
				dpTable[0][j] = dpTable[0][j - 1];
		}
		
		for (int i = 1; i < obstacleGrid.length; i++) {
			for (int j = 1; j < obstacleGrid[0].length; j++) {
				if (obstacleGrid[i][j] == 1)
					dpTable[i][j] = dpTable[i - 1][j] + dpTable[i][j - 1];
			}
		}
		return dpTable[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
	}
}

