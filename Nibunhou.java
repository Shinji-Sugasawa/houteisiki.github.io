package houteisiki;

public class Nibunhou {

	double func_y(double x){
        return Math.pow(x, 3)+ x -1.0;//���߂���������
    }//Math.pow(x.�w��)�@���� x�̎w�����\���Ă���B

    double syori(double a, double b, double eps){
        int i=1;
        double c=.0;

        while(Math.abs(a-b)>eps) {

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

            double eps = 0.0001;//���e�덷 //��0.000001;
            double a = 0.0, b = 1.0;

            double ans = kai.syori(a, b, eps);//(�����l,���e�덷)

    		System.out.println("\n�ߎ���:" +ans);// ���ʕ\��
        }
}
