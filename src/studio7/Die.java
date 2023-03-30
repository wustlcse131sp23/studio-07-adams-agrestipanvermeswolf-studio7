package studio7;

public class Die {
	
	int n = 0;
	
	public Die(int num) {
		n = num;
	}
	
	public int roll() {
		return (int) (Math.random()*n+1);
	}
	
	
}
