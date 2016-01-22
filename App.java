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
		//Integer[] ar = {0};
		
		//ArrayList<Integer> a = new ArrayList<Integer>();
		//ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(ar));
		//arrange(a);
		//for (int i:a)
		//	System.out.println(i);
		//System.out.println();
		//System.out.println(maxval(a));
		//a = maxset(a);
		//a = plusOne(a);
		//for (int i:a)
		//	System.out.println(i);
		
		//ArrayList<ArrayList<Integer>> res = generate(30);
		/*ArrayList<ArrayList<Integer>> res = generateMatrix(5);
		for (ArrayList<Integer> arr:res) {
			for (int i:arr)
				System.out.printf("%2d ", i);
			System.out.println();
		}
		res = diagonal(res);
		for (ArrayList<Integer> arr:res) {
			for (int i:arr)
				System.out.printf("%2d ", i);
			System.out.println();
		}
		
		ArrayList<Interval> res = new ArrayList<Interval>();
		res.add(new Interval(2,100));
		res.add(new Interval(100,100));
		//res.add(new Interval(8,10));
		//res.add(new Interval(15,18));
		//res = insert(res, new Interval(4, 6));
		res = merge(res);
		for (Interval i : res)
			System.out.println("[" + i.start + ", " + i.end + "]");
		*/
		
		/*ArrayList<Integer> arr =  getRow(1);
		for (int i:arr)
			System.out.printf("%d ", i);
		System.out.println();
		*/
		//System.out.println(isStrPalindrome("1a1"));
		
		//ArrayList<Integer> res = new ArrayList<Integer>();
		//res.add(3);
		//res.add(30);
		//res.add(34);
		//res.add(5);
		//res.add(9);
		//res.add(3);
		//res.add(2);
		//res.add(0);
		//res.add(1);
		//for (Integer i : res)
		//	System.out.println(i);
		/*for (Integer i : res)
			System.out.println(i);
		System.out.println();
		res = wave(res);
		for (Integer i : res)
			System.out.println(i);
		*/
		//System.out.println("first missing = " + firstMissingPositive(res));
		//arrange(res);
		//for (Integer i : res)
		//	System.out.println(i);
		
		//System.out.println(uniquePaths(15,9));
		/*
		ArrayList<String> strLst= new ArrayList<String>();
		strLst.add("aaaaaaaaaaaaaaa"); 
		strLst.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		strLst.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); 
		strLst.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		strLst.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		strLst.add("aaaaaaaaaaaaaa");
		strLst.add("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(longestCommonPrefix(strLst));*/
		//System.out.println(lengthOfLastWord("Hello World"));
		//System.out.println(strStr("Anirban", "ban"));
		//System.out.println(atoi("-54332872018247709407 4 54"));
		//System.out.println(romanToInt("aaaXaaaVaaaX"));
		//String[] arr = {"What", "must", "be", "shall", "be."};
		//String[] arr = {"glu", "muskzjyen", "fxjlzekp", "uvdaj", "ua", "pzagn", "bjffryz", "nkdd", "osrownxj", "fvluvpdj", "kkrpr", "khp", "eef", "aogrl", "gqfwfnaen", "qhujt", "vabjsmj", "ji", "f", "opihimudj", "awi", "jyjlyfavbg", "tqxupaaknt", "dvqxay"};
		/*ArrayList<String> res = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++)
			res.add(arr[i]);
		
		res = fullJustify(res, 12);
		for (String s : res)
			System.out.println(s);*/
		
		//System.out.println(longestPalindrome("aaaabaaa"));
		//System.out.println(convert("ABCDEFG", 3));
		//nQueens(29);
		
		//------------
		/*int [][] graphAdjMat = {{0, 1, 1, 1},
					   			{1, 0, 1, 0},
					   			{1, 1, 0, 1},
					   			{1, 0, 1, 0}};
		GraphColor graphColor = new GraphColor(graphAdjMat, 3); 
		
		if (!graphColor.colorGraph())
			System.out.println("Cannot Color the graph");
		else {
			System.out.println("Colors are: ");
			for (int i = 0; i < graphAdjMat.length; i++)
				System.out.printf("%d ",graphColor.color[i]);
			System.out.printf("\n");
		}
		
		KnightTour knighttour = new KnightTour(8);
		int [][] sol = knighttour.getKnightsPath();
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.printf("%4d", sol[i][j]);
			}
			System.out.printf("\n");
		}*/
		/*
		int [][] maze = {{1, 1, 1, 1},
	   					 {0, 0, 1, 0},
	   					 {1, 0, 1, 1},
	   					 {1, 1, 1, 0}};
		MazeSolver mSol = new MazeSolver(maze);
		mSol.printPath(0, 0, 2, 0);
		*/
		
		FibonacciSolver fibSolv = new FibonacciSolver();
		//System.out.println(fibSolv.solveNaive(40));
		System.out.println(fibSolv.solveDP(40));
		//------------
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
	
	
	/* Given numRows, generate the first numRows of Pascal’s triangle. Pascal’s
	 * triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from
	 * previous row R - 1. 
	 */
	private static ArrayList<ArrayList<Integer>> generate(int a) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		/* Iterate over the length of the required result */
		for (int i=0; i<a; i++) {
			/* New list everytime */
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			/* Handle case of first element */
			if (i == 0) {
				arr.add(1);
			}
			/* Handle case of second element */
			else if (i == 1) {
				arr.add(1);
				arr.add(1);
			}
			/* Handle case all other elements */
			else {
				/* Add the first element since its always the same */
				arr.add(1);
				/* Get the previous ArrayList in our listofLists */
				ArrayList<Integer> prev = res.get(i - 1);
				/* Generate the current ArrayList */
				for (int j = 0; j < prev.size() - 1; j++) {
					int sum = prev.get(j) + prev.get(j+1);
					arr.add(sum);
				}
				/* Add the last element since its always the same */
				arr.add(1);
			}
			/* Add the generated ArrayList to our ListOfLists */
			res.add(arr);
		}
		
		return res;
	}
	
	
	/* Given an index k, return the kth row of the Pascal’s triangle.Pascal’s
	 * triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from 
	 * previous row R - 1. 
	 * NOTE : k is 0 based. k = 0, corresponds to the row [1].
	 */
	private static ArrayList<Integer> getRow(int a) {
		ArrayList<Integer> cur = new ArrayList<Integer>();
		ArrayList<Integer> prev = new ArrayList<Integer>();
		ArrayList<Integer> temp;
		
		for (int i=0; i <= a; i++) {
			/* swap references no copy needed */
			temp = prev;
			prev = cur;
			cur = temp;
			cur.clear();
			
			if (i == 0) {
				cur.add(1);
			}
			else if (i == 1) {
				cur.add(1);
				cur.add(1);
			}
			else {
				cur.add(1);
				for (int j = 0; j < prev.size() - 1; j++) {
					int sum = prev.get(j) + prev.get(j+1);
					cur.add(sum);
				}
				cur.add(1);
			}
		}
		return cur;
	}
	
	/* Given an integer n, generate a square matrix
	 * filled with elements from 1 to n2 in spiral order. 
	 */
	private static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		
		/* Init top bottom laft and right to the 4 corners */
		int top = 0;
		int bottom = a - 1;
		int left = 0;
		int right = a - 1;
		
		int dir = 0;
		int cnt = 1;
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(a);
		
		/* Populate the arraylists since we will 
		 * only be setting the elements later. 
		 */
		for (int i = 0; i < a; i++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			for (int j = 0; j < a; j++) {
				tmp.add(0);
			}
			res.add(tmp);
		}
		
		/* Set up the traversing boundary - 
		 * keep running till we have populated a^2 elements 
		 * The (top <= bottom) && (left <= right) part is not
		 * really needed here, since it beaks at the same time 
		 * as (cnt <= Math.pow(a, 2)) 
		 */
		while ((top <= bottom) && (left <= right) && (cnt <= Math.pow(a, 2))) {
			/* Going east */
			if (dir == 0) {
				/* Set the elements that are in range 
				 * in the topmost row of the array
				 */
				for (int i = left; i <= right; i++) {
					res.get(top).set(i, cnt);
					cnt++;
				}
				/* Increment top since we have finished
				 * setting all the elements in current top 
				 */
				top++;
				/* Update direction to now go south */
				dir = 1;
			}
			/* Going south */
			else if (dir == 1) {
				/* Set the elements that are in range 
				 * in the rightmost row of the array
				 */
				for (int i = top; i <= bottom; i++) {
					res.get(i).set(right, cnt);
					cnt++;
				}
				/* Decrement right since we have finished
				 * setting all the elements in current right 
				 */
				right--;
				/* Update direction to now go west */
				dir = 2;
			}
			/* Going west */
			else if (dir == 2) {
				/* Set the elements that are in range 
				 * in the bottom most row of the array
				 */
				for (int i = right; i >= left; i--) {
					res.get(bottom).set(i, cnt);
					cnt++;
				}
				/* Decrement bottom since we have finished
				 * setting all the elements in current bottom 
				 */
				bottom--;
				/* Update direction to now go north */
				dir = 3;
			}
			/* Going north */
			else if (dir == 3) {
				/* Set the elements that are in range 
				 * in the left most row of the array
				 */
				for (int i = bottom; i >= top; i--) {
					res.get(i).set(left, cnt);
					cnt++;
				}
				/* Increment top since we have finished
				 * setting all the elements in current left 
				 */
				left++;
				/* Update direction to now go east */
				dir = 0;
			}

		}
		return res;
	}
	
	/* Give a N*N square matrix, return an array of its anti-diagonals. 
	 * Look at the example for more details.
	 */
	private static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(2*a.size() -1);
	
		/* Populate the elements of the outer ArrayList 
		 * since we will need to get them later. */
		for (int i=0; i<2*a.size() -1; i++) {
			res.add(new ArrayList<Integer>());
		}
		
		int resRow = 0;
		
		/* Set up the markers */
		int left = 0;
		int top = 0;
		int right = a.size() - 1;
		int bottom = a.size() - 1;

		/* Define the traversing boundary */
		while(top<=bottom && left<=right) {
			/* get an element from the input and add it to the result array. */
			res.get(resRow).add(a.get(top).get(left));
			
			/* Check if we have reached the end of one of the current
			 * traversal. 2 possible ends need to be considered. 
			 */
			if ((left==0) || (top==bottom)) {
				/* Increment the row in the result array */
				resRow++;

				if (top == bottom) {
					left++;
				}
				else {
					top++;
				}
				/* Backtrack to the top of the next traversal */
				while((top!=0) && (left!=right)) {
						top--;
						left++;
				}
			}
			/* End condition not reached - go diagonally below */
			else {
				top++;
				left--;
			}
		}
		return res;
	}
	
	/* Given a set of non-overlapping intervals, insert a new interval into
	 * the intervals (merge if necessary). You may assume that the intervals
	 * were initially sorted according to their start times.
	 */
	private static ArrayList<Interval> insert(ArrayList<Interval> 
		intervals, Interval newInterval) {

		ArrayList<Interval> res = new ArrayList<Interval>();

		for (Interval i : intervals) {
			/* new interval is non overlapping and after i */
			if (i.end < newInterval.start) {
				/* Add i to the result list */
				res.add(i);
			}
			/* new interval is non overlapping and after the before i */
			else if (newInterval.end < i.start) {
				/* Add the new Interval to the result list */
				res.add(newInterval);
				/* Make i as the newInterval */
				newInterval = i;
			}
			/* newInterval is overlapping i */
			else if ((i.start <= newInterval.end) || (newInterval.start <= i.end)) {
				/* Create a new Interval by merging the overlapping intervals */
				newInterval = new Interval(Math.min(i.start, newInterval.start), Math.max(i.end, newInterval.end));
			}
		}
		
		/* Add the newInterval to the list */
		res.add(newInterval);
		
		return res;
	}
	
	/* Given a collection of intervals, merge all overlapping
	 * intervals. Make sure the returned intervals are sorted. 
	 */
    private static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
    	
    	/* Sort the incoming list of intervals.
    	 * NOTE: For this, the class interval has to implement Comparable<Interval>.
    	 * The compareTo() method needs to be defined in it.
    	 */
    	Collections.sort(intervals);
 
    	ArrayList<Interval> res = new ArrayList<Interval>();   	
    	Interval prev = null;
    	
    	/* Iterate over the incoming list */
    	for (Interval i : intervals) {
    		/* non first element*/
    		if (prev != null) {
    			/* Check if we need to merge i with prev */
    			if ((prev.end > i.start) || (i.start == i.end) && (prev.end == i.start)) {
    				/* If yes, make prev as the merged interval */
    				prev.start = Math.min(prev.start, i.start);
    				prev.end = Math.max(prev.end, i.end);
    			}
    			/* If not add prev to result list and make i as prev */
    			else {
    				res.add(prev);
    				prev = i;
    			}
    		/* first element */
    		}
    		else {
    			/* If this is the first element make it prev */
    			prev = i;
    		}
    	}
    	
    	/* finally add prev to the result list */
    	if (prev != null)
    		res.add(prev);
    	
    	return res;
    }
    
    /* Given a list of non negative integers, arrange 
     * them such that they form the largest number. 
     */
	private static String largestNumber(final List<Integer> a) {
		ArrayList<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
	
		/* Convert all elements to strings 
		 * and add to list of string 
		 */
		for (Integer i:a)
			list.add(i.toString());
				
		/* Define a comparator to compare strings by
		 * concat() right-to-left or left-to-right.
		 * Return reverse order. 
		 */
		Collections.sort(list, new Comparator<String>(){
			public int compare(String s1, String s2) {
				String leftRight = s1+s2;
				String rightLeft = s2+s1;
				return -leftRight.compareTo(rightLeft);
			}
		});
		
		/* Append to string builder object */
		for (String s : list)
			sb.append(s);
		
		/* Handle case of all zero array by removing all but 1 zeroes */
		int len = sb.length();
		for (int i = 0; i < len - 1; i++) {
			if (sb.charAt(0) == '0')
				sb.deleteCharAt(0);
		}

		return sb.toString();
	}
	
	
	/* Given an array of integers, sort the array 
	 * into a wave like array and return it.
	 */
	private static ArrayList<Integer> wave(ArrayList<Integer> a) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		/* Sort the input ArrayList */
		Collections.sort(a);
		
		/* Create a result array list, retrieve elements from the sorted
		 * in an alternate manner and add them to the result list. 
		 */
		for (int i = 0; i <  a.size() - 1; i = i+2) {
			int j = i+1;
			res.add(a.get(j));
			res.add(a.get(i));
		}
		
		/* If the input list had odd number of elements, retrieve the
		 * last element from the input list and add to the result list.
		 */
		if (a.size()%2 > 0)
			res.add(a.get(a.size() - 1));
		
		return res;
	}
	
	/* Given an unsorted integer array, find 
	 * the first missing positive integer. 
	 */
	private static int firstMissingPositive(ArrayList<Integer> a) {
		int partition = a.size() - 1;
		int idx;
		
		/* Partition the array such that all -ve 
		 * numbers are to the right end of it. 
		 */
		for (int i = partition; i >= 0; i--) {
			int val = a.get(i);
			if (val < 0) {
				int swpVal = a.get(partition);
				a.set(partition, val);
				a.set(i, swpVal);
				partition--;
			}
		}
		
		/* On the left part, check every element, if it lies within [1 and N] 
		 * (both incl) then, get the prev element in the list and replace
		 * it with its negative value.
		 */
		for (int i = 0; i <= partition; i++) {
			int val = a.get(i);
			val = Math.abs(val);
			if ((val > 0) && (val <= partition+1)) {
			    int index = val - 1;
			    int num = a.get(index);
				a.set(index, -num);
			}
		}
		
		/* Iterate thru the array and for the first positive value return the 
		 * nextIndex + 1 
		 */
		for (idx = 0; idx <= partition; idx++) {
			if (a.get(idx) >= 0)
				return idx+1;
		}
		
		/* Handle case of all elements correct so N+1th index will be returned */
		return idx+ 1;
	}

	/* Rearrange a given array so that Arr[i] becomes
	 * Arr[Arr[i]] with O(1) extra space. 
	 */
	private static void arrange(ArrayList<Integer> a) {
		int size = a.size();
		int arrI;
		int arrArrI;
		int setVal;
		
		/* Set every element in the arrayList as 
		 * arr[i] = arr[i] + (arr[arr[i]]%n)*n 
		 */
		for (int i = 0; i < size; i++) {
			arrI = a.get(i);
			arrArrI = a.get(arrI);
			setVal = arrI + (arrArrI%size) * size;
			a.set(i, setVal);
		}
		
		/* set every element in the arrayList as 
		 * arr[i] = arr[i] / N
		 */
		for (int i = 0; i < size; i++) {
			a.set(i, a.get(i) / size);
		}
	}
	
	private static int isStrPalindrome(String a) {
		
		/* Handle the case of null string */
		if (a == null)
			return 0;

		/* Convert to lower */
		a = a.toLowerCase();
		/* Remove all non alphanumeric values from string */
		a = a.replaceAll("[^a-z0-9]+", "");
		/* Create string builder with our string */
		StringBuilder sb = new StringBuilder(a);
		/* reverse using string builder method */
		sb = sb.reverse();
		/* check if reversed string == input string */
		if(sb.toString().equals(a))
			return 1;
		return 0;
	}
	
	private static int strStr(final String haystack, final String needle) {
		if ((haystack == null) || (needle == null))
			return -1;
		
		return haystack.indexOf(needle);
		
	}
	
	/* atoi with a lot of corner cases */
	private static int atoi(final String a) {
		/* Handle the case of a null string */
		if (a == null)
			return 0;
		
		int neg = 1;
		int idx = 0;
		int res = 0;
		long ovfChk = 0;

		/* Skip all the whitespaces at the start */
		while(a.charAt(idx) == ' ')
			idx++;
		
		/* Check for the sign if present */
		if ((a.charAt(idx) == '-') || (a.charAt(idx) == '+')) {
			if (a.charAt(idx) == '-')
				neg = -1;
			idx++;
		}

		res = a.charAt(idx);
		
		/* Check if the character after the sign is a number. 
		 * If not, return 0.
		 */
		if (! ((res > 47) && (res < 58)))
			return 0;
		
		/* Now we have all the info except the number string. To,
		 * get it, split the string with the regex split("[^0-9]").
		 */
		String[] strArr = a.split("[^0-9]");
		/* Iterate through the split result array */
		for (String s : strArr) {
			/* Skip the dumb "" strings that split adds to the array */
			if (!(s.equals(""))) {
				long ret = 0;
				/* The array only contains "" and number strings, so once
				 * you skip the "", only number strings are left. Start
				 * converting character by character to number using
				 * (10 * ret) + (s.charAt(i) - 48). Keep ret as a double
				 * so that you can check for overflows on both sides.
				 * Keep in mind that face value of MAX is one lesser than
				 * MIN. So checks are independent. Keep accumulating, till
				 * there is overflow or all number characters are over.
				 * Return result.
				 */
				for (int i = 0; i < s.length(); i++) {
					ovfChk = (10 * ret) + (s.charAt(i) - 48);
					
					if ((neg == -1) && (ovfChk - 1 > Integer.MAX_VALUE))
						return Integer.MIN_VALUE;
					else if ((neg == 1) && (ovfChk > Integer.MAX_VALUE))
						return Integer.MAX_VALUE;
					else
						ret = ovfChk;
				}
				
				return neg * (int)ret;
			}
		}
		return 0;
	}

	/* Roman to int */
	private static int romanToInt(String a) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int res = 0;

		/* Insert the character number mappings into a hashmap */
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		/* Get the clean roman numeral into a string */
		String[] strArr = a.split("[^IVXLCDM]+");
		StringBuffer sb = new StringBuffer();
		String roman;
		for (String s : strArr) {
			if (!s.matches("")) {
				sb.append(s);
			}
		}
		
		roman = sb.toString();
		
		/* Iterate through the string with cur and nxt. If char at cur is
		 * less than nxt then add  (nxt - cur) to the accumulated res and 
		 * increment the iterating pointer by 1; else, add cur to the 
		 * accumulated value.
		 */
		for (int i = 0; i < roman.length(); i++) {
			int cur, nxt;
			cur = map.get(roman.charAt(i));
			if (i + 1 < roman.length())
				nxt = map.get(roman.charAt(i + 1));
			else
				nxt = 0;
			if (cur >= nxt)
				res+=cur;
			else {
				res+=(nxt - cur);
				i++;
			}
		}
		return res;
	}
	
	/* Write a function to find the longest common 
	 * prefix string amongst an array of strings. 
	 */
	private static String longestCommonPrefix(ArrayList<String> a) {
		/* Handle the case of the null string */
		if (a.size() == 0)
			return null;
		
		String str = a.get(0);
		int min = str.length();
		int len;
		/* Determine the shortest string in the list of strings */
		for (String s : a) {
			if ((len = s.length()) < min) {
				min = len;
				str = s;
			}
		}
			
		/* Iterate till the length of the shortest string and 
		 * for every value of length compare the character (at
		 * that index) between the shortest string and every 
		 * string in the list. If they do not match return the 
		 * substring till the last matching length.  
		 */
		for (len = 0; len < min; len++) {
			char c1 = str.charAt(len);
			for (String s1 : a) {
				char c2 = s1.charAt(len);
				if (c1 != c2) {
					return (str.substring(0, len));
				}
			}
		}

		/* If the entire shortest string is a substring 
		 * in all other strings return it. 
		 */
		return str;
	}
	
	/* Given a string s consists of upper/lower-case alphabets 
	 * and empty space characters ' ', return the length of 
	 * last word in the string. If the last word does not exist,
	 * return 0.
	 */
	private static int lengthOfLastWord(final String a) {

		/* Handle the case of a null string */
		if (a == null)
			return 0;
		
		/* Split the string into an array of 
		 * strings using regex split("[^a-zA-Z]")  
		 */
		String[] strArr = a.split("[^a-zA-Z]");
		/* Handle the case of a a string with only spaces */
		if (strArr.length == 0)
			return 0;
		/* return the length of the last array element */
		return strArr[strArr.length - 1].length();
	}
	
	/* Number of unique paths in a AxB grid */
	private static int uniquePaths(int a, int b) {
	    
		/* Handle the case of only one row or col */
	    if ((a == 1) || (b == 1))
	        return 1;

	    /* The total possible ways is 
	     * (a-1) for one way + (b-1) for other way  = a+b-2 */
	    int total = a+b-2;
	    int right = a-1;
	    
	    /* Number of paths is = Choose (a - 1) on one way 
	     * out of (a+b-2) total = (a+b-2) C (a-1). This number
	     * may overflow and therefore use a double to hold it. 
	     */
	    double paths = fact(total)/(fact(right) * fact(b - 1));
	    return (int)paths;
	}

	private static double fact(double n) {
	    if (n == 1) {
	        return 1;
	    }
	    else {
	        return n * fact (n - 1);
	    }
	}
	
	private static int getLineNumber() {
	    return Thread.currentThread().getStackTrace()[2].getLineNumber();
	}
	
	/* Given an array of words and a length L, format the text such that each
	 * line has exactly L characters and is fully (left and right) justified.
	 * You should pack your words in a greedy approach; that is, pack as many
	 * words as you can in each line.*/
	private static ArrayList<String> fullJustify(ArrayList<String> a, int b) {
		ArrayList<String> res = new ArrayList<String>();
		int len = 0;
		int idx = 0;
		
		/* Keep running till input arrayList is empty */
		while(!a.isEmpty()) {
			/* Handle the case of the last line */
			if (idx >= a.size()) {
				StringBuilder sb = new StringBuilder();
				/* Add all the words left in the 
				 * ArrayList, We know it will fit.
				 */
				while(!a.isEmpty()) {
					sb.append(a.remove(0));
					sb.append(" ");
				}
				/* Delete the last trailing space */
				sb.delete(sb.length() -1, sb.length());
				/* Add the line to the result arrayList */
				res.add(sb.toString());
			}
			/* Handle the case of any other than last line */
			else {
				len += a.get(idx).length() + 1;
				if ((b + 1) >= len)
					idx++;
				else {
					StringBuilder sb = new StringBuilder();
					len -= (a.get(idx).length() + 1);
					/* We are sure we have overshot, so reduce the number
					 * of words we are using for this line by one */
					idx--;
					/* Calculate how many extra spaces need to be padded */
					int diff = (b) - len;
					int space = 0;
					/* Case of num extra spaces > num slots between words */
					if (diff > idx) {
						if (idx > 0) {
							space = diff/idx;
							diff = diff%idx;
						}
						/* Case of num extra spaces < num 
						 * slots between words */
						else {
							space = diff;
							diff = 0;
						}
					}
					/* Add the words to the line */
					for (int j = 0; j <= idx; j++) {
						sb.append(a.remove(0));
						sb.append(" ");
						/* Add all the required extra space after every word */
						for (int i = 0; i < space; i++)
							sb.append(" ");
						if (diff > 0) {
							sb.append(" ");
							diff--;
						}
					}
					/* Delete the last trailing space */
					sb.delete(sb.length() -1, sb.length());
					/* Add the string to the result arrayList */
					res.add(sb.toString());
					len = 0;
					idx = 0;
				}
			}
		}
		return res;
	}
	
	/* Given a string S, find the longest palindromic substring in S. */
	private static String longestPalindrome1(String a) {
		
		/* Handle the case of a null input */
		if (a == null)
			return null;
		
		/* Handle the case of a string of length 1 */
		if (a.length() == 1)
			return a;

		String longPal = null;
		int stIdx = Integer.MAX_VALUE;

		/* Iterate over the string. At every index make strings 
		 * of all possible lengths and check for palindromes. */
		for (int i = 0; i <= a.length(); i++) {
			for (int j = i+1; j <= a.length(); j++) {
				String suba = a.substring(i, j);
				StringBuilder sb = new StringBuilder(suba);
				String subRev = sb.reverse().toString();
				if ((suba.equals(subRev)) && 
						/* If palindrome found, check whether
						 * longer than prev found ones. If same
						 * length palin found, check is start
						 * index is lower for this palin. */
						((longPal == null)  || 
						(suba.length() > longPal.length()) || 
						((suba.length() == longPal.length()) && 
								(i < stIdx)))) {
						longPal = suba;
						stIdx = i;	
				}
			}
		}
		return longPal;
	}
	
	/* Given a string S, find the longest palindromic substring in S. */
	private static String longestPalindrome(String a) {
		
		int maxSize = 0;
		int maxIdx = 0;
		int beginIdx, endIdx;
		/* Allocate an array to hold all the characters 
		 * as well as the spaces between them */
		int[] len = new int[2 * a.length() - 1];
		
		/* Iterate over this array */
		for (int i = 0; i < len.length; i++) {
			int cnt,idx,left,right;
			/* Case of a character */
			if (i % 2 == 0) {
				/* Minimum palindrome will
				 * be the character itself */
				cnt = 1;
				/* Compute the index into the string for this */
				idx = i / 2;
				/* Compute the left index or comparison */
				left = idx - 1;
			}
			/* Case of a space */
			else {
				/* Minimum palindrome will be 0 in this 
				 * case, since its the space between chars. */
				cnt = 0;
				/* Get the index into the string for this */
				idx = (i - 1) / 2;
				/* Compute the left index or comparison */
				left = idx;
			}
			/* Compute the right index or comparison */
			right = idx + 1;
			/* Run through the left and right 
			 * comparisons till a mismatch is found */
			while ((left >= 0) && (right < a.length())) {
				if (a.charAt(left) ==  a.charAt(right)) {
					/* For each successful comparison bump
					 * up the size of palindrome by 2 */
					cnt+=2;
				}
				else
					break;
				/* Move out by one */
				left--;
				right++;
			}
			/* Update palindrome index if we
			 * just found a longer palindrome */
			len[i] =  cnt;
			if (len[i] > maxSize) {
				maxSize = len[i];
				maxIdx= i;
			}
		}
		
		/* Compute the palindrome start index in the actual string */
		if (maxIdx % 2 > 0) {
			beginIdx = ((maxIdx - 1) / 2) - maxSize/2 + 1;
		}
		else {
			beginIdx = maxIdx/2 - ((maxSize - 1) / 2);
		}
		/* Compute the palindrome end index in the actual string */
		endIdx = beginIdx + maxSize;
		/* return the palindrome substring */
		return a.substring(beginIdx, endIdx);
	}
	
	/* The string "PAYPALISHIRING" is written in a zigzag pattern on
	 * a given number of rows. Write the code that will take a string
	 * and make this conversion given a number of rows: */
	private static String convert(String a, int b) {
		ArrayList<StringBuilder> arr = new ArrayList<StringBuilder>();
		for (int i = 0; i < b; i++)
			arr.add(new StringBuilder());
		
		arr.get(0).append(a.charAt(0));

		int dir = 0;
		int cursor = 1;
		int top = 0;
		int bottom = b - 1;
		for (int i = 1; i < a.length(); i++) {
			if (dir == 0) {
				if(cursor <= bottom) {
					arr.get(cursor).append(a.charAt(i));
					cursor++;
				}
				//for (StringBuilder sb : arr)
					//System.out.println(sb.toString());
				dir = 1;
				cursor--;
			}
			else {
				if(cursor >= top) {
					arr.get(cursor).append(a.charAt(i));
					cursor--;
				}
				//for (StringBuilder sb : arr)
					//System.out.println(sb.toString());
				dir = 0;
				cursor++;
			}
		}
		
		String ret = "";
		for (StringBuilder sb : arr) {
			System.out.println(sb.toString());
			ret += sb.toString();
		}
		
		return ret;
	}
//------------------------
	private static boolean isBoxValid(int [][] board, 
			int row, int col) {
		
		// We place a new queen to the right (next col) of an older queen, 
		// and also in one column, we only place a single queen. So the
		// following are the only cases that we need to consider for the 
		//validation of a bueen placement.
		
		//Check for any elements on straight left
		for (int j = 0; j < col; j++) {
			if (board[row][j] == 1)
				return false;
		}
		//Check for any elements on diagonal up left
		for (int i = row, j = col; i >=0  && j>=0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		//Check for any elements on diagonal down left
		for (int i = row, j = col; i < board.length  && j>=0; i++, j--) {
			if (board[i][j] == 1)
				return false;
		}
		
		return true;
	}
	
	private static boolean placeQueens(int [][] board, int col) {
		
		// Base case for recursion to break. if 
		// we have reached the end of the board.
		if (col >= board.length)
			return true;
		//For the given input col, iterate over all the rows to find a right box
		for (int i = 0; i < board.length; i++) {
			if (isBoxValid(board, i, col)) {
				// If a valid box is found place a queen there
				board[i][col] = 1;
				// Then call recursively for next col
				if (placeQueens(board, col+1))
					return true;
				//This is where we backtrack
				board[i][col] = 0;
			}
		}
		
		//If we have gone through all rows, then queen cannot be placed
		return false;
	}
	
	private static void printPlacement(int [][] board, int boardSize) {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				System.out.printf("%d  ", board[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	private static void nQueens(int numQueens) {

		//Create a 2 dimensional array to hold the board
		int [][] board = new int[numQueens][numQueens];
		
		//place all the queens
		if (placeQueens(board, 0))
			//print the placement
			printPlacement(board, numQueens);
		else
			System.out.println("Solution not found.");
	}
}   

class GraphColor {
	
	int [][] graphAdjMat;
	int[] color;
	int numColors;
	
	
	public GraphColor(int[][] graphAdjMat, int numColors) {
		this.graphAdjMat = graphAdjMat;
		this.color = new int[graphAdjMat.length];
		this.numColors = numColors;	
	}
	
	public boolean colorGraph() {
		return solve(0);
	}
	
	//This is the main helper method that solves the coloring problem
	private boolean solve(int vertexIdx) {
		//Base case - return if we have colored all vertices
		if (vertexIdx == graphAdjMat.length) {
			return true;
		}
		
		//For a given vertex, iterate through all colors to find the first one that is Valid
		for (int i = 1; i <= numColors; i++) {
			if (isColorValid(vertexIdx, i)) {
				//Assign color to vertex
				color[vertexIdx] = i;
				//Recursively color the next vertex
				if (solve(vertexIdx + 1))
					return true;
				//Backtrack if next vertex cannot be colored
				color[vertexIdx] = 0;
			}	
		}
		return false;
	}
	
	//Helper function to check if a color is valid
	private boolean isColorValid(int vertexIdx, int toColor) {
		for (int i = 0; i < graphAdjMat.length; i++) {
			//Check if a neighbor has the same color assigned
			if (graphAdjMat[vertexIdx][i] == 1 && (color[i] == toColor))
				return false;
		}
		return true;
	}
}

class KnightTour {
	
	private int [][] solMatrix;
	// Initialize the X and Y directions in 
	// which the knight can move in one move
	int[] xMove = {1, 2, 2, 1, -1, -2, -2, -1};
	int[] yMove = {2, 1, -1, -2, -2, -1, 1, 2};
	int boardSize;
	
	//Initialize the solution matrix with all -1s
	KnightTour(int boardSize) {
		solMatrix = new int [boardSize][boardSize];
		this.boardSize = boardSize;
		initSolMatrix();
	}

	private void initSolMatrix() {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				solMatrix[i][j] = -1;
			}
		}
	}

	// Public function that is called to get the path
	public int[][] getKnightsPath() {
		// Start at the top left corner of the board
		solMatrix[0][0] = 0;
		if (!solve(1, 0, 0))
			System.out.println("No path Exists.");
		return solMatrix;
	}
	
	private boolean solve(int stepNum, int curX, int curY) {
		int newX, newY;
		
		//Base case - if have covered all 
		if (stepNum == boardSize * boardSize)
			return true;
		
		//For a given box find the next valid box by
		//iterating thru the set of valid moves 
		for (int i = 0; i < xMove.length; i++) {
			// Find the next possible position
			newX = curX + xMove[i];
			newY = curY + yMove[i];
			
			//Check if its valid
			if (validBox(newX, newY)) {
				//If Valid assign the stepNum to the pos
				solMatrix[newX][newY] = stepNum;
				// Call recursively for the next step
				if (solve(stepNum + 1, newX, newY))
					return true;
				//If next step fails we backtrack
				solMatrix[newX][newY] = -1;
			}
		}
		return false;
	}
	
	private boolean validBox(int x, int y) {
		//Check if the position is inside the board and not previously visited
		if ((x >= 0 && x < this.boardSize) && 
			(y >= 0 && y < this.boardSize) && 
			(solMatrix[x][y]  == -1)) {
			return true;
		}
		else 
			return false;
	}
	
}

class MazeSolver {
	
	private int [][] maze;
	private int [][] path;
	
	// Arrays to hold the next steps
	int[] movX = {1, 0, -1, 0};
	int[] movY = {0, 1, 0, -1};

	// Store the input maze and initialize the path matrix
	public MazeSolver(int [][] maze) {
		this.maze = maze;
		path = new int[maze.length][maze.length];
	}
	
	// Helper function to print the path
	public void printPath(int startX, int startY, int endX, int endY) {
		path [startX][startY] = 1;
		if (findPath(startX, startY, endX, endY)) {
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze.length; j++) {
					System.out.printf("%4d", path[i][j]);
				}
				System.out.printf("\n");
			}
		}
		else
			System.out.println("No Path exists!");
			
	}
	
	// Main recursive function that does all the work
	private boolean findPath(int curX, int curY, int endX, int endY) {
		//Base case - Check if we have already reached our goal
		if ((curX == endX) && (curY == endY))
			return true;
		
		// Iterate over all the next possible 1 step
		// away blocks to find the valid one
		for (int i = 0; i < movX.length; i++) {
			//Compute the newX and newY
			int newX = curX + movX[i];
			int newY = curY + movY[i];
			
			//Check if valid
			if (isValid(newX, newY)) {
				//If valid mark the block as visited
				path[newX][newY] = 1;
				//Recursively check for the next step 
				if (findPath(newX, newY, endX, endY))
					return true;
				//If no next step possible backtrack.
				path[newX][newY] = 0;
			}
		}
		return false;
	}
	
	//Valid check - if within the maze and not visited and is not a barrier
	private boolean isValid(int x, int y) {
		if ((x < 0) || (x >= maze.length)) return false;
		if ((y < 0) || (y >= maze.length)) return false;
		if (maze[x][y] == 0) return false;
		if (path[x][y] == 1) return false;
		
		return true;
	}
}

//------------------------

class FibonacciSolver {
	
	//Hash map to store the already computed values
	private Map<Double, Double> memoize;
	
	public FibonacciSolver() {
		//Initialize the hash map
		memoize = new HashMap<Double, Double>();
		//Add the corner cases i.e. fib(0) and fib(1)
		memoize.put(0.0, 0.0);
		memoize.put(1.0, 1.0);
	}
	
	public int solveNaive(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		else return solveNaive(n - 1) + solveNaive(n - 2);
	}
	
	public double solveDP(double n) {
		if (memoize.containsKey(n))
			return memoize.get(n);
		
		// Recursively call to compute fib(n - 1) and add to map
		memoize.put(n - 1, solveDP(n - 1));
		// Recursively call to compute fib(n - 2) and add to map
		memoize.put(n - 2, solveDP(n - 2));
		
		// fib(n)  = fib(n - 1) + fib(n - 2)
		double fibVal = memoize.get(n - 1) + memoize.get(n - 2);
		//Add result to map and return sesult.
		memoize.put(n, fibVal);
		return fibVal;
		
	}
}

class Interval implements Comparable<Interval> {
	int start;
	int end;
	
	public Interval() {
		start = 0;
		end = 0;
	}

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Interval o) {
		Interval i = (Interval)o;
		if (this.start < i.start) {
			return -1;
		}
		else if (this.start > i.start) {
			return 1;
		}
		else return 0;
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

