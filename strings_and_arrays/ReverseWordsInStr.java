package strings_and_arrays;

public class ReverseWordsInStr {
	public static void main(String[] args) {
		System.out.println(reverseWords("Where there is a will, there is a way."));
		System.out.println("way. a is there will, a is there Where");
		
		System.out.println(reverseWords("Cogito  ergo . sum."));
		System.out.println("sum. . ergo  Cogito");
		
		System.out.println(reverseWords("yay"));
		System.out.println("yay");
		
		System.out.println(reverseWords("google"));
		System.out.println("google");
		
		System.out.println(reverseWords(" Really? !@#$!@#$#@!$ "));
		System.out.println(" !@#$!@#$#@!$ Really? ");
	}
	
	
	//O(n) time and O(n) extra space 
    static String reverseWords(String inString) {
        char[] strArr = inString.toCharArray();
        char[] resArr = new char[strArr.length];
        
        int l = resArr.length - 1;
        int r = resArr.length - 1;
        int resIdx = 0;
        
        while(l >= 0) {
        	//valid characters
            if (strArr[l] != ' ') {
                l--;
            }
            //Whitespaces
            else {
                for (int i = l + 1; i <= r; i++) {
                    resArr[resIdx] = strArr[i];
                    resIdx++;
                }
                r = l;
                //determine number of whitespaces
                while(l >=0 && strArr[l] == ' ') {
                    l--;
                }
                
                //copy over whitespaces
                for (int i = l + 1; i<=r; i++) {
                    resArr[resIdx] = strArr[i];
                    resIdx++;
                }
                r = l;
            }
        }
        
        //Copy over whatever remains.
        for (int i = l + 1; i<=r; i++) {
        	resArr[resIdx] = strArr[i];
        	resIdx++;
        }	
            
        return String.valueOf(resArr);
    }
}
