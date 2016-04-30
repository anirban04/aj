package recursion;

/* Given a 2D matrix MxN, and every slot in the matrix having 
 * a weight, find weight of the path with the max weight. */

public class BestPath2DMatrix {

	public static void main(String[] args) {
		int[][] grid = {{1, 1, 1, 1},
				{8, 9, 2, 1},
				{2, 6, 3, 25},
				{5, 7, 9, 1}};
		System.out.println(getBestPath(grid));
	}
	
	private static int getBestPath(int[][] grid) {
		return _getBestPath(grid, 0, 0, 0);
	}
	
	private static int _getBestPath(int[][]grid, int x, int y, int sum) {
		if (x == grid.length - 1 && y == grid[0].length - 1)
			return sum;
		
		int s1 = 0;
		int s2 = 0;
		if (x + 1 < grid.length)
			s1 = _getBestPath(grid, x + 1, y, sum + grid[x + 1][y]);
		if (y + 1 < grid[0].length)
			s2 = _getBestPath(grid, x, y + 1, sum + grid[x][y + 1]);
		
		return Math.max(s1, s2);
	}
}
