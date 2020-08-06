package houteisiki;

public class Nibunhou {

	class func_y(double x) {
		return x*x*x + x - 1.0;
	}
	class keisan(double a ,double b, double eps) {

		int i = 0;

		while(Math.abs(a-b) < eps) {

			double c = ( a + b ) /2.0;

			if (( func_y(c) * func_y(a) ) < 0 ) {
				b = c;
			}
			else {
				a = c;
			}
			System.out.println( i+ ":" +c );//計算回数出力
		}
		return i;
	}

	public static void main(String args[]) {

		Nibunhou kai = new Nibunhou();

		int ans = kai.keisan(0.0, 4.0, 0.001)ans;//(原点,初期値,範囲誤差)

		System.out.println("計算回数:" +ans);//計算回数出力
	}

}
