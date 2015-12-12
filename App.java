import java.util.*;

public class App {
	public static void main(String[] args) {
		//System.out.println(numZeroFact(100));
		//System.out.println(isPower(255));
		//System.out.println(isPalindrome(122));
		//System.out.println(isPrime(4));
		//int num = 10;
		//ArrayList ps = primesum(num);
		//System.out.println(num + " = " + ps.get(0)+" + "+ps.get(1));
		//System.out.println(titleToNumber("BBAB"));
		//System.out.println(convertToTitle(943566));
		//System.out.println(reverse(-1234356789));
		//System.out.println(egcd(35, 20));
		Integer[] ar = {0};
		
		//ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(ar));
		//arrange(a);
		for (int i:a)
			System.out.println(i);
		System.out.println();
		//System.out.println(maxval(a));
		//a = maxset(a);
		a = plusOne(a);
		for (int i:a)
			System.out.println(i);

	}
	
	
	/* Each pair of 2 and 5 will cause a trailing zero.
	 *  Since we have only 24 5’s, we can only make 24 
	 *  pairs of 2’s and 5’s thus the number of 
	 *  trailing zeros in 100 factorial is 24. 
	 */
	private static int numZeroFact(int n) {
		int cnt_2 = 0;
		int cnt_5 = 0;
		int i = 1;
		
		while(n/Math.pow(5, i) > 0) {
			cnt_5+=n/Math.pow(5, i);
			i++;
		}
		
		i = 1;
		while(n/Math.pow(2, i) > 0) {
			cnt_2+=n/Math.pow(2, i);
			i++;
		}
		
		return Math.min(cnt_2, cnt_5);
	}
	
	/* Outer loop iterates through all numbers from 2 to Max_Input/input. 
	 * Inner loop restricts the accumulated value to less than input and 
	 * also less than Max_Input/input 
	 */
	private static boolean isPower(int a) {
		
		if (a == 1)
			return true;
		
		for (int base = 2; base < Integer.MAX_VALUE / base && base < a; base++) {
			int accumuate = base;
			while( accumuate <= a && accumuate< Integer.MAX_VALUE / base) {
				accumuate = accumuate * base;
				if (accumuate == a)
					return true;
			}
		}
		return false;
	}
	
	/* reverses a number and checks if input == reverse */
	private static boolean isPalindrome(int num) {
		int input = num;
		int rev = 0;
		
		if (num < 0)
			return false;
		
		while (num != 0) {
			rev = rev*10 + num%10;
			num/=10;
		}
		
		if (rev == input)
			return true;

		return false;
	}
	
	private static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num%i == 0)
				return false;
		}
		return true;
	}
	
	private static ArrayList<Integer> primesum(int a) {
		int first = 2;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while ((!isPrime(first)) || (!isPrime(a - first))) {
			first++;
		}
		list.add(first);
		list.add(a - first);
		
		return list;
    }
	
	/* sum += 26^n * (intEquavalent of charAt(n)) 
	 * for n from 0-length of input string. 
	 */
	private static int titleToNumber(String a) {
		int len = a.length() - 1;
		int sum = 0;
		int charVal = 0;
		
		while (len >= 0) {
			charVal = (int)a.charAt(a.length() - 1 - len) - 64;
			sum+=Math.pow(26, len)*(charVal);
			len--;
		}
		return sum;
	}
	
	private static String convertToTitle(int a) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	    StringBuilder sb = new StringBuilder();
	    int val;
	    while(a > 0) {
	    	if (a%26 > 0) {
	    		val =  (a%26) + 64;
	    		a/=26;
	    	}
	    	else {
	    		val = 26+64;
	    		a/=26;
	    		a--;
	    	}
	    	list.add(0, val);
	        
	    }
	    
	    for (int i : list) {
	    	sb.append((char)i);
	    }
	    
	    return sb.toString();
	}
	
	/* Reversing a number - Algorithm is pretty easy. 
	 * Important thing is to check for overflows.
	 */
	private static int reverse(int a) {
	    boolean neg = false;
	    int rev = 0;
	    
	    if (a < 0) {
	        neg = true;
	        a*=-1;
	    }
	    
	    while (a>0) {
	    	/* Check for overflow */
	    	if (rev > Integer.MAX_VALUE / 10 - a%10)
	    		return 0;
	    	
	        rev = rev*10 + a%10;
	        a/=10;
	    }
	    
	    if (neg)
	        rev*=-1;
	       
	    return rev;
	}
	
	/* GCD - dumb approach */
	private static int gcd(int a, int b) {
		
		if ((a == 0) && (b != 0))
			return b;
		
		if ((b == 0) && (a != 0))
			return a;
		
		if ((a == 0) && (b == 0))
			return 0;
		
		if (a < 0)
			a*=-1;
		if (b < 0)
			b*=-1;
		
		int lower = a;
		int higher = b;
		
		
		if (a > b) {
			lower = b;
			higher = a;
		}
		
		for(int i = lower; i>0; i--) {
			if ((lower%i == 0) && (higher%i == 0))
					return i;
		}
		return 0;
	}
	
	/* GCD recursive */
	private static int rgcd(int a, int b) {
		   if (b==0) return a;
		   return rgcd(b,a%b);
	}
	
	/* Euclidean algorithm.for GCD */
	private static int egcd(int a, int b) {
		if (b == 0)
			return a;
		
		while(a!=0) {
			if (b > a)
				b = b - a;
			else
				a = a - b;
		}
		
		return b;
	}
	
	/* Using Kadene's algorithm */
	private static int maxval(ArrayList<Integer> a) {
		Res maxCur = new Res();
		Res max = new Res();
		
		/* Iterate over all the elements of the array */
		for (int index=0; index<a.size(); index++) {
			if (maxCur.sum < 0) {
				/* If we have accumulate negative then discard and restart */
				maxCur.start = index;
				maxCur.end = index;
				maxCur.sum = a.get(index);
			}
			else {
				/* Accumulate  more and advance end pointer*/
				maxCur.end = index;
				maxCur.sum += a.get(index);
			}
			
			/* Update max value if new max is found */
			if (maxCur.sum > max.sum) {
				max.start = maxCur.start;
				max.end = maxCur.end;
				max.sum = maxCur.sum;
			}
		}
		
		return (int)max.sum;
	}
	
	
	/* Find out the maximum sub-array of non negative numbers from an array.
	 * The sub-array should be continuous. That is, a sub-array created by 
	 * choosing the second and fourth element and skipping the third element 
	 * is invalid. Maximum sub-array is defined in terms of the sum of the 
	 * elements in the sub-array. Sub-array A is greater than sub-array B if 
	 * sum(A) > sum(B).
	 * NOTE: 1. If there is a tie, then compare with segment's length and return 
	 * segment which has maximum length.
	 * 2.If there is still a tie, then return the segment with minimum starting 
	 * index
	 */
	/* Using a slight modification of Kadene's algorithm */
	/* NOTE: To avoid overflows sum is declared a double */
	private static ArrayList<Integer> maxset(ArrayList<Integer> a) {
		Res maxCur = new Res();
		Res max = new Res();
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		/* Iterate over all the elements of the array */
		for(int i=0; i<a.size(); i++) {
			/* (Re)Starting case, since we (re) init with -max*/
			if(maxCur.sum < 0) {
				if (a.get(i) >= 0) {
					maxCur.start = i;
					maxCur.end = i;
					maxCur.sum = a.get(i) ;
					maxCur.num = 1;
				}
			}
			else {
				if (a.get(i) >=0) {
					maxCur.end = i;
					maxCur.sum += a.get(i);
					maxCur.num++;
				}
				/* If the next array element is negative 
				 * save to max if required and re-start.
				 */
				else {
					swapIfGreater(maxCur, max);
					maxCur.sum = -1*Integer.MAX_VALUE;
				}
			}
			
			/* save to max if required */
			swapIfGreater(maxCur, max);
		}
		
		/* handle case where all elements are negetive */
		if (max.sum < 0)
			return ret;
		
		/* populate the return array list */
		for (int i=max.start; i<=max.end; i++) {
			ret.add(a.get(i));
		}
		
		return ret;
	}
	
	/* Helper function to swap 2 Res objects */
	private static void swapIfGreater(Res maxCur, Res max) {
		if ((maxCur.sum > max.sum) || 
				/* If there is a tie, then compare with segment's 
				 * length and return segment which has maximum length. 
				 */
				((maxCur.sum == max.sum) && (maxCur.num > max.num)) ||
				/* If there is still a tie, then return the segment
				 * with minimum starting index 
				 * */
				(((maxCur.sum == max.sum) && (maxCur.num == max.num) 
						&& (maxCur.start < max.start)))) {
			
				max.start = maxCur.start;
				max.end = maxCur.end;
				max.sum = maxCur.sum;
				max.num = maxCur.num;
			}
	}
	
	
	/* Given a non-negative number represented as an array of digits,
	 * add 1 to the number ( increment the number represented by the digits ).
	 * The digits are stored such that the most significant digit is at the
	 * head of the list.
	 */
	private static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int sum = 0;
		int carry = 1;
		int zCnt = -1;
		

		/* Count the leading zeroes as we do not want
		 * to iterate over them in our main loop.
		 */
		for(int idx = 0; idx < a.size(); idx++) {
			if(a.get(idx) == 0)
				zCnt++;
			else
				break;
		}
		
		/* Iterate over all the elements accumulating sum
		 * and setting or clearing carry as required. 
		 */
		for (int i=a.size() -1; i>zCnt; i--) {
			sum = a.get(i) + carry;
			if (sum > 10) {
				carry = sum/10;
				sum = sum%10;
			}
			else if (sum == 10) {
				carry = 1;
				sum = 0;
			}
			else
				carry = 0;
		
			/* case of either sum or carry being non zero */
			if ((sum != 0) || (carry != 0))
				res.add(0, sum);
			/* case of input array containing a 0 */
			else if ((sum == 0) && (carry == 0) && (a.get(i) == 0))
				res.add(0, 0);
		}
		
		/* If we have a leftover carry, add that to the result */
		if (carry > 0)
			res.add(0, carry);
		
		return res;
	}
	
	private static int getLineNumber() {
	    return Thread.currentThread().getStackTrace()[2].getLineNumber();
	}
}

class Res {
	int start;
	int end;
	double sum;
	int num;
	
	public Res () {
		sum = -1 * Integer.MAX_VALUE;
	}
}
