package houteisiki;

public class Nibunhou {

	double func_y(double x){
        return x*x*x + x -1.0;//���߂���������
    }

    double syori(double a, double b, double eps){
        int i=1;
        double c=.0;

        while(!(Math.abs(a-b)<eps)) {

        	c = (a+b)/2.0;
        	System.out.println( i+ ":" +c );//�v�Z�񐔏o��

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

            double ans = kai.syori(0.0, 1.0, 0.0001);//(���_,�����l,�͈͌덷)

    		System.out.println("\n�ߎ���:" +ans);// ���ʕ\��
        }
}
