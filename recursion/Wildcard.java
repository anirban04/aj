package recursion;
import java.util.*;

public class Wildcard {

		public static void main(String args[] ) throws Exception {
	        Scanner sc = new Scanner (System.in);
	        wildcard(sc.next());
	    }
		
		public static void wildcard(String s) {
			char[] iArr = s.toCharArray();
			char[] rArr = new char[iArr.length];
			_wildcard(iArr, 0, rArr);
		}
		
		private static void _wildcard(char[] iArr, int iIdx, char[] rArr) {
			if (iIdx == iArr.length) {
				System.out.println(String.valueOf(rArr));
				return;
			}
			
			if (iArr[iIdx] == '?') {
				rArr[iIdx] = '0';
				_wildcard(iArr, iIdx + 1, rArr);
				rArr[iIdx] = '1';
				_wildcard(iArr, iIdx + 1, rArr);
			}
			else {
				rArr[iIdx] = iArr[iIdx];
				_wildcard(iArr, iIdx + 1, rArr);
			}
		}
	}

