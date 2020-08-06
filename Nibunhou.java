package houteisiki;

public class Nibunhou {

	double func_y(double x){
        return x*x*x + x -1.0;//求めたい方程式
    }

    double syori(double a, double b, double eps){
        int i=1;
        double c=.0;

        while(Math.abs(a-b)>eps) {

        	c = (a+b)/2.0;
        	System.out.println( i+ ":" +c );//計算回数出力

            if(func_y(c) * func_y(a)<0) {
            	b = c;
            }
            else {
            	a = c;
            	}
            i++;

        }
        return c;
    }

        public static void main (String[] args) {
            Nibunhou kai = new Nibunhou();

            double eps = 0.0001;//許容誤差
            double a = 0.0, b = 1.0;

            double ans = kai.syori(a, b, eps);//(初期値,許容誤差)

    		System.out.println("\n近似解:" +ans);// 結果表示
        }
}
