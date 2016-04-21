package dp;

public class MatrixMultiplicationCost {

	public static void main(String[] args) {
		int[] arr = {10, 30, 5, 60};
		System.out.println(getMatMultCost(arr));
	}
    
	private static int getMatMultCost(int[] arr) {
    	int[][] dpTable = new int[arr.length][arr.length];
    	
    	for (int l = 2; l < arr.length; l++) { 
	    	for (int i = 0; i < arr.length - l; i++) {
	    		int j = i + l;
	    		dpTable[i][j] = Integer.MAX_VALUE;
	    		for (int k = i + 1; k < j; k++) {
	    			int temp = dpTable[i][k] + dpTable[k][j] + arr[i] * arr[k] * arr[j];
	    			if (temp < dpTable[i][j])
	    				dpTable[i][j] = temp;
	    		}
	    	}
    	}
    	return dpTable[0][arr.length - 1];
    }
}
