package recursion;

public class TreeCount {

	public static void main(String[] args) {
		System.out.println(_treecount(19));
	}
	
	private static int _treecount(int n) {
        if (n == 0 || n == 1)
            return 1;
            
        int sum = 0;
        // We give every node the chance to be the root.We have 
        // iNodeCount nodes in all. 1 is root so we are left with
        // iNodeCount-1 nodes. From the pattern, we see that one of the
        // sides (left or right) is iNodeCount-j. So the other one is
        // (iNodeCount - 1) - (iNodeCount-j) => j - 1.
        for (int i = 1; i <= n; i++) {
            int left = _treecount(i - 1);
            int right = _treecount(n - i);
            sum += (left * right); 
        }
        return sum;
    }
}
