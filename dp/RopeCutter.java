package dp;

public class RopeCutter {

	public static void main(String[] args){
		System.out.println(maxProductFromCutPieces(13));
		System.out.println(_maxProductFromCutPieces(65));
		
	}
    static int maxProductFromCutPieces(int iRopeLength) {
        int[][] dpTable = new int[iRopeLength][iRopeLength + 1];
        
        for (int j = 1; j <= iRopeLength; j++)
            dpTable[1][j] = 1;
        
        for (int i = 2; i < iRopeLength; i++) {
            for (int j = 1; j <= iRopeLength; j++) {
                if (j > i) {
                        //if ((j - i) > 1)
                            dpTable[i][j] = Math.max(dpTable[i - 1][j], Math.max (i * dpTable[i][j - i], i * (j - i)));
                        	//dpTable[i][j] = Math.max (i * dpTable[i][j - i], i * (j - i));
                        //else
                            //dpTable[i][j] = Math.max(dpTable[i - 1][j], i * 1);
                            
                }
                else
                    dpTable[i][j] = dpTable[i - 1][j];
            }
        }
        
        if (iRopeLength == 13) {
            for (int i = 0; i < iRopeLength; i++) {
                for (int j = 0; j <= iRopeLength; j++) {
                    System.out.printf("%4d ", dpTable[i][j]);
                }
                System.out.printf("\n");
            }
        }
            
            
        return dpTable[iRopeLength - 1][iRopeLength];
    }
    
    static int _maxProductFromCutPieces(int len) {
    	int max = 0;
    	if (len == 0 || len == 1)
    		return 0;
    	
    	for (int i = 1; i < len; i++) {
    		int temp = Math.max(i * len - i, i * _maxProductFromCutPieces(len - i));
    		if (max < temp)
    			max = temp;
    	}
    	return max;
    }
}


