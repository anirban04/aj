/* Given an input file with four billion integers, provide an algorithm to generate an
integer which is not contained in the file. Assume you have 1 GiB memory. Follow up
with what you would do if you have only 10 MiB of memory.*/


//Answer is not complete as JVM memory size is very limited. Read write to disc APIs need to be implemented 
// to solve this problem. 
package sorting;
import java.util.*;

public class FindIntNotIn4Bil {
	
	private static int cnt = 0;
	private static int[][]data;
	
	public static void main (String[] args) {
		data = new int[32][(int) Math.pow(2, 27)];
		System.out.println(getIntNotIn4Bil());
	}
	
	private static int getIntNotIn4Bil() {
		int chunkSize = (int) Math.pow(2, 26);
		int[] chunk = new int[chunkSize];
		
		readChunkFromDisc(chunk);
		return 0;
	}
	
	private static void readChunkFromDisc(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = cnt;
			cnt++;
		}
	}
	
	private static void writeChunkToDisc(int[] arr, int chunkId) {
		
	}
}
