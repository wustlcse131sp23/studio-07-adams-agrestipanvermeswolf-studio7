package studio7;

public class HockeyPlayer {

	String name = "";
	int jersey = 0;
	boolean shootRight;
	boolean handedRight;

	public HockeyPlayer(String a, int b, boolean c, boolean d) {
		name = a;
		jersey = b;
		shootRight = c;
		handedRight = d;
	}

	public void stats() {
		System.out.println("Player name: "+name);
		System.out.println("Jersey no. : "+jersey);
		if(shootRight) {
			System.out.println("Shoots: Right");

		}
		else {

			System.out.println("Shoots: Left");
		}
		if(handedRight) {
			System.out.println("Handed: Right");

		}
		else {

			System.out.println("Handed: Left");
		}
		
		System.out.println("Goals: "+(int) (Math.random()*10));

	}
}

