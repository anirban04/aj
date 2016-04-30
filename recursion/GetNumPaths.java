package recursion;

public class GetNumPaths {

	public static void main(String[] args) {
		int[][] grid = {{1, 1, 1, 1},
						{1, 1, 1, 0},
						{1, 1, 0, 1},
						{1, 1, 1, 1}};
		System.out.println(getNumPaths(grid));
	}

	public static int getNumPaths(int[][] grid) {
		int[] res = new int[1];
		_getNumPaths(grid, 0, 0, res);
		return res[0];
	}
	
	private static void _getNumPaths(int[][] grid, int x, int y, int[] res) {
		if (x == grid.length - 1 && y == grid[0].length - 1) {
			res[0]++;
			return;
		}
		
		if (x + 1 < grid.length && grid [x + 1][y] != 0)
			_getNumPaths(grid, x + 1, y, res);
		
		if (y + 1 < grid[0].length && grid [x][y + 1] != 0)
			_getNumPaths(grid, x, y + 1, res);
	}
}
