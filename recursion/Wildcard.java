package recursion;
import java.util.*;

public class Wildcard {

		public static void main(String args[] ) throws Exception {
	        Scanner sc = new Scanner (System.in);
	        _wildcard(sc.next());
	    }

	    private static void _wildcard(String s) {
	    	char[] res = new char[s.length()];
	    	_wildcard(s, 0, res);
	    }
	    
	    private static void _wildcard(String s, int i, char[] res) {
	    	if (i == s.length()) {
	    		printRes(res);
	    		return;
	    	}
	    	
	    	if (s.charAt(i) != '?') {
	    		res[i] = s.charAt(i);
	    		_wildcard(s, i + 1, res);
	    	}
	    	else {
	    		res[i] = '0';
	    		_wildcard(s, i + 1, res);
	    		res[i] = '1';
	    		_wildcard(s, i + 1, res);
	    	}
	    }
	    
	    private static void printRes(char[] res) {
	    	for (int i = 0; i < res.length; i++)
	    		System.out.printf("%c", res[i]);
	    	System.out.printf(" ");
	    }
	}

