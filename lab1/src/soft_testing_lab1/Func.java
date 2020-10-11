package soft_testing_lab1;

public class Func{

	public static double function(double x) {
		return taylorSeriesCosx(x);
	}
	
	static double taylorSeriesCosx(double x) {
		double res = 0;
		//since cos x is a periodic function all values of which can be found
		//in the range of -pi <= x <= pi, x can be tilted to the previously stated bounds
		//in order to improve the precision of the taylor series without
		//computing all members of the series
		
		x = Math.abs(x);
		if (x > Math.PI) x = (x + Math.PI)%(2*Math.PI) - Math.PI;
		
		//cosine x represented in a Taylor series
		res = 1 - Math.pow(x, 2)/2 + Math.pow(x, 4)/factorial(4)
				- Math.pow(x, 6)/factorial(6) + Math.pow(x, 8)/factorial(8)
				- Math.pow(x, 10)/factorial(10) + Math.pow(x, 12)/factorial(12);
		return res;
	}
	
	//returns factorial of x
	static int factorial(int x) {
		int res = 1;
		for (; x > 1; --x) {
			res *= x;
		}
		return res;
	}
	
	
}
