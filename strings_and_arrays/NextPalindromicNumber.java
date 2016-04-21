package strings_and_arrays;

import java.util.*;

public class NextPalindromicNumber {

	public static void main(String[] args) {
		System.out.println("999 -> " + nextPalindromeFast(999));
		System.out.println("1234 -> " + nextPalindromeFast(1234));
		System.out.println("1221 -> " + nextPalindromeFast(1221));
		System.out.println("12921 -> " + nextPalindromeFast(12921));
		System.out.println("783322 -> " + nextPalindromeFast(783322));
		System.out.println("125322 -> " + nextPalindromeFast(125322));
		System.out.println("713322 -> " + nextPalindromeFast(713322));
		System.out.println("1234628 -> " + nextPalindromeFast(1234628));
	}

	// O(mn) where m is the number of digits and n is the
	// number of tries to get to the next palindrome.
	private static int nextPalindrome(int num) {
		num++;
		while(!isPalindrome(num)) {
			num++;
		}
		return num;
	}
	
	private static boolean isPalindrome(int num) {
		return _isPalindrome(String.valueOf(num), 0, String.valueOf(num).length() - 1);
	}
	
	private static boolean _isPalindrome(String s, int i, int j) {
		if (i >= j)
			return true;
		
		if (s.charAt(i) == s.charAt(j))
			return _isPalindrome(s, i + 1, j - 1);
		
		return false;
	}
	
	//O(m)
	private static int nextPalindromeFast(int num) {
		int temp = num;
		int numDigits = 0;
		boolean allNines = true;
		int lIdx, rIdx;
		
		while(temp > 0) {
			temp /= 10;
			numDigits++;
		}

		int[] numArr = new int[numDigits];
		temp = num;
		
		//Get the digits into an array
		for (int i = numArr.length - 1; i >= 0; i--) {
			numArr[i] = temp % 10;
			temp /= 10;
		}

		//Check if all 9s
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] != 9) {
				allNines = false;
				break;
			}
		}
		
		if (allNines)
			return num + 2;
		
		int mid = numDigits / 2;
		//Initialize the left and right indices
		if (numDigits % 2 == 0) {
			lIdx = mid - 1;
			rIdx = mid;
		}
		else {
			lIdx = mid - 1;
			rIdx = mid + 1;
		}
		
		//Iterate with the left and right indices
		while (lIdx >= 0 && rIdx < numArr.length 
				&& numArr[lIdx] == numArr[rIdx]) {
			lIdx--;
			rIdx++;
		}
		
		//Check if we got a palindrome as input
		if (lIdx < 0) {
			addAndProcess(numArr);
		}
		else {
			if (numArr[lIdx] > numArr[rIdx])
				copyToRight(numArr, lIdx, rIdx);
			else {
				addAndProcess(numArr);
			}
		}
		
		//System.out.println(Arrays.toString(numArr));
		return arrToInt(numArr);
		
	}
	
	private static void addAndProcess(int[] numArr) {
		int mid = numArr.length / 2;
		//Initialize the left and right indices
		if (numArr.length % 2 == 0) {
			//Check if both mid digits are 9
			if (numArr[mid] == 9 && numArr[mid - 1] == 9) {
				numArr[mid] = 0;
				numArr[mid - 1] = 0;
				_addPropogate(numArr, mid - 2);
				copyToRight(numArr, mid - 2, mid + 1);
				
			}
			else {
				if (numArr[mid] == numArr[mid - 1]) {
					numArr[mid] += 1;
					numArr[mid - 1] += 1;
					copyToRight(numArr, mid - 2, mid + 1);
				}
				else if (numArr[mid] < numArr[mid - 1])
					copyToRight(numArr, mid - 1, mid);
				else {
					_addPropogate(numArr, mid - 1);
					copyToRight(numArr, mid - 1, mid);
				}
			}
		}
		else {
			_addPropogate(numArr, mid);
			copyToRight(numArr, mid - 1, mid + 1);
		}
	}
	
	private static int arrToInt(int[] arr) {
		int num = 0;
		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			num = num + arr[i] * (int)Math.pow(10, j);
		}
		return num;
	}
	
	private static void _addPropogate(int[] arr, int i) {
		if (arr[i] + 1 <= 9) {
			arr[i] += 1;
			return;
		}
		
		arr[i] = 0;
		_addPropogate(arr, i - 1);
	}
	
	private static void copyToRight(int[] arr, int l, int r) {
		while (l >= 0) {
			arr[r] = arr[l];
			r++;
			l--;
		}
	}
}
