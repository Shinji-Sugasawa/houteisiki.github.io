package houteisiki;

public class Nibunhou {

	class func_y(double x) {
		return x*x*x + x - 1.0;
	}
	class do (double a ,double b, double eps) {
		double c = ( a + b ) /2.0;
		if(( func_y(c) * func_y(a) ) < 0 ) {
			b = c;
		}else {
			a = c;
		}
	}

}
