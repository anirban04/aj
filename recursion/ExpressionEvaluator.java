package recursion;
import java.util.*;

public class ExpressionEvaluator {
	
	public static void main(String[] args) {
		List<String> res = getExpressions("3246", 1472);
		for (String s : res)
			System.out.println(s);
	}
	
	private static List<String> getExpressions(String strDigits, int iK) {
		List<String> res = new ArrayList<String>();
		char[] expr = new char[strDigits.length() + (strDigits.length() - 1)];
		expr[0] = strDigits.charAt(0);
		_buildExpr(expr, 1, strDigits, 1, res);
		trim(res, iK);
		return res;
	}
	
	private static void _buildExpr(char[] expr, int eIdx, String strDigits, int sIdx, List<String> res) {
		if (sIdx >= strDigits.length()) {
			res.add(String.valueOf(expr));
			return;
		}
		
		//choose " "
		expr[eIdx] = ' ';
		expr[eIdx + 1] = strDigits.charAt(sIdx);
		_buildExpr(expr, eIdx + 2, strDigits, sIdx + 1, res);
		
		//choose "*"
		expr[eIdx] = '*';
		expr[eIdx + 1] = strDigits.charAt(sIdx);
		_buildExpr(expr, eIdx + 2, strDigits, sIdx + 1, res);
		
		//choose "+"
		expr[eIdx] = '+';
		expr[eIdx + 1] = strDigits.charAt(sIdx);
		_buildExpr(expr, eIdx + 2, strDigits, sIdx + 1, res);
	}
	
	private static void trim(List<String> res, int val) {
		Iterator<String> it = res.iterator();
		while(it.hasNext()) {
			if (evaluateExpr(it.next()) != val)
				it.remove();
		}
	}
	
	private static int evaluateExpr(String expr) {
		//System.out.println(expr);
		Stack<Integer> valStk = new Stack<Integer>();
		Stack<Character> opStk = new Stack<Character>();
		
		for(int i = 0; i < expr.length(); i++) {
			if (expr.charAt(i) > '0' && expr.charAt(i) < '9') {
				//System.out.println("Adding " + (Integer.valueOf(expr.charAt(i)) - 48) + " to value stack");
				valStk.push(Integer.valueOf(expr.charAt(i)) - 48);
			}
			else {
				//System.out.println("Adding " + expr.charAt(i) + " to op stack");
				while (!opStk.isEmpty() && compare(opStk.peek(), expr.charAt(i)) > 0) {
					int i1 = valStk.pop();
					int i2 = valStk.pop();
					//System.out.println("Adjusting " + i1 + " " + opStk.peek() + " " + i2);
					valStk.push(evaluate(i1, i2, opStk.pop()));
				}
				opStk.push(expr.charAt(i));
			}
		}
		
		while(!opStk.isEmpty()) {
			int i1 = valStk.pop();
			int i2 = valStk.pop();
			//System.out.println("Evaluating " + i1 + " " + opStk.peek() + " " + i2);
			valStk.push(evaluate(i1, i2, opStk.pop()));
		}
		
		//System.out.println("val = " + valStk.peek());
		return valStk.pop();
	}
	
	private static int evaluate(int i1, int i2, char op) {
		if (op == '+')
			return i1 + i2;
		else if (op == '*')
			return i1 * i2;
		else {
			String s1 = i1 + "";
			String s2 = i2 + "";
			return Integer.valueOf(s1+s2);
		}
	}
	
	private static int compare(char op1, char op2) {
		if (op1 == '+') {
			if (op2 == '+')
				return 0;
			else
				return -1;
		}
		else if (op1 == '*') {
			if (op2 == '*')
				return 0;
			else if (op2 == '+')
				return 1;
			else
				return -1;
		}
		else { //op1 == ' '
			if (op2 == ' ')
				return 0;
			else
				return 1;
		}
	}
}
