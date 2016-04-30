package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {	
		TOH('A', 'B', 'C', 20);
	}
	
	private static void TOH(char src, char des, char aux, int n) {
		_TOH(src, des, aux, n);
	}
	
	private static void _TOH(char src, char des, char aux, int n) {
		if (n == 0)
			return;
		
		_TOH(src, aux, des, n - 1);
		System.out.println("Move 1 disc from " + src + " to " + des + " using " + aux);
		_TOH(aux, des, src, n - 1);
	}
}
