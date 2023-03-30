package studio7;

public class Fraction {

	int num1 = 0;
	int denom1 = 0;
	
	int num2 = 0;
	int denom2 = 0;

	public Fraction (int x, int y, int a, int b) {
		num1 = x;
		denom1 = y;
		num2 = a;
		denom2 = b;
	}

	public String add() {

		return ( ((num1 * denom2) + (num2 * denom1)) + "/" + (denom1*denom2));
		
	}

	public String multiply() {
		return ( ((num1 * num2)) + "/" + (denom1*denom2));
	}

	public String reciprocal() {

		return denom1 + "/" + num1;
		
	}

}
