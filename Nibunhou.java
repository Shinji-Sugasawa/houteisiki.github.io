package houteisiki;

public class Nibunhou {

	double func_y(double x)
    {
        return x*x*x + x -1.0;//���߂���������
    }

    double calc(double a, double b, double eps)
    {
        int i=0;
        double c=.0;

        while(!(Math.abs(a-b)<eps)) {
        	c = (a+b)/2.0;
            if(func_y(c) * func_y(a)<0) {
            	b = c;
            }
            else {
            	a = c;
            	}
            i++;
            if(i>=3) {
            	System.out.println( (i-2)+ ":" +c );//�v�Z�񐔏o��
            }

        }
        return i;
    }

        public static void main (String[] args) throws java.lang.Exception
        {
            Nibunhou bm = new Nibunhou();
          //(���_,�����l,�͈͌덷)
            double kaisu = bm.calc(0.0, 4.0, 0.0001);

        }
}
