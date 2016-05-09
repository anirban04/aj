package recursion;

public class DoublePower {
	public static void main(String[] args) {
		System.out.println(myPow(2, 4));
	}

    public static double myPow(double x, int n) {
        if (n >= 0)
            return _myPow(x, n);
        else
            return 1/_myPow(x, -n);
    }
    
    private static double _myPow(double x, int n){
        if (n == 0)
            return 1;
        
        if (n == 1)
            return x;
            
        double v = _myPow(x, n/2);
        
        if (n % 2 == 0)
            return v * v;
        else
            return v * v * x;
    }
}

