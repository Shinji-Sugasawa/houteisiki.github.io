package houteisiki;

public class Nibunhou {

	double func_y(double x)
    {
        return x*x*x + x -1.0;//���߂���������
    }

    double calc(double a, double b, double eps)
    {
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

        public static void main (String[] args) throws java.lang.Exception
        {
            Nibunhou bm = new Nibunhou();
          //(���_,�����l,�͈͌덷)
            double ans = bm.calc(0.0, 1.0, 0.0001);

    		System.out.println("\n�ߎ���:" +ans);//�v�Z�񐔏o��
        }
}
