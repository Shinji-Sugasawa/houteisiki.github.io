package houteisiki;

public class Newton {

	double func_y(double x) {

        return Math.pow(x, 3)+ x -1.0;//���߂���������
	}
	double func_z(double x) {

		return 3.0*x*x + 1.0;
	}
	double syori(double a, double eps) {
		int i = 1;
		double b = .0;

		while(0<i) {
			b = a-func_y(a) / func_z(a);

        	System.out.println( i+ ":" + b );//�v�Z�o��

			if( Math.abs( b - a ) < eps) {

	        	System.out.println("\n�ߎ���" + b );//���ʕ\��
				break;
			}
			else{
				a = b;
			}
			i++;
		}
		return b;
	}
	public static void main (String[] args){
        Newton kai = new Newton();

        double eps = 0.0001;//���e�덷 //��0.000001;
        double a = 1.0;

        double ans = kai.syori(a, eps);// �����v�Z(�����l, ��������)
    }
}
