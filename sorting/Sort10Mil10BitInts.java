package sorting;
import java.util.*;

public class Sort10Mil10BitInts {

	public static void main(String[] args) {
		
		int[] intArr = new int[10000000];
		Helper[] objArr = new Helper[10000000];
		//10 bit Integers can at most go upto 1024
		Random rand = new Random();
		for (int i = 0; i < 10000000; i++) {
			intArr[i] = rand.nextInt(1024);
			objArr[i] = new Helper(intArr[i]);
		}
		
		Helper[] resArr = mySort(intArr, objArr);
		
		for (int i = 0; i < 10000000; i++)
			System.out.println(resArr[i].val);
	}
	
	private static Helper[] mySort(int[] intArr, Helper[] objArr) {
		Helper[] resArr = new Helper[objArr.length];
		List<List<Helper>> lstOfLst = new ArrayList<List<Helper>>();
		
		for (int i = 0; i < 1024; i++) {
			lstOfLst.add(new ArrayList<Helper>());
		}
		
		for (int i = 0; i < intArr.length; i++) {
			lstOfLst.get(intArr[i]).add(objArr[i]);
			//System.out.println("Adding " + objArr[i].val);
		}
		
		int resIdx = 0;
		
		for (List<Helper> lst : lstOfLst) {
			for (Helper hlpObj : lst) {
				resArr[resIdx] = hlpObj;
				//System.out.println("Adding " + hlpObj.val);
				resIdx++;
			}
		}
		return resArr;
	}
}

class Helper {
	int val;
	
	public Helper (int val) {
		this.val = val;
	}
}
