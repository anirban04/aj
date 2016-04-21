package dp;

public class SubsetSum {
 
    public static void main(String args[]) {
        int[] arr = {4, 2, 4, 2, 4, 2, 4, 2};
        //System.out.println(isBalPartition(arr));
        System.out.println(isBalPartDp(arr));
    }
    
    static boolean isBalPartition(int[] arr) {
    	int sum = 0;
    	for (int i = 0; i < arr.length; i++) {
    		sum += arr[i];
    	}
    	
    	if (sum % 2 != 0)
    		return false;
    	
    	int[] subset = new int[arr.length];
    	return _isBalPartition(arr, 0, subset, 0, sum / 2);
    }
    
    static boolean _isBalPartition(int[] arr, int arrIdx, int[] subset, int sIdx, int sum) {
    	if (arrIdx >= arr.length) {
    		int mySum = 0;
    		
    		for (int i = 0; i < sIdx; i++)
    			mySum += subset[i];
   			if (mySum == sum)
				return true;
   			return false;
    	}
    	
    	boolean a =  _isBalPartition(arr, arrIdx + 1, subset, sIdx, sum);
    	subset[sIdx] = arr[arrIdx]; 
    	boolean b =  _isBalPartition(arr, arrIdx + 1, subset, sIdx + 1, sum);
    	return a || b;
    }
    
    static boolean isBalPartDp(int[] arr) {
    	int sum = 0;
    	for (int i = 0; i < arr.length; i++) {
    		sum += arr[i];
    	}
    	
    	if (sum % 2 != 0)
    		return false;
    	
    	boolean[][] dpTable = new boolean[arr.length + 1][sum / 2 + 1];
    	
    	for (int i = 0; i <= arr.length; i++) {
    		dpTable[i][0] = true;
    	}
    	
    	for (int i = 1; i <= arr.length; i++) {
    		for (int j = 1; j <= sum / 2 ; j++) {
    			if(arr[i - 1] > j)
    				dpTable[i][j] = dpTable[i - 1][j];
    			else
    				dpTable[i][j] = dpTable[i - 1][j - arr[i - 1]];
    		}
    	}
    	
		return dpTable[arr.length][sum / 2];
    }
    
}