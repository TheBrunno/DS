
public class Calculadora {
	double n1;
	double n2;
	double res;
	
	public void som() {
		res = n1+n2;
	}
	public double som(double n1, double n2) {
		res = n1+n2;
		return res;
	}
	public double sub() {
		res = n1-n2;
		return res;
	}
	public void sub(double n1, double n2) {
		res = n1-n2;
	}
	public void div() {
		res = n1/n2;
	}
	public double div(double n1, double n2) {
		res = n1/n2;
		return res;
	}
	public double mut() {
		res = n1*n2;
		return res;
	}
	public void mut(double n1, double n2) {
		res = n1*n2;
	}
}
