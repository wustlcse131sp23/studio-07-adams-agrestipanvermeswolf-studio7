package studio7;

public class Studio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle object = new Rectangle(25,25);
		
		System.out.println("The area is: "+object.area());
		
		Die object1 = new Die(6);
		
		System.out.println("The roll is: "+object1.roll());
		System.out.println();
		
		Fraction object2 = new Fraction(3, 5, 2, 9);
		
		System.out.println("Added: "+object2.add());
		System.out.println("Multiplied: "+object2.multiply());
		System.out.println("Reciprocal of first: "+object2.reciprocal());
		System.out.println();
		
		Complex object3 = new Complex(2, 3, 5, 6);
		
		System.out.println("Added: "+object3.add());
		System.out.println("Multiplied: "+object3.multiply());
		System.out.println();
		
		HockeyPlayer object4 = new HockeyPlayer("David Wolf", 24, true, true);
		
		object4.stats();
		
	}

}
