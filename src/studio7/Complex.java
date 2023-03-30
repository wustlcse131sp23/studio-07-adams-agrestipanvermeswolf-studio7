package studio7;

public class Complex {
	
	double real1 = 0;
	double real2 = 0;
	double imaginary1 = 0;
	double imaginary2 = 0;
	
	public Complex(double r1, double r2, double ig1, double ig2) {
		real1 = r1;
		real2 = r2;
		imaginary1 = ig1; 
		imaginary2 = ig2;
	}
	
	public String define() {
		return real1+"+"+imaginary1+"i";
	}
	
	public String add() {
		return (real1+real2)+"+"+(imaginary1+imaginary2)+"i";
	}
	public String multiply() {
		return ((real1*real2)-(imaginary1*imaginary2))+"+"+((real1*imaginary2)+(real2*imaginary1))+"i";
	}
}
