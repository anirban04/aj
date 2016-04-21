package dp;
import java.util.*;

public class WordBreak {

	private static String[] dictionary = {"app", "apple", "pie"};
	
	public static void main(String[] args) {
		String s = "applepie";
	    
	    //System.out.println(isBreakable(s));
	    String[] resArr = isBreakabledp(s);
	    if (resArr == null)
	    	System.out.println("cannot break!");
	    else
	    	for (int i = 0; i < resArr.length; i++)
	    		System.out.println(resArr[i]);
	}
	
	private static boolean isBreakable(String s) {
		if (s.length() == 0)
			return true;

	
		for (int i = 1; i <= s.length(); i++) {
			if (dictHas(s.substring(0, i)) && isBreakable(s.substring(i, s.length())))
				return true;
		}
		return false;
	}
		
	private static boolean dictHas(String s) {
		for (int i = 0; i < dictionary.length; i++) {
			if (dictionary[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	private static String[] isBreakabledp(String s) {

		//Check if nothing to do
		if (s.length() == 0)
			return null;
		
		boolean dpTable[] = new boolean[s.length() + 1];
		
		for (int i = 1; i <= s.length(); i++) {
			if (dpTable[i] == false && dictHas(s.substring(0, i))) {
                for (int k = 0; k < i; k++)
                    dpTable[k] = false;  
                dpTable[i] = true;
			}
	        
			if (dpTable[i] == true)
	        {
				//Check if the whole string itself is a word
				if (i == s.length())
					return getRes(dpTable, s);
				
				for (int j = i+1; j <= s.length(); j++)
	            {
					if (dpTable[j] == false && dictHas( s.substring(i, j))) {
						dpTable[j] = true;
					}
					
	                if (j == s.length() && dpTable[j] == true)
	                	return getRes(dpTable, s);
	            }
	        }
		}
		return null;
	}
	
	private static String[] getRes(boolean[] dpTable, String s) {
		
		int cnt = 0;
		for (int i = 0; i < dpTable.length; i++) {
			if (dpTable[i] == true)
				cnt++;
		}
		
		String[] resArr = new String[cnt];
		int start = 0;
		int idx = 0;
		//iterate over the dpTable. A true indicates end+1 of a word
		for (int i = 0; i < dpTable.length; i++) {
			if (dpTable[i] == true) {
				resArr[idx] = s.substring(start, i);
				start = i;
				idx++;
			}
		}
		return resArr;
	}
}
