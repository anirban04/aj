package recursion;

public class DoublePower {
	public static void main(String[] args) {
		System.out.println(pow(3, 2));
	}
	
	private static double pow(double base, double pow) {
		if (pow < 0)
			return 1/_pow(base, pow * -1);
		else
			return _pow(base, pow * 1);
	}
	
	private static double _pow(double base, double pow) {
		if (pow <= 0) {
			return 1;
		}
		
		return base * (_pow (base , pow - 1.0));
	}
}
