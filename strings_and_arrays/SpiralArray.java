package strings_and_arrays;

import java.util.Arrays;

public class SpiralArray {
	public static void main(String[] args) {
		int[][] input = {{1,2,3,1},
				         {4,5,6,1},
				         {2,2,2,2},
				         {7,8,9,1}};
		System.out.println(Arrays.toString(spiral(input)));
	}
	
    static int[] spiral(int[][] list) {
        
        int dir = 0; //east
        int[] resArr = new int[list.length * list[0].length];
        int i = 0;
        int j = -1;
        int limitE = list[0].length - 1;
        int limitS = list.length - 1;
        int limitW = 0;
        int limitN = 0;
        
        for (int idx = 0; idx < resArr.length; idx++) {
            if (dir == 0) {
                if (j < limitE)
                    j++;
                else {
                    dir = 1;
                    i++;
                    limitN++;
                }
                    
            }
            else if (dir == 1) {
                if (i < limitS)
                    i++;
                else {
                    dir = 2;
                    j--;
                    limitE--;
                }
            }
            else if(dir == 2) {
                if (j > limitW)
                    j--;
                else {
                    dir = 3;
                    i--;
                    limitS--;
                }
            }
            else if(dir == 3) {
                if (i > limitN)
                    i--;
                else {
                    dir = 0;
                    j++;
                    limitW++;
                }
            }     
            resArr[idx] = list[i][j];
        }
        return resArr;
    }
}
